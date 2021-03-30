package com.ylkget.pattern.behavior.mediator.note.mediator;

import com.ylkget.pattern.behavior.mediator.note.components.Component;

import javax.swing.*;

/**
 * <p>
 * $
 * </p>
 *
 * @author joe 2021-03-30 21:09
 */
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
