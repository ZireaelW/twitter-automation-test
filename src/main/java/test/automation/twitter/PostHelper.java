package test.automation.twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class PostHelper {
    WebDriver driver;

    public PostHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_home_page() {
        this.driver.findElement(By.xpath("//a[@data-testid=\"AppTabBar_Home_Link\"]")).click();
    }

    public void enter_tweet_text_as(String text) {
        WebDriverWait wait = new WebDriverWait(this.driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid=\"tweetTextarea_0\"]")));

        this.driver.findElement(By.xpath("//div[@data-testid=\"tweetTextarea_0\"]")).sendKeys(text);
    }

    public void enter_tweet_image_as(String image) {
        this.driver.findElement(By.xpath("//input[@data-testid=\"fileInput\"]")).sendKeys(image);
    }

    public void click_tweet_button() {
        this.driver.findElement(By.xpath("//div[@data-testid=\"tweetButtonInline\"]")).click();
    }

    public void tweet_should_be_posted() {
        String url = this.driver.getCurrentUrl();
        assertEquals("Tweet Success", url, "https://twitter.com/home");
        assertEquals("Success", url);
    }
}
