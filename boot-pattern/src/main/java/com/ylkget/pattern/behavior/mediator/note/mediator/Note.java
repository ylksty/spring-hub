package com.ylkget.pattern.behavior.mediator.note.mediator;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 21:10
 */
public class Note {
    private String name;
    private String text;

    public Note() {
        name = "New note";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return name;
    }
}
