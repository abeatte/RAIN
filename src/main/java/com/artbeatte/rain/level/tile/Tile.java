package com.artbeatte.rain.level.tile;

import com.artbeatte.rain.graphics.Screen;
import com.artbeatte.rain.graphics.Sprite;

/**
 * @author art.beatte
 * @version 9/3/15
 */
public class Tile {

    public int x, y;
    public Sprite sprite;

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    public void render(int x, int y, Screen screen) {
    }

    public boolean solid() {
        return false;
    }
}
