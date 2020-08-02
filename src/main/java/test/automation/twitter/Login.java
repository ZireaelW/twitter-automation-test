package test.automation.twitter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Login {
    WebDriver driver;
    @Given("^the user navigates to twitter$")
    public void the_user_navigates_to_twitter() throws Throwable {
        driver = new ChromeDriver();

        driver.get("http://twitter.com/twitter");
        driver.manage().window().maximize();
    }

    @When("^I click button login$")
    public void i_click_button_login() throws Throwable {
        driver.findElement(By.xpath("//a[@data-testid=\"login\"]")).click();
    }

    @When("^I enter Username as \"(.*?)\"$")
    public void i_enter_Username_as(String username) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"session[username_or_email]\"]")));

        driver.findElement(By.xpath("//input[@name=\"session[username_or_email]\"]"));
        Actions actions = new Actions(driver);
        actions.sendKeys(username).perform();

    }

    @When("^I enter Password as \"(.*?)\"$")
    public void i_enter_Password_as(String password) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"session[password]\"]")));

        driver.findElement(By.xpath("//input[@name=\"session[password]\"]")).sendKeys(password);
        driver.findElement(By.xpath("//div[@data-testid=\"LoginForm_Login_Button\"]")).click();
    }

    @Then("^login should be successful$")
    public void login_should_be_successful() throws Throwable {
        String url= driver.getCurrentUrl(); assertEquals("Login Success", url, "http://twitter.com/twitter");
        assertEquals("Success",url);
    }


}
