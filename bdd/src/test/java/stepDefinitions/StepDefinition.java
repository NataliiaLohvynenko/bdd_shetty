package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
     System.out.println("test");
    }

    @When("^User is login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_is_login_into_application_with_username_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     System.out.println(arg1 + ": " + arg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
	   System.out.println("Home page is  populated");
       
    }


    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1 + "\n");
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable table) throws Throwable {
       List<List<String>> data = table.raw();
       System.out.println(data.get(0).get(2));
    }
    
    @When("^user is login into application with username (.+) and password (.+)$")
    public void user_is_login_into_application_with_username_and_password(String username, String password) throws Throwable {
    	System.out.println(username +  ": " + password +"\n");
    	
    }
    
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("validate_the_browser");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("browser_is_triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("check_if_browser_is_started");
    }

}
