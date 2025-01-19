package com.base.engine;

import org.lwjgl.BufferUtils;

import java.nio.FloatBuffer;

public class Util {

    public static FloatBuffer createFloatBuffer(int size) {
        return BufferUtils.createFloatBuffer(size);
    }

    public static FloatBuffer createFlippedBuffer(Vertex[] vertices) {

        FloatBuffer buffer = createFloatBuffer(vertices.length * Vertex.SIZE);

        for (Vertex vertex : vertices) {
            buffer.put(vertex.getPosition().getX());
            buffer.put(vertex.getPosition().getY());
            buffer.put(vertex.getPosition().getZ());
        }
        buffer.flip();

        return buffer;
    }
}
