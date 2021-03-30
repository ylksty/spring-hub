package com.ylkget.pattern.behavior.command.edit.commands;

import com.ylkget.pattern.behavior.command.edit.editor.Editor;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 10:56
 */
public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
