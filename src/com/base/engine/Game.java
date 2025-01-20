package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {

    private Mesh mesh;
    private Shader shader;
    private Transform transform;

    public Game() {
        mesh = new Mesh();
        shader = new Shader();

        Vertex[] data = new Vertex[] {
                new Vertex(new Vector3f(-1, -1, 0)),
                new Vertex(new Vector3f(0, 1, 0)),
                new Vertex(new Vector3f(1, -1, 0))
        };

        mesh.addVertices(data);

        transform = new Transform();

        shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vert"));
        shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.frag"));

        shader.compileShader();

        shader.addUniform("transform");
    }

    float temp = 0.0f;

    public void update() {
        temp += (float) Time.getDelta();

         transform.setTranslation((float) Math.sin(temp), 0, 0);
        // shader.setUniformf("transform", (float) Math.abs(Math.sin(temp)));
        transform.setRotation(0, 0, (float) Math.sin(temp) * 180);
    }

    public void render() {
        shader.bind();
        shader.setUniform("transform", transform.getTransformation());
        mesh.draw();
    }
}
