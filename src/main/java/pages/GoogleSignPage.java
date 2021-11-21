package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

public class GoogleSignPage extends Utilities {

    @FindBy(css = "[type=\"email\"]")
    public WebElement gMailBox;

    @FindBy(css = "[type=\"password\"]")
    public WebElement passwordBox;

    @FindBy(id = "passwordNext")
    public WebElement passwordNext;

    @FindBy(id = "identifierNext")
    public WebElement identifierNext;

    @FindBy(css = "[class=\"VfPpkd-YQoJzd\"]")
    public WebElement showPassword;


}
