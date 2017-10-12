package com.wixpress.automation.webdriver.strategy;

import com.wixpress.automation.webdriver.factory.WebDriverFactory;
import org.apache.xml.utils.ObjectPool;
import org.openqa.selenium.WebDriver;

public class RecycledWebDriverStrategy implements WebDriverStrategy {

    private final WebDriverFactory webDriverFactory;

    public RecycledWebDriverStrategy(WebDriverFactory webDriverFactory) {
        this.webDriverFactory = webDriverFactory;
    }

    @Override
    public WebDriver get() {
        return null;
    }

    @Override
    public void release(WebDriver webDriver) {
    }

    @Override
    public WebDriver recover(WebDriver webDriver) {
        return null;
    }

    @Override
    public void destroy() {
    }
}
