package com.artbeatte.rain.level.tile.spawn_level;

import com.artbeatte.rain.graphics.Screen;
import com.artbeatte.rain.graphics.Sprite;
import com.artbeatte.rain.level.tile.Tile;

/**
 * @author art.beatte
 * @version 9/4/15
 */
public class SpawnWaterTile extends Tile {

    public SpawnWaterTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, sprite);
    }
}
