package com.ylkget.pattern.structure.bridge.remote.remotes;

import com.ylkget.pattern.structure.bridge.remote.devices.Device;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/29 17:08
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
