package com.herokuapp.booker.restful.pageobject;

import org.openqa.selenium.WebElement;

public interface Page {

    void open(String url);

    String title();

    boolean isCurrentPage(String url);

}
