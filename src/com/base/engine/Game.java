package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {
    public Game() {}

    public void input() {
        if (Input.getKeyDown(Keyboard.KEY_UP)) {
            System.out.println("Pressed UP");
        }
        if (Input.getKeyUp(Keyboard.KEY_UP)) {
            System.out.println("Released UP");
        }

        if (Input.getMouseDown(1)) {
            System.out.println("Pressed right mouse button at " + Input.getMousePosition());
        }
        if (Input.getMouseUp(1)) {
            System.out.println("Released right mouse button");
        }
    }
    public void update() {}
    public void render() {}
}
