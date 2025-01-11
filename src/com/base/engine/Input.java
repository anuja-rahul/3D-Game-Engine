package com.base.engine;

import org.lwjgl.input.Keyboard;

import java.util.ArrayList;

public class Input {

    public static final int NUM_KEYCODES = 256;
    private static ArrayList<Integer> currentKeys =  new ArrayList<Integer>();
    private static ArrayList<Integer> downKeys =  new ArrayList<Integer>();

    public static void update() {

        for (int i = 0; i < NUM_KEYCODES; i++) {
            if (getKey(i) && !currentKeys.contains(i)) {
                downKeys.add(i);
            }
        }

        currentKeys.clear();
        for (int i = 0; i < NUM_KEYCODES; i++) {
            if (getKey(i)) {
                currentKeys.add(i);
            }
        }
    }

    public static boolean getKey(int keyCode) {
        return Keyboard.isKeyDown(keyCode);
    }

    public static boolean getKeyDown(int keyCode) {

    }
}
