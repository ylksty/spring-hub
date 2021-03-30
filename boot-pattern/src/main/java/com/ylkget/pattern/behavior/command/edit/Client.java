package com.ylkget.pattern.behavior.command.edit;

import com.ylkget.pattern.behavior.command.edit.editor.Editor;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/30 10:46
 */
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
