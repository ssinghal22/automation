package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPosition extends Page {

    public CareersPosition() {} //don't need it, uses parent's

    @FindBy(xpath = "//label[@for='positionCity']/../span")
    WebElement positionCity;

    public String verifyCity() {

        String actualCity = positionCity.getText();

        return actualCity;
    }

}
