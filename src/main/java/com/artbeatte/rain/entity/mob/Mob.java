package com.artbeatte.rain.entity.mob;

import com.artbeatte.rain.entity.Entity;
import com.artbeatte.rain.graphics.Sprite;

/**
 * @author art.beatte
 * @version 9/3/15
 */
public abstract class Mob extends Entity {

    protected Sprite sprite;
    protected int dir = 0;
    protected boolean moving = false;

    public void move(int xa, int ya) {
        if (xa > 0) dir = 1;
        if (xa < 0) dir = 3;
        if (ya > 0) dir = 2;
        if (ya < 0) dir = 0;

        if (!collision()) {
            this.x += xa;
            this.y += ya;
        }
    }

    public void update() {
    }

    private boolean collision() {
        return false;
    }

    public void render() {
    }
}
