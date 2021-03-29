package com.ylkget.pattern.structure.adapter.square;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/29 10:19
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
