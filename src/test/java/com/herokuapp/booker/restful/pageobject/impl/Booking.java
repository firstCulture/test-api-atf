package com.herokuapp.booker.restful.pageobject.impl;

import com.herokuapp.booker.restful.common.browser.Browser;
import com.herokuapp.booker.restful.pageobject.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class Booking extends AbstractPage {

    @FindBy(xpath = "//input")
    private WebElement filterField;

    @FindBy(xpath = "//h1")
    private WebElement restfulBookerTitle;

    public Booking(Browser browser) {
        super(browser);
    }

}
