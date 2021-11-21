package steps;

import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageSteps {
    SignInPage signInPage = new SignInPage();

    @Then("I fill e-mail address {}")
    public void fillEmail(String mail){signInPage.fillInput(signInPage.eMailBox,mail);}

    @Then("I fill password {}")
    public void fillpassword(String password){signInPage.fillInput(signInPage.passwordBox,password);}

    @Then("Show password in sign page")
    public void showPassword(){signInPage.click(signInPage.showPasswordButton);}

    @Then("I click Sign In")
    public void signInClick(){signInPage.click(signInPage.clickSignIn);}

    @Then("I click Sign in with Google")
    public void clickGoogleSign(){signInPage.click(signInPage.googleSignButton);}
}
