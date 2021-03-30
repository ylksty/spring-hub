package com.ylkget.pattern.behavior.command.edit.commands;

import java.util.Stack;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 10:50
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
