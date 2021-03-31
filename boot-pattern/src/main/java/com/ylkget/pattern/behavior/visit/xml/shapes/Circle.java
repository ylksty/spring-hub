package com.ylkget.pattern.behavior.visit.xml.shapes;

import com.ylkget.pattern.behavior.visit.xml.visitor.Visitor;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/31 09:03
 */
public class Circle extends Dot {
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
