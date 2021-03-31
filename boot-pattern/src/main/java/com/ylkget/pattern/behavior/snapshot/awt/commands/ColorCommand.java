package com.ylkget.pattern.behavior.snapshot.awt.commands;

import com.ylkget.pattern.behavior.snapshot.awt.eidtor.Editor;
import com.ylkget.pattern.behavior.snapshot.awt.shapes.Shape;

import java.awt.*;


/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/31 09:26
 */
public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
