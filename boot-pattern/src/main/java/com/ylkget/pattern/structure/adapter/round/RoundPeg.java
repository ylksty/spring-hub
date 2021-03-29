package com.ylkget.pattern.structure.adapter.round;

/**
 * <p>
 * RoundPegs are compatible with RoundHoles.
 * </p>
 *
 * @author joe 2021/3/29 10:18
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
