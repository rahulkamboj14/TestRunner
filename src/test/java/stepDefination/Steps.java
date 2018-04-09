package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {
	
    @Given("^I am at the \"([^\"]*)\"$")
    public void i_am_at_the_something(String strArg1) throws Throwable {
    	System.out.println("Open Webpage");
    }
    

    @Then("^I should see the \"([^\"]*)\" page$")
    public void i_should_see_the_something_page(String strArg1) throws Throwable {
    	System.out.println("Test Webpage");
    }

    @And("^I pass the \"([^\"]*)\" in the Url$")
    public void i_pass_the_something_in_the_url(String strArg1) throws Throwable {
    	System.out.println("Close Webpage");
    }
}
