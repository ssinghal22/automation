
package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.*;

public class JUnitTest {

    private static WebDriver driver; //properties shall be private

    @Before //before each scenario
    public void setup() {
        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        //user.dir - local path to ur project. never add actual path. if import to another m/c, may fail.
        System.setProperty("webdriver.chrome.driver", chromeDriverPath); //its a hashmap

        ChromeOptions options = new ChromeOptions();
       // options.setHeadless(true); //browser still runs virtually, just doesn't display, need when don't want to get distracted or on cloud
        options.addArguments("--window-size=1920,1080"); //always put resolution
        options.addArguments("--disable-gpu"); //graphical processing unit, don't need for headless
        driver = new ChromeDriver(options);

        driver.manage().deleteAllCookies(); //we r using only here to keep it simple, so not using get for getDriver()
        driver.manage().window().maximize(); //don't need this for headless
    }

    @Ignore
    @Test //right click, run it
    public void hello() {
        System.out.println("Hello World!");
    }

    @Test //all tests must be public and void
    public void fillAndVerifySampleForm() {
        openSamplePage();
        fillRequiredFields();
        submitSampleForm();
        verifySubmittedFields();
    }


private void openSamplePage() {
        driver.get("https://skryabin.com/webdriver/html/sample.html");

        if (driver.getTitle().equals("Sample Page")) {
            System.out.println("Sample page opened successfully!");
        }
        else {
            System.out.println("Error in opening Sample page!");
        }
    }

    private void fillRequiredFields() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SoniS");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("SoniS@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sunshine");
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Sunshine");

        driver.findElement(By.xpath("//input[@name='name']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Soni");
        driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Krishy");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Singhal");
        driver.findElement(By.xpath("//span[@class='ui-button-text'][text()='Save']")).click();

        driver.findElement(By.xpath("//input[@name='agreedToPrivacyPolicy']")).click();
    }

    private void submitSampleForm() {
        driver.findElement(By.xpath("//button[@id='formSubmit']")).click();
    }

    private void verifySubmittedFields() {
        WebElement resultlegend = driver.findElement(By.xpath("//legend[@class='applicationResult']"));
        assertTrue(resultlegend.isDisplayed());

        String agreedToPrivacyPolicy = driver.findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
        assertTrue(agreedToPrivacyPolicy.equalsIgnoreCase("true"));

        String password = driver.findElement(By.xpath("//b[@name='password']")).getText();
        assertTrue(password.contains("entered"));

        String resultText = driver.findElement(By.xpath("//*[@id='samplePageResult']//section")).getText();
        System.out.println("Text displayed on page is: ");
        System.out.println(resultText);

        assertTrue(resultText.contains("SoniS"));
        assertTrue(resultText.contains("SoniS@example.com"));
        assertTrue(resultText.contains("Soni"));
        assertTrue(resultText.contains("Krishy"));
        assertTrue(resultText.contains("Singhal"));
    }


    @After
    public void teardown() {
        driver.quit();
    }
}

