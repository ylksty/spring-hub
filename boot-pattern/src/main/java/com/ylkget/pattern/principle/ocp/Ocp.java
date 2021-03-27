package com.ylkget.pattern.principle.ocp;

/**
 * <p>
 * Ocp
 * </p>
 *
 * @author joe 2021/3/26 16:42
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
    }

    static class GraphicEditor {
        public void drawShape(Shape shape) {
            shape.draw();
        }
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("画圆形！");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("画矩形！");
        }
    }
    static abstract class Shape {
        abstract void draw();
    }
}
