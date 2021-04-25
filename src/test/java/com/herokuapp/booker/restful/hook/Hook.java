package com.herokuapp.booker.restful.hook;

import com.herokuapp.booker.restful.common.context.UIScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class Hook {

    UIScenarioContext uiScenarioContext = new UIScenarioContext();

    @Before(order = 0)
    public void initialize(Scenario scenario) {
        uiScenarioContext.createEnvironment();
    }

    @After(order = 99)
    public void quit(Scenario scenario) {
        uiScenarioContext.getBrowser().quit();
    }


}
