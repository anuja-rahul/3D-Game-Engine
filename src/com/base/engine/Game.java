package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {

    private Mesh mesh;
    private Shader shader;

    public Game() {
        mesh = new Mesh();
        shader = new Shader();

        Vertex[] data = new Vertex[] {
                new Vertex(new Vector3f(-1, -1, 0)),
                new Vertex(new Vector3f(0, 1, 0)),
                new Vertex(new Vector3f(1, -1, 0))
        };

        mesh.addVertices(data);

        shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vs"));
        shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.fs"));

        shader.compileShader();

        shader.addUniform("uniformFloat");
    }

    float temp = 0.0f;

    public void update() {
        temp += (float) Time.getDelta();

        shader.setUniformf("uniformFloat", (float) Math.sin(temp));
    }

    public void render() {
        shader.bind();
        mesh.draw();
    }
}
