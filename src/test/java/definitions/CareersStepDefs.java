package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CareersHome;
import pages.CareersPosition;

import static org.assertj.core.api.Assertions.assertThat;

public class CareersStepDefs {
    @Given("^I open careers page$")
    public void iOpenCareersPage() {
        new CareersHome().open();
    }

    @When("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String title) throws Throwable {
        //had title argument, so created exception. i deleted it
        // new CareersHome().fillSearch(title); //since return instance of class, can use cascade approach,
        // don't need to use 'new CareersHome().' each time
        //new CareersHome().clickSearch();

        new CareersHome()
                .fillSearch(title)
                .clickSearch()
                .clickTitle(title); //last call doesn't have to return class because not cascaded further
    }

    @Then("^I verify that position city is \"([^\"]*)\"$")
    public void iVerifyThatPositionCityIs(String city) throws Throwable {
        String actualCity = new CareersPosition().verifyCity();

        assertThat(actualCity).isEqualToIgnoringCase(city);
    }
}
