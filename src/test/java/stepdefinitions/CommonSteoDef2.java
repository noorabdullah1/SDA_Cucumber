package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommonSteoDef2 {

    WebDriver driver;
    @Given("user goes to google page")
    public void user_goes_to_google_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");
    }
    @When("user searches for {string}")
    public void user_searches_for(String string) {
        driver.findElement(By.name("q")).sendKeys(string + Keys.ENTER);

    }
    @Then("tests that the page title contains the word {string}")
    public void tests_that_the_page_title_contains_the_word(String string) {
        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'samsung')]")).isEmpty());

    }
    @Then("closes")
    public void closes() {
        driver.close();
    }

}
