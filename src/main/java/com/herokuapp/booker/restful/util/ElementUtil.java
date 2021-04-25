package com.herokuapp.booker.restful.util;

import com.herokuapp.booker.restful.common.context.UIScenarioContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ElementUtil {

    private UIScenarioContext context = new UIScenarioContext();

    /**
     * Wait until element is visible
     *
     * @param element WebElement to wait for
     * @return found WebElement
     */
    public WebElement fluentWait(WebElement element) {
        Wait wait = new FluentWait(context.getBrowser().getDriver())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(Exception.class);
        wait.until(ExpectedConditions.visibilityOf(element));

        return element;
    }

}
