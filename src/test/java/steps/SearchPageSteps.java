package steps;

import io.cucumber.java.en.Then;
import pages.SearchPage;

public class SearchPageSteps {
    SearchPage searchPage = new SearchPage();

    @Then("Listed products is verify")
    public void listedVerify() {searchPage.loopAndVerify(searchPage.productList);}

    @Then("I click Show more brands")
    public void clickMoreBrands(){searchPage.click(searchPage.brandShowMore);}

    @Then("I select to panel in {}")
    public void panelSelect(String text){searchPage.textLoopClick(searchPage.leftPanelList,text);}

    @Then("I click to show results")
    public void showResultsClick(){searchPage.click(searchPage.showResultButton);}

    @Then("I select rank to {} product")
    public void rankSelect(int rank){
        searchPage.refreshPage();
        searchPage.rankLoopClick(searchPage.productList, rank);
    }



}
