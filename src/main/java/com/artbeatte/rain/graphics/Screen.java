package com.artbeatte.rain.graphics;

/**
 * @author art.beatte
 * @version 5/25/15
 */
public class Screen {

    private int width, height;
    public int[] pixels;

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
    }
}