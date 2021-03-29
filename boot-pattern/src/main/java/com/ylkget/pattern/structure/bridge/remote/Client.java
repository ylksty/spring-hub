package com.ylkget.pattern.structure.bridge.remote;

import com.ylkget.pattern.structure.bridge.remote.devices.Device;
import com.ylkget.pattern.structure.bridge.remote.devices.Radio;
import com.ylkget.pattern.structure.bridge.remote.devices.Tv;
import com.ylkget.pattern.structure.bridge.remote.remotes.AdvancedRemote;
import com.ylkget.pattern.structure.bridge.remote.remotes.BasicRemote;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/29 16:51
 */
public class Client {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
