package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;
import java.util.List;

public class CountryPage extends Utilities {

    @FindBy(css = "[class=\"content\"] [lang=\"en\"] h4")
    public List<WebElement> countryList;

}
