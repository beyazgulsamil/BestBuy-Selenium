package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Then("I close pop-up")
    public void closePopup() {
        homePage.click(homePage.closeButton);
    }

    @Then("Verify title {}")
    public void verifyHeadText(String title) {
        homePage.verifyTextVisibiltyOf(title);
    }

}
