
# Wix Webdriver Manager

Simple and powerful tool to manage (launching, closing) browsers for testing. 

## Features

* Run all main browsers   
* Run browsers locally, remotely or in cloud services   
* Re-use the same browser for all tests without re-starting it (Recycled WebDriver Strategy)   
* Run mobile browsers on iOS / Android (Appium Support)   
* Configure WebDriver as much as possible for your projects and needs

## Installation

```xml
<dependency>
    <groupId>com.wixpress.automation</groupId>
    <artifactId>wix-webdriver-manager</artifactId>
    <version>1.0.0</version>
</dependency>

```

## Usage

1. Quick Start

```java

    // Create an instance of WebDriverManager
    WebDriverManager wdm = new WebDriverManager();
    
    // Create new webDriver instance
    WebDriver webDriver = wdm.getAvailableWebDriver();
    
    // .....
    
    // Quit webDriver
    wdm..releaseWebDriver(webDriver);
```

2. Custom Configuration

```java

    // Create instance of config and fill it with required parameters
    WebDriverConfig config = new WebDrvierConfig.WebdriverConfigBuilder()
                                .withWebDriverType("firefox")
                                .withFirefoxVersion("55.0.4")
                                .withPlatform("Windows")
                                .withwithScreenResolution("1280x1024")
                                .withCloudService("sauce_labs")
                                .withCloudUserName(SL_USER_NAME)
                                .withCloudUserPAss(SL_USER_KEY)
                                .build();

    // Create an instance of WebDriverManager
    WebDriverManager wdm = new WebDriverManager(config);
    
    // Create new webDriver instance
    WebDriver webDriver = wdm.getAvailableWebDriver();
    
    // .....
    
    // Quit webDriver
    wdm..releaseWebDriver(webDriver);
```


## Options

Configuration of the manager can be done using WebDriverConfigBuilder.

### General Configuration

* **webDriverType** - specify, what browser to use. Default - Google Chrome.   
   Supported browser: Chrome, Firefox, Safari, Edge, Intern Explorer
* **runOn** - specify, on which environment to run browser. Default - local.   
   Supported envs: local, cloud (for cloud services, such as SauceLabs, BrowserStack, etc) 
* **strategyType** - specify, which strategy to use when launching/quiting browser.   
    Supported strategies: new_instance, recycled.
* **headlessMode** - specify if browser should be run in headless mode. Default -  false.   
    Chrome and Firefox support headless mode without any other third-party tools or configurations.
* **languageCode** - specify language code for Chrome configuration. Default - en.
* **enableWebDriverLogging** - enable/disable logging for Chrome. Default - true

### Remote and Cloud Services Configuration

* **seleniumVersion** - specify which Selenium version to use. Used for remote and cloud services
* **platform** - specify on which platform to run remote tests: Windows, Mac, Linux
* **buildName** - specify build name in cloud service
* **buildNumber** - specify build number in cloud service
* **shouldUseBinariesManagerLocally** - set to true if you want 
* **cloudService** - specify which cloud service to use for remote run.  
    Supported services: SauceLabs, BrowserStack
* **cloudUserName** - specify cloud service username
* **cloudUserPassword** - specify cloud service key 
* **screenResolution** - specify screen resolution for cloud service
* **chromeVersion** - specify Google Chrome version to use
* **chromeDriverVersion** - specify chromedriver version to use
* **firefoxVersion** - specify Mozilla Firefox version to use
* **firefoxDriverVersion** - specify geckodriver version to use
* **safariVersion** - specify Safari version to use
* **ieVersion** - specify Internet Explorer version to use
* **ieDriverVersion** - specify IEDriver version to use   
* **edgeVersion** - specify MS Edge version to use   
* **edgeWebDriverPath** - specify MS Edge driver path   
    
### Appium Configurations

* **appiumVersion**  - specify Appium version to use on cloud service
* **iOSDeviceName** - specify iOS Simulator Device Name. Mac users only. Specified simulator should be downloaded in Xcode  
* **iOSPlatformVersion** - specify iOS Platform Version. Mac users only. Specified platform should be downloaded in Xcode
* **androidDeviceName** - specify Android device name.   
* **androidPlatformVersion** - specify Android Platform Version
* **mobileApplicationPath** - specify absolute path to application binary. Will be used by Appium to install app on the device  



