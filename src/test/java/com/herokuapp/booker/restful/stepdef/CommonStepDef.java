package com.herokuapp.booker.restful.stepdef;

import com.herokuapp.booker.restful.common.context.UIScenarioContext;
import com.herokuapp.booker.restful.common.helper.StoreDataHelper;
import com.herokuapp.booker.restful.pageobject.impl.Booking;
import com.herokuapp.booker.restful.util.ElementUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.herokuapp.booker.restful.common.consts.GlobalConst.FULL_NAME__VALUE;
import static org.junit.Assert.assertTrue;

public class CommonStepDef {

    private UIScenarioContext context = new UIScenarioContext();

    private ElementUtil elementUtil = new ElementUtil();

    private Booking page = new Booking(context.getBrowser());

    @When("^User opens index page$")
    public void userOpensIndexPage() {
        page.open("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-GetBooking");
    }


    @And("^User search in the filter filed by full name$")
    public void userSearchInTheFilterFiledByFullName() {
        String fullName =  StoreDataHelper.storeStringDataHelper.get(FULL_NAME__VALUE);;
        elementUtil.fluentWait(page.getFilterField()).sendKeys(fullName);
    }

    @Then("^Validate that restful booker title is present$")
    public void validateThatATextIsPresent() {
        assertTrue(elementUtil.fluentWait(page.getRestfulBookerTitle()).isDisplayed());
    }

}
