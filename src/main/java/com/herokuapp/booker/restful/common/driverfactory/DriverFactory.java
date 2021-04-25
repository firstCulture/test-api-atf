package com.herokuapp.booker.restful.common.driverfactory;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Slf4j
public class DriverFactory {

    public static final String CHROME = "chrome";
    public static final String IE = "ie";

    /**
     * Set capabilities for browsers
     *
     * @param browser chosen browser for running tests
     * @return  WebDriver
     */
    public static WebDriver driver(String browser) {
        DesiredCapabilities capabilities;
        switch (browser.toLowerCase()) {
            case CHROME:
                capabilities = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
                return new ChromeDriver(capabilities);
            case IE:
                capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability("ignoreProtectedModeSettings", true);
                return new InternetExplorerDriver(capabilities);
            default:
                log.warn(String.format("Unsupported browser [%s]. %nSupported are only [%s]", browser, CHROME));
                return new ChromeDriver();
        }
    }

}
