package com.base.engine;

public class Vector3f {
    private float x;
    private float y;
    private float z;

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float length() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public float dot(Vector3f v) {
        return x * v.getX() + y * v.getY() + z * v.getZ();
    }

    public Vector3f cross(Vector3f v) {
        float x_ = y * v.getZ() -  z * v.getY();
        float y_ = z * v.getX() -  x * v.getZ();
        float z_ = x * v.getY() -  y * v.getX();

        return new Vector3f(x_, y_, z_);
    }

    public Vector3f normalize() {
        float len = length();

        x /= len;
        y /= len;
        z /= len;

        return this;
    }

    public Vector3f rotate(float angle) {
        float cos = (float) Math.cos(angle);
        float sin = (float) Math.sin(angle);

        return null;
    }

    public Vector3f add(Vector3f v) {
        return new Vector3f(x + v.getX(), y + v.getY(), z + v.getZ());
    }

    public Vector3f add(float r) {
        return new Vector3f(x + r, y + r, z + r);
    }

    public Vector3f sub(Vector3f v) {
        return new Vector3f(x - v.getX(), y - v.getY(), z - v.getZ());
    }

    public Vector3f sub(float r) {
        return new Vector3f(x - r, y - r, z - r);
    }

    public Vector3f mul(Vector3f v) {
        return new Vector3f(x * v.getX(), y * v.getY(), z * v.getZ());
    }

    public Vector3f mul(float r) {
        return new Vector3f(x * r, y * r, z * r);
    }

    public Vector3f div(Vector3f v) {
        return new Vector3f(x / v.getX(), y / v.getY(), z / v.getZ());
    }

    public Vector3f div(float r) {
        return new Vector3f(x / r, y / r, z / r);
    }

    public String toString() {
        return "(" + x + " " + y + " " + z + ")";
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
