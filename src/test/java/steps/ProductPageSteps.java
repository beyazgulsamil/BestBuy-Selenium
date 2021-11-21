package steps;

import io.cucumber.java.en.Then;
import pages.ProductPage;

public class ProductPageSteps {
    ProductPage productPage = new ProductPage();

    @Then("I click SAVE button")
    public void saveClick(){productPage.click(productPage.productSaveButton);}
}
