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

    public void move() {
    }

    public void update() {
    }

    private boolean collision() {
        return false;
    }
}
