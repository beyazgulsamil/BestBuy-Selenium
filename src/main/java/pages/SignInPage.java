package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

public class SignInPage extends Utilities {

    @FindBy(id = "fld-e")
    public WebElement eMailBox;

    @FindBy(id = "fld-p1")
    public WebElement passwordBox;

    @FindBy(css = "[class=\"c-toggle-slider c-toggle-round\"]")
    public WebElement showPasswordButton;

    @FindBy(css = "[type=\"submit\"]")
    public WebElement clickSignIn;

    @FindBy(css = "[class=\"c-button c-button-outline c-button-lg c-button-block c-button-icon c-button-icon-leading svg-button social-button undefined\"]")
    public WebElement googleSignButton;

}
