/* Copyright (c) 2021 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License.
 */

package org.apache.flink.connector.nebula.utils;

public enum SSLSighType {
    /**
     * CA sign
     */
    CA("ca"),

    /**
     * SELF sign
     */
    SELF("self");

    private String type;

    SSLSighType(String type) {
        this.type = type;
    }
}
