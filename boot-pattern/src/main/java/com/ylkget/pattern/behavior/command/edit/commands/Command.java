package com.ylkget.pattern.behavior.command.edit.commands;

import com.ylkget.pattern.behavior.command.edit.editor.Editor;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 10:47
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
