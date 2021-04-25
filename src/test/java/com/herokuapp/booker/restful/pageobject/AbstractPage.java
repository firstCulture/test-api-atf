package com.herokuapp.booker.restful.pageobject;

import com.google.common.base.Function;
import com.herokuapp.booker.restful.common.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public abstract class AbstractPage implements Page{

    protected Browser browser;

    /**
     * Refers to the current instance of the class
     *
     * @param browser Browser we use
     */
    public AbstractPage(Browser browser) {
        this.browser = browser;
        PageFactory.initElements(this.browser.getDriver() , this);
    }

    @Override
    public void open(String url) {
        browser.goToUrl(url);
    }

    @Override
    public boolean isCurrentPage(String url) {
        return browser.getDriver().getCurrentUrl().startsWith(url);
    }

    @Override
    public String title() {
        return browser.getPageTitle();
    }

}