package com.artbeatte.rain.entity.projectile;

import com.artbeatte.rain.graphics.Screen;
import com.artbeatte.rain.graphics.Sprite;

/**
 * @author art.beatte
 * @version 9/4/15
 */
public class WizardProjectile extends Projectile {

    public static final int FIRE_RATE = 10; // Higher is slower!

    public WizardProjectile(int x, int y, double dir) {
        super(x, y, dir);
        range = 200;
        speed = 4;
        damage = 20;
        sprite = Sprite.projectile_wizard;
        nx = speed * Math.cos(angle);
        ny = speed * Math.sin(angle);
    }

    public void update() {
        if (level.tileCollision(x, y, nx, ny, 7)) remove();
        move();
    }

    protected void move() {
        x += nx;
        y += ny;
        if (distance() > range) remove();
    }

    private double distance() {
        double dist = 0;
        dist = Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x) + (yOrigin - y) * (yOrigin - y)));
        return dist;
    }

    public void render(Screen screen) {
        screen.renderProjectile((int) x - 12, (int) y - 2, this);
    }
}
