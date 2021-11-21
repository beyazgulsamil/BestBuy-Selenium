package steps;

import io.cucumber.java.en.Then;
import pages.GoogleSignPage;

public class GoogleSignPageSteps {
    GoogleSignPage googleSignPage = new GoogleSignPage();

    @Then("I fill gmail {}")
    public void gmailFill(String gmail){googleSignPage.fillInput(googleSignPage.gMailBox,gmail);}

    @Then("Fill password gmail {}")
    public void passwordFill(String password){googleSignPage.fillInput(googleSignPage.passwordBox,password);}

    @Then("I click forward pass button")
    public void forwardPasswordClick(){googleSignPage.click(googleSignPage.passwordNext);}

    @Then("I click forward id button")
    public void forwardIdClick(){googleSignPage.click(googleSignPage.identifierNext);}

    @Then("Show password in google page")
    public void clickShow(){googleSignPage.click(googleSignPage.showPassword);}

}
