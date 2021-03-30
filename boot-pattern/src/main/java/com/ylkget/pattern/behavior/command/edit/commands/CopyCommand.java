package com.ylkget.pattern.behavior.command.edit.commands;

import com.ylkget.pattern.behavior.command.edit.editor.Editor;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 10:51
 */
public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
