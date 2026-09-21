package com.team9470;

import com.team254.lib.drivers.CanDeviceId;

public class Ports {

    public static final String CANIVORE = "domain expansion: can bus";


    public static final int INTAKE_BREAK = 0;
    public static final CanDeviceId PIVOT = new CanDeviceId(4, CANIVORE);
    public static final CanDeviceId ROLLERS = new CanDeviceId(0, CANIVORE);
}
