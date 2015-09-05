package com.artbeatte.rain.entity.projectile;

import com.artbeatte.rain.entity.Entity;
import com.artbeatte.rain.graphics.Sprite;

/**
 * @author art.beatte
 * @version 9/4/15
 */
public abstract class Projectile extends Entity {

    protected final int xOrigin, yOrigin;
    protected double angle;
    protected Sprite sprite;
    protected double nx, ny;
    protected double speed, rateOfFire, range, damage;

    public Projectile(int x, int y, double dir) {
        xOrigin = x;
        yOrigin = y;
        angle = dir;
        this.x = x;
        this.y = y;
    }
}
