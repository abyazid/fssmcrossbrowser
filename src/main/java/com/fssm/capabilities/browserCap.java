package com.fssm.capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class browserCap {


    public static DesiredCapabilities Capabilities(String platform, String version,
                                         String browserType, String browserVersion, String resolution)
    {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", platform);
        caps.setCapability("os_version", version);
        caps.setCapability("browser", browserType);
        caps.setCapability("browser_version", browserVersion);
        caps.setCapability("resolution", resolution);
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");
        return caps;
    }
}
