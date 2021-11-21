package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class ProductPage extends Utilities {

    @FindBy(css = "[class=\"col-xs-6\"] [class=\"save-for-later-save\"]")
    public WebElement productSaveButton;


}
