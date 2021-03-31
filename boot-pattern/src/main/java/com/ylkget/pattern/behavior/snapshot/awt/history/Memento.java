package com.ylkget.pattern.behavior.snapshot.awt.history;

import com.ylkget.pattern.behavior.snapshot.awt.eidtor.Editor;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/31 09:36
 */
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
