package com.wixpress.automation.webdriver.config;

public class WebDriverConfig {

    private static WebDriverConfig INSTANCE;

    public static WebDriverConfig getInstance() {

        if (INSTANCE == null)
            INSTANCE = new WebDriverConfig();

        return INSTANCE;
    }

    public static void fillConfig(WebDriverConfig config) {
        INSTANCE = config;
    }

    public static class WebDriverConfigBuilder {
        private final WebDriverConfig webDriverConfig = new WebDriverConfig();

        public WebDriverConfigBuilder withWebDriverType(String webDriverType) {
            this.webDriverConfig.webDriverType = webDriverType;
            return this;
        }

        public WebDriverConfigBuilder withRunOn(String runOn) {
            this.webDriverConfig.runOn = runOn;
            return this;
        }

        public WebDriverConfigBuilder withStrategyType(String strategyType) {
            this.webDriverConfig.strategyType = strategyType;
            return this;
        }

        public WebDriverConfigBuilder withNumberOfThreads(String numberOfThreads) {
            this.webDriverConfig.numberOfThreads = numberOfThreads;
            return this;
        }

        public WebDriverConfigBuilder withWebDriverRecycleLimit(String webDriverRecycleLimit) {
            this.webDriverConfig.webDriverRecycleLimit = webDriverRecycleLimit;
            return this;
        }

        public WebDriverConfigBuilder withSeleniumVersion(String seleniumVersion) {
            this.webDriverConfig.seleniumVersion = seleniumVersion;
            return this;
        }

        public WebDriverConfigBuilder withPlatform(String platform) {
            this.webDriverConfig.platform = platform;
            return this;
        }

        public WebDriverConfigBuilder withBuildName(String buildName) {
            this.webDriverConfig.buildName = buildName;
            return this;
        }

        public WebDriverConfigBuilder withBuildNumber(String buildNumber) {
            this.webDriverConfig.buildNumber = buildNumber;
            return this;
        }

        public WebDriverConfigBuilder withBuildNumber(Boolean shouldUseBinariesManagerLocally) {
            this.webDriverConfig.shouldUseBinariesManagerLocally = shouldUseBinariesManagerLocally;
            return this;
        }

        public WebDriverConfigBuilder withChromeVersion(String chromeVersion) {
            this.webDriverConfig.chromeVersion = chromeVersion;
            return this;
        }

        public WebDriverConfigBuilder withChromeDriverVersion(String chromeDriverVersion) {
            this.webDriverConfig.chromeDriverVersion = chromeDriverVersion;
            return this;
        }

        public WebDriverConfigBuilder withFirefoxVersion(String firefoxVersion) {
            this.webDriverConfig.firefoxVersion = firefoxVersion;
            return this;
        }

        public WebDriverConfigBuilder withFirefoxDriverVersion(String firefoxDriverVersion) {
            this.webDriverConfig.firefoxDriverVersion = firefoxDriverVersion;
            return this;
        }

        public WebDriverConfigBuilder withSafariVersion(String safariVersion) {
            this.webDriverConfig.safariVersion = safariVersion;
            return this;
        }

        public WebDriverConfigBuilder withIEVersion(String ieVersion) {
            this.webDriverConfig.ieVersion = ieVersion;
            return this;
        }

        public WebDriverConfigBuilder withIEDriverVersion(String ieDriverVersion) {
            this.webDriverConfig.ieDriverVersion = ieDriverVersion;
            return this;
        }

        public WebDriverConfigBuilder withEdgeVersion(String edgeVersion) {
            this.webDriverConfig.edgeVersion = edgeVersion;
            return this;
        }

        public WebDriverConfigBuilder withEdgeWebDriverPath(String edgeWebDriverPath) {
            this.webDriverConfig.edgeWebDriverPath = edgeWebDriverPath;
            return this;
        }

        public WebDriverConfigBuilder withAppiumVersion(String appiumVersion) {
            this.webDriverConfig.appiumVersion = appiumVersion;
            return this;
        }

        public WebDriverConfigBuilder withIOSPlatformVersion(String iosPlatformVersion) {
            this.webDriverConfig.iOSPlatformVersion = iosPlatformVersion;
            return this;
        }

        public WebDriverConfigBuilder withIOSDeviceName(String iosDeviceName) {
            this.webDriverConfig.iOSDeviceName = iosDeviceName;
            return this;
        }

        public WebDriverConfigBuilder withAndroidPlatformVersion(String androidPlatformVersion) {
            this.webDriverConfig.androidPlatformVersion = androidPlatformVersion;
            return this;
        }

        public WebDriverConfigBuilder withAndroidDeviceName(String androidDeviceName) {
            this.webDriverConfig.androidDeviceName = androidDeviceName;
            return this;
        }

        public WebDriverConfigBuilder withMobileApplicationPath(String mobileApplicationPath) {
            this.webDriverConfig.mobileApplicationPath = mobileApplicationPath;
            return this;
        }

        public WebDriverConfigBuilder withLanguageCode(String languageCode) {
            this.webDriverConfig.languageCode = languageCode;
            return this;
        }

        public WebDriverConfigBuilder withScreenResolution(String screenResolution) {
            this.webDriverConfig.screenResolution = screenResolution;
            return this;
        }

        public WebDriverConfigBuilder withHeadlessMode(Boolean headlessMode ) {
            this.webDriverConfig.headlessMode = headlessMode;
            return this;
        }

        public WebDriverConfigBuilder withMobileUserAgent(Boolean mobileUserAgent) {
            this.webDriverConfig.mobileUserAgent = mobileUserAgent;
            return this;
        }

        public WebDriverConfigBuilder withEnabledWebDriverLogging(Boolean enabledWebDriverLogging) {
            this.webDriverConfig.enableWebDriverLogging = enabledWebDriverLogging;
            return this;
        }

        public WebDriverConfigBuilder withCloudService(String cloudService) {
            this.webDriverConfig.cloudService = cloudService;
            return this;
        }

        public WebDriverConfigBuilder withCloudUserName(String cloudUserName) {
            this.webDriverConfig.cloudUserName = cloudUserName;
            return this;
        }

        public WebDriverConfigBuilder withCloudUserPass(String cloudUserPass) {
            this.webDriverConfig.cloudUserPassword = cloudUserPass;
            return this;
        }

        public WebDriverConfig build() {
            return webDriverConfig;
        }
    }

    private String webDriverType;
    private String runOn;
    private String strategyType;

    private String numberOfThreads;
    private String webDriverRecycleLimit;

    private String seleniumVersion;
    private String platform;
    private String buildName;
    private String buildNumber;
    private Boolean shouldUseBinariesManagerLocally;

    private String chromeVersion;
    private String chromeDriverVersion;
    private String firefoxVersion;
    private String firefoxDriverVersion;
    private String safariVersion;
    private String ieVersion;
    private String ieDriverVersion;
    private String edgeVersion;
    private String edgeWebDriverPath;

    private String appiumVersion;
    private String iOSPlatformVersion;
    private String iOSDeviceName;
    private String androidPlatformVersion;
    private String androidDeviceName;
    private String mobileApplicationPath;

    private String languageCode;
    private String screenResolution;
    private Boolean headlessMode;
    private Boolean mobileUserAgent;
    private Boolean enableWebDriverLogging;

    private String cloudService;
    private String cloudUserName;
    private String cloudUserPassword;

    private WebDriverConfig() {
    }

    public String getWebDriverType() {
        return getValueOrDefault(webDriverType, "chrome");
    }

    public String getRunOn() {
        return getValueOrDefault(runOn, "local");
    }

    public String getStrategyType() {
        return getValueOrDefault(strategyType, "new_instance");
    }

    public Integer numberOfThreads() {
        return Integer.parseInt(getValueOrDefault(numberOfThreads, "10"));
    }

    public Integer webDriverRecycleLimit() {
        return Integer.parseInt(getValueOrDefault(webDriverRecycleLimit, "100"));
    }

    public String getSeleniumVersion() {
        return getValueOrDefault(seleniumVersion, "");
    }

    public String getPlatform() {
        return getValueOrDefault(platform, "");
    }

    public String getBuildName() {
        return getValueOrDefault(buildName, "Local");
    }

    public String getBuildNumber() {
        return getValueOrDefault(buildNumber, "");
    }

    public Boolean shouldUseBinariesManagerLocally() {
        return getValueOrDefault(shouldUseBinariesManagerLocally, false);
    }

    public String getChromeVersion() {
        return getValueOrDefault(chromeVersion, "");
    }

    public String getChromeDriverVersion() {
        return getValueOrDefault(chromeDriverVersion, "");
    }

    public String getFirefoxVersion() {
        return getValueOrDefault(firefoxVersion, "");
    }

    public String getFirefoxDriverVersion() {
        return getValueOrDefault(firefoxDriverVersion, "");
    }

    public String getSafariVersion() {
        return getValueOrDefault(safariVersion, "");
    }

    public String getIEVersion() {
        return getValueOrDefault(ieVersion, "");
    }

    public String getIEDriverVersion() {
        return getValueOrDefault(ieDriverVersion, "");
    }

    public String getEdgeVersion() {
        return getValueOrDefault(edgeVersion, "");
    }

    public String getEdgeWebDriverPath() {
        return getValueOrDefault(edgeWebDriverPath, "");
    }

    public String getAppiumVersion() {
        return getValueOrDefault(appiumVersion, "");
    }

    public String getIOSPlatformVersion() {
        return getValueOrDefault(iOSPlatformVersion, "");
    }

    public String getIOSDeviceName() {
        return getValueOrDefault(iOSDeviceName, "");
    }

    public String getAndroidPlatformVersion() {
        return getValueOrDefault(androidPlatformVersion, "");
    }

    public String getAndroidDeviceName() {
        return getValueOrDefault(androidDeviceName, "");
    }

    public String getMobileApplicationPath() {
        return getValueOrDefault(mobileApplicationPath, "");
    }

    public Boolean isHeadlessMode() {
        return getValueOrDefault(headlessMode, false);
    }

    public Boolean isMobileUserAgent() {
        return getValueOrDefault(mobileUserAgent, false);
    }

    public Boolean isEnableWebDriverLogging() {
        return getValueOrDefault(enableWebDriverLogging, true);
    }

    public String getScreenResolution() {
        return getValueOrDefault(screenResolution, "");
    }

    public String getLanguageCode() {
        return getValueOrDefault(languageCode, "en");
    }

    public String getCloudService() {
        return getValueOrDefault(cloudService, "");
    }

    public String getCloudUserName() {
        return getValueOrDefault(cloudUserName, "");
    }

    public String getCloudPassword() {
        return getValueOrDefault(cloudUserPassword, "");
    }

    private String getValueOrDefault(String value, String defaultValue) {
        if (value == null || value.isEmpty())
            return defaultValue;
        else
            return value;
    }

    private Boolean getValueOrDefault(Boolean value, Boolean defaultValue) {
        if (value == null)
            return defaultValue;
        else
            return value;
    }
}
