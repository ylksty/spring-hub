package com.ylkget.pattern.behavior.visit.xml.shapes;

import com.ylkget.pattern.behavior.visit.xml.visitor.Visitor;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/31 09:02
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
