package com.ylkget.pattern.behavior.snapshot.awt;

import com.ylkget.pattern.behavior.snapshot.awt.eidtor.Editor;
import com.ylkget.pattern.behavior.snapshot.awt.shapes.Circle;
import com.ylkget.pattern.behavior.snapshot.awt.shapes.CompoundShape;
import com.ylkget.pattern.behavior.snapshot.awt.shapes.Dot;
import com.ylkget.pattern.behavior.snapshot.awt.shapes.Rectangle;

import java.awt.*;


/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/31 09:23
 */
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
