package pageObjects;

import driverFactory.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends BaseTest {

WebDriver driver;
    public HomePage(WebDriver driver)  throws IOException {

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input.search-keyword")
    private WebElement searchField;

    @FindBy(css ="h4.product-name")
    private WebElement productName;

    @FindBy(css = "a.increment")
    private WebElement addProduct;

    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    private WebElement addToCart;


    public WebElement getSearchField() {
        return searchField;
    }

}
