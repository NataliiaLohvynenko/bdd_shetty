package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import driverFactory.BaseTest;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

import java.io.IOException;


@RunWith(Cucumber.class)
public class MyStepDefinitions extends BaseTest{

	HomePage homePage;
	WebDriver driver = BaseTest.getDriver();
	//HomePage homePage = new HomePage(driver);
	//HomePage homePage = new HomePage();



	public MyStepDefinitions() throws IOException {
	}

	@Given("^User is on GreenCart landing page$")
	public void user_is_on_GreenCart_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("start");
		homePage = new HomePage(driver);
		getHomePage();

	}

	@When("^User search for (.+) vegetable$")
	public void user_search_for_vegetable(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("when");
		homePage.getSearchField().sendKeys(name);
		Thread.sleep(1000);
	}

	
	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_desplate(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
System.out.println(arg1);
		System.out.println(driver.findElement(By.cssSelector("h4.product-name")).getText());

		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(arg1));
	}



	@And("^Add items to cart$")
	public void add_items_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	}

	@And("^User processed to Checkout page for purchase$")
	public void user_processed_to_Checkout_page_for_purchase() throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(class, '')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		}

/*	@Then("^verify selected \"([^\"]*)\" items are displayed$")
	public void verify_selected_items_are_displayed(String arg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.className("product-name")).getText().contains(arg1));
		}*/

/*
	@When("^User search for Brinjal vegetable$")
	public void user_search_for_Brinjal_vegetable() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}
*/

	@Then("^verify selected (.+) items are displayed$")
	public void verify_selected_items_are_displayed(String name) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.className("product-name")).getText().contains(name));
	}

}
