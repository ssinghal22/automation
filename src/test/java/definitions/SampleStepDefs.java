package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
import static support.TestContext.getDriver;

public class SampleStepDefs {
    @Given("^I open sample page$")
    public void iOpenSamplePage() throws InterruptedException {
        getDriver().get("https://skryabin.com/webdriver/html/sample.html");
        Thread.sleep(3000);
    }

    @When("^I fill out required fields$")
    public void iFillOutRequiredFields() {
        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("SoniS");
        getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("SoniS@example.com");
        getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("Sunshine");
        getDriver().findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Sunshine");

        getDriver().findElement(By.xpath("//input[@name='name']")).click();
        getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys("Soni");
        getDriver().findElement(By.xpath("//input[@id='middleName']")).sendKeys("Krishy");
        getDriver().findElement(By.xpath("//input[@id='lastName']")).sendKeys("Singhal");
        getDriver().findElement(By.xpath("//span[@class='ui-button-text'][text()='Save']")).click();

        getDriver().findElement(By.xpath("//input[@name='agreedToPrivacyPolicy']")).click();
    }

    @And("^I submit the form$")
    public void iSubmitTheForm() {
        getDriver().findElement(By.xpath("//button[@id='formSubmit']")).click();
    }

    @Then("^I verify required fields$")
    public void iVerifyRequiredFields() {
        WebElement resultlegend = getDriver().findElement(By.xpath("//legend[@class='applicationResult']"));
        assertTrue(resultlegend.isDisplayed());

        String agreedToPrivacyPolicy = getDriver().findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
        assertTrue(agreedToPrivacyPolicy.equalsIgnoreCase("true"));

        String password = getDriver().findElement(By.xpath("//b[@name='password']")).getText();
        assertTrue(password.contains("entered"));

        String resultText = getDriver().findElement(By.xpath("//*[@id='samplePageResult']//section")).getText();
        //System.out.println("Text displayed on page is: ");
        //System.out.println(resultText);

        assertTrue(resultText.contains("SoniS"));
        assertTrue(resultText.contains("SoniS@example.com"));
        assertTrue(resultText.contains("Soni"));
        assertTrue(resultText.contains("Krishy"));
        assertTrue(resultText.contains("Singhal"));
    }
}
