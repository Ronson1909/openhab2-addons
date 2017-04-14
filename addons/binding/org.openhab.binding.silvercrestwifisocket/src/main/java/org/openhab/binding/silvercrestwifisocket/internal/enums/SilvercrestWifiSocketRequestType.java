/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.silvercrestwifisocket.internal.enums;

/**
 * This enum represents the available Wifi Socket request types.
 *
 * @author Jaime Vaz - Initial contribution
 * @author Christian Heimerl - added slave commands
 *
 */
public enum SilvercrestWifiSocketRequestType {
    /** Request ON. */
    ON("010000FFFF04040404"),
    /** Request OFF. */
    OFF("01000000FF04040404"),
    /** Request Status. */
    GPIO_STATUS("020000000004040404"),
    /** Discover socket. The command has one placeholder for the mac address. */
    DISCOVERY("23%s0202"),
    /** Request ON for slave address (mentioned as placeholder %s). */
    SLAVE_ON("08%s6004040404"),
    /** Request OFF for slave address (mentioned as placeholder %s). */
    SLAVE_OFF("08%s7004040404");

    private String command;

    private SilvercrestWifiSocketRequestType(final String command) {
        this.command = command;
    }

    /**
     * Gets the hexadecimal command/format for include in request messages.
     *
     * @return the hexadecimal command/format
     */
    public String getCommand() {
        return this.command;
    }
}
