package com.ylkget.pattern.behavior.iterator.spammer.iterators;

import com.ylkget.pattern.behavior.iterator.spammer.profile.Profile;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 18:42
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
