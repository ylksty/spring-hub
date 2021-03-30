package com.ylkget.pattern.behavior.mediator.note.components;

import com.ylkget.pattern.behavior.mediator.note.mediator.Mediator;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 21:10
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
