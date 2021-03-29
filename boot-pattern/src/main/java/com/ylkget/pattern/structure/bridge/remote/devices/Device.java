package com.ylkget.pattern.structure.bridge.remote.devices;

/**
 * <p>
 * $
 * </p>
 *
 * @author joe 2021-03-29 17:04
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
