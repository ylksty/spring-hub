package com.ylkget.pattern.structure.adapter.round;

/**
 * <p>
 * RoundHoles are compatible with RoundPegs.
 * </p>
 *
 * @author joe 2021/3/29 10:15
 */
public class RoundHole {
    private double radius;
    public RoundHole(double radis) {
        this.radius = radis;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
