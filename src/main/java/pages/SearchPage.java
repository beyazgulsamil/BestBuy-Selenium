package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class SearchPage extends Utilities {

    @FindBy(css = "[class=\"sku-item\"] [class=\"sku-title\"] a")
    public List<WebElement> productList;

    @FindBy(css = "[data-track=\"Brand - Show More\"]")
    public WebElement brandShowMore;

    @FindBy(css = "[class=\"facet-option-label-text\"]")
    public List<WebElement> leftPanelList;

    @FindBy(css = "[class=\"c-button c-button-secondary c-button-md large-facet-group-show-results\"]")
    public WebElement showResultButton;


}
