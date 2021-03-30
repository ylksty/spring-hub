package com.ylkget.pattern.behavior.command.edit.commands;

import com.ylkget.pattern.behavior.command.edit.editor.Editor;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 10:54
 */
public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
