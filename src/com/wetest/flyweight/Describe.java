package com.wetest.flyweight;

/**
 * Created by wangjianqiang on 2017/9/8.
 */
public class Describe {

    private int x;
    private int y;
    private int size;


    public Describe() {
    }

    public Describe(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Describe{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                '}';
    }
}
