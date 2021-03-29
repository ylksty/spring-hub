package com.ylkget.pattern.structure.composite.paint.shapes;

import java.awt.*;

/**
 * <p>
 * Shape$
 * </p>
 *
 * @author joe 2021-03-29 19:16
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
