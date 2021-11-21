package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class TopMenu extends Utilities {


    @FindBy(id = "gh-search-input")
    public WebElement searchBox;

    @FindBy(css = "[class=\"plButton-label v-ellipsis\"]")
    public WebElement accountButton;

    @FindBy(css = "[data-lid=\"ubr_mby_signin_b\"]")
    public WebElement signInButton;

    @FindBy(css = "[class=\"plButton-label v-ellipsis\"]")
    public WebElement hiAccountText;

    @FindBy(css = "[class=\"c-button-unstyled hamburger-menu-button\"]")
    public WebElement menuButton;

    @FindBy(css = "[class=\"liDropdownList \"]")
    public List<WebElement> menuList;

    @FindBy(css = "[class=\"liDropdownList\"]")
    public List<WebElement> menuInsideList;

    @FindBy(css = "[data-lid=\"hdr_saved_lv\"]")
    public WebElement saveListButton;

    @FindBy(css = "[class=\"sku-card-product-title\"] [data-track=\"navhistory_masi_timeline_product\"]")
    public List<WebElement> savedList;

}
