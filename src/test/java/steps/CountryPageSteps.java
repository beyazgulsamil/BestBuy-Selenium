package steps;

import io.cucumber.java.en.Then;
import pages.CountryPage;

public class CountryPageSteps {
    CountryPage countryPage = new CountryPage();


    @Then("Country select to {}")
    public void countrySelect(String country) {
        countryPage.textLoopClick(countryPage.countryList, country);
    }
}
