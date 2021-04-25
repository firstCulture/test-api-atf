package com.herokuapp.booker.restful.common.browser;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Browser {

    private WebDriver driver;

    /**
     * Refers to the current instance of the class.
     *
     * @param driver  Selenium driver
     */
    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Navigate to the specified url
     *
     * @param url Page url
     */
    public void goToUrl(String url) {
        this.driver.manage().window().maximize();
        this.driver.navigate().to(url);
    }

    /**
     * Go back by pressing back button
     */
    public void goBackButton() {
        this.driver.navigate().back();
    }

    public String getPageTitle() {
        return this.driver.getTitle();
    }

    public void close() {
        if (driver != null) driver.close();
    }

    public void quit() {
        if (driver != null) driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void refresh() {
        this.driver.navigate().refresh();
    }

    public String getCurrentUrl() {
        return this.driver.getCurrentUrl();
    }

}
