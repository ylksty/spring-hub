package com.ylkget.pattern.structure.composite.paint;

import com.ylkget.pattern.structure.composite.paint.editor.ImageEditor;
import com.ylkget.pattern.structure.composite.paint.shapes.Circle;
import com.ylkget.pattern.structure.composite.paint.shapes.CompoundShape;
import com.ylkget.pattern.structure.composite.paint.shapes.Dot;
import com.ylkget.pattern.structure.composite.paint.shapes.Rectangle;

import java.awt.*;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/29 19:12
 */
public class Client {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.RED),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
