package com.artbeatte.rain.level.tile;

import com.artbeatte.rain.graphics.Screen;
import com.artbeatte.rain.graphics.Sprite;

/**
 * @author art.beatte
 * @version 9/3/15
 */
public class GrassTile extends Tile {

    public GrassTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x, y, this);
    }
}
