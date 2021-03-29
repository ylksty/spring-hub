package com.ylkget.pattern.structure.adapter.adapters;

import com.ylkget.pattern.structure.adapter.round.RoundPeg;
import com.ylkget.pattern.structure.adapter.square.SquarePeg;

/**
 * <p>
 * Adapter allows fitting square pegs into round holes.
 * </p>
 *
 * @author joe 2021/3/29 10:20
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // 重写用于适配的方法
    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
