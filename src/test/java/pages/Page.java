package pages;

import org.openqa.selenium.support.PageFactory;

import static support.TestContext.getDriver;

public class Page {

    protected String url; //its null here; protected - visible in any class within same package

    public Page() {
        PageFactory.initElements(getDriver(), this); //snippet to use for @FindBy
    }

    public void open() {
        getDriver().get(url);
    }
}
