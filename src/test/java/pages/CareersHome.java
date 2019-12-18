package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static support.TestContext.getDriver;

public class CareersHome extends Page{

    public CareersHome() {
        url = "https://skryabin-careers.herokuapp.com/";
    }

   @FindBy(id = "positionsQuickSearchInput") //didn't complain at design time as used during run time -
           // that's how notations behave - need to add page factory snippet in page
    WebElement searchInput;

   public CareersHome fillSearch(String text) {
       searchInput.sendKeys(text);
       return this;
   }

   @FindBy(id="positionsQuickSearchButton")
    WebElement searchButton;

    public CareersHome clickSearch() {
        searchButton.click();
        return this;
}

    @FindBy(xpath = "//a[contains(@href,'/positions')]") //or use "(//li//h4)[1]" - first element of multiple returns
     WebElement positionTitle;

    public void clickTitle(String title) {
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.textToBePresentInElement(positionTitle, title));
        positionTitle.click();
    }

}

