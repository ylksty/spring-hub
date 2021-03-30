package com.ylkget.pattern.behavior.iterator.spammer.social_networks;

import com.ylkget.pattern.behavior.iterator.spammer.iterators.ProfileIterator;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 18:40
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
