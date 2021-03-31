package com.ylkget.pattern.behavior.visit.xml;

import com.ylkget.pattern.behavior.visit.xml.shapes.*;
import com.ylkget.pattern.behavior.visit.xml.visitor.XMLExportVisitor;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/31 09:00
 */
public class Client {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
