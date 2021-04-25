package com.herokuapp.booker.restful.common.context;

import com.herokuapp.booker.restful.common.browser.Browser;
import com.herokuapp.booker.restful.common.driverfactory.DriverFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class UIScenarioContext {

    private static Map<String, Browser> environments = new HashMap<>();

    /**
     * Create environment for running tests
     */
    public void createEnvironment() {
        log.info(String.format("Initializing uI UIEnvironment [%s]", "test_env"));
        Browser browser = new Browser(DriverFactory.driver("chrome"));

        this.environments.put("test_env", browser);
    }

    public Browser getBrowser() {
        if(CollectionUtils.isEmpty(environments)) {
            createEnvironment();
        }

        return environments.get("test_env");
    }

}