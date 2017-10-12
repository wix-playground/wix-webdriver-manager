package com.wixpress.automation.webdriver.enums;

public enum WebDriverType {
    CHROME,
    FIREFOX,
    EXPLORER,
    EDGE,
    SAFARI,
    IOS,
    ANDROID;

    public static WebDriverType fromString(String webDriverType) {
        try {
            return valueOf(webDriverType.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(String.format("browser type '%s' is not supported", webDriverType), e);
        }
    }

    public boolean isMobile() {
        return equals(ANDROID) || equals(IOS);
    }
}
