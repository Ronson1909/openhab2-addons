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
 * This enum represents the available Wifi Socket vendors.
 *
 * @author Christian Heimerl - Initial contribution
 *
 */
public enum SilvercrestWifiSocketVendor {
    Lidl_Silvercrest("C1", "7150"),
    Aldi_EasyHome("C2", "92DD");

    private String companyCode;
    private String authenticationCode;

    private SilvercrestWifiSocketVendor(final String companyCode, final String authenticationCode) {
        this.companyCode = companyCode;
        this.authenticationCode = authenticationCode;
    }

    /**
     * Gets the hexadecimal company code included in a request message.
     *
     * @return the hexadecimal company code
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Gets the hexadecimal authentication code included in a request message
     *
     * @return the hexadecimal authentication code
     */
    public String getAuthenticationCode() {
        return this.authenticationCode;
    }
}
