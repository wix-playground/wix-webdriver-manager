package com.wixpress.automation.webdriver.enums;

public enum RunOn {
    LOCAL,
    GRID,
    REMOTE,
    CLOUD;

    public static RunOn fromString(String value) {
        try {
            return valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(String.format("Run option '%s' is not supported", value), e);
        }
    }
}
