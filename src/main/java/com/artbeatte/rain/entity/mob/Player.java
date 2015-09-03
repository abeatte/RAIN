package com.artbeatte.rain.entity.mob;

import com.artbeatte.rain.input.Keyboard;

/**
 * @author art.beatte
 * @version 9/3/15
 */
public class Player extends Mob {

    private Keyboard input;

    public Player(Keyboard input) {
        this.input = input;
    }

    public Player(int x, int y, Keyboard input) {
        this.x = x;
        this.y = y;
        this.input = input;
    }

    public void update() {
        if (input.up) y--;
        if (input.down) y++;
        if (input.left) x--;
        if (input.right) x++;
    }

    public void render() {
    }
}
