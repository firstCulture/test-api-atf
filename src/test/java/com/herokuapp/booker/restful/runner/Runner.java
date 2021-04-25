package com.herokuapp.booker.restful.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/single/single-html-report", "json:target/single/cucumber.json",
                "junit:target/single/junit.xml"},
        features = {"src/test/resources/features"},
        glue = { "com/herokuapp/booker/restful/stepdef",
                "com/herokuapp/booker/restful/hook"},
        dryRun = false,
        monochrome = true,
        strict = true,
        tags = {"@Test"}

)

public class Runner {

}