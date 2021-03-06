package com.artbeatte.rain.graphics;

import com.artbeatte.rain.entity.projectile.Projectile;
import com.artbeatte.rain.level.tile.Tile;

import java.util.Random;

/**
 * @author art.beatte
 * @version 5/25/15
 */
public class Screen {

    public int width, height;
    public int[] pixels;
    public final int MAP_SIZE = 64;
    public final int MAP_SIZE_MASK = MAP_SIZE - 1;
    public int xOffset, yOffset;
    public int[] tiles = new int[MAP_SIZE * MAP_SIZE];
    private Random random = new Random();

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];

        for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
            tiles[i] = random.nextInt(0xffffff);
        }

    }

    public void clear() {
        for (int i = 0; i < pixels.length; i ++) {
            pixels[i] = 0;
        }
    }

    public void renderTile(int xp, int yp, Tile tile) {
        xp -= xOffset;
        yp -= yOffset;
        for (int y = 0; y < tile.sprite.SIZE; y ++) {
            int ya = y + yp;
            for (int x = 0; x < tile.sprite.SIZE; x ++) {
                int xa = x + xp;
                if (xa < -tile.sprite.SIZE || xa >= width || ya < 0 || ya >= height) break;
                if (xa <0) xa = 0;
                pixels[xa + ya * width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];
            }
        }
    }

    public void renderProjectile(int xp, int yp, Projectile p) {
        xp -= xOffset;
        yp -= yOffset;
        for (int y = 0; y < p.getSize(); y ++) {
            int ya = y + yp;
            for (int x = 0; x < p.getSize(); x ++) {
                int xa = x + xp;
                if (xa < -p.getSize() || xa >= width || ya < 0 || ya >= height) break;
                if (xa <0) xa = 0;
                int col = p.getSprite().pixels[x + y * p.getSprite().SIZE];
                if (col != 0xffff00ff) pixels[xa + ya * width] = col;
            }
        }
    }

    public void renderPlayer(int xp, int yp, Sprite sprite, int flip) {
        xp -= xOffset;
        yp -= yOffset;
        for (int y = 0; y < 32; y ++) {
            int ya = y + yp;
            int ys = y;
            if (flip == 2 || flip == 3) {
                ys = 31 - y;
            }
            for (int x = 0; x < 32; x ++) {
                int xa = x + xp;
                int xs = x;
                if (flip == 1 || flip == 3) {
                    xs = 31 - x;
                }
                if (xa < -32 || xa >= width || ya < 0 || ya >= height) break;
                if (xa <0) xa = 0;
                int col = sprite.pixels[xs + ys * 32];
                if (col != 0xffff00ff) {
                    pixels[xa + ya * width] = col;
                }
            }
        }
    }

    public void setoffset(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }
}
