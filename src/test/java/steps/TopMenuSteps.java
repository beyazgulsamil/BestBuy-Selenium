package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.TopMenu;

public class TopMenuSteps {
    TopMenu topMenu = new TopMenu();


    @Then("I search to {}")
    public void search(String text) {
        topMenu.click(topMenu.searchBox);
        topMenu.fillInput(topMenu.searchBox,text);
        topMenu.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("I click Account button")
    public void clickAccount(){topMenu.click(topMenu.accountButton);}

    @Then("I click Sign In button in Top Menu")
    public void clickSignIn(){topMenu.click(topMenu.signInButton);}

    @Then("Verify to successful sign text")
    public void verifySign() {
        topMenu.refreshPage();
        topMenu.verifyText(topMenu.hiAccountText, "Sign in Fail");
    }

    @Then("I click Menu Button")
    public void menuClick(){topMenu.click(topMenu.menuButton);}

    @Then("I select in menu product type {}")
    public void productType(String type){topMenu.textLoopClick(topMenu.menuList,type);}

    @Then("I select product type inside type {}")
    public void insideType(String type){topMenu.textLoopClick(topMenu.menuInsideList,type);}

    @Then("Verify saved list")
    public void savedVerify(){topMenu.loopAndVerify(topMenu.savedList);}

    @Then("I click Saved Items button")
    public void saveItemsButtonClick(){topMenu.click(topMenu.saveListButton);}


}
