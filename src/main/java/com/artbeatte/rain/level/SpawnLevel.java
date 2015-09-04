package com.artbeatte.rain.level;

import com.artbeatte.rain.level.tile.Tile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author art.beatte
 * @version 9/3/15
 */
public class SpawnLevel extends Level {

    private Tile[] tiles;
    private int[] levelPixels;

    public SpawnLevel(String path) {
        super(path);
    }

    protected void loadLevel(String path) {
        try {
            BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
            int w = image. getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, levelPixels, 0, w);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception! Could not load lavel file!");
        }
    }

    protected void generateLevel() {
        
    }
}
