package com.artbeatte.rain.entity;

import com.artbeatte.rain.graphics.Screen;
import com.artbeatte.rain.level.Level;

import java.util.Random;

/**
 * @author art.beatte
 * @version 9/3/15
 */
public abstract class Entity {

    public int x, y;
    private boolean removed = false;
    protected Level level;
    protected final Random random = new Random();

    public void update() {
    }

    public void render(Screen screen) {
    }

    public void remove() {
        // Remove from level
        removed = true;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void init(Level level) {
        this.level = level;
    }
}
