import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;

public class CartSteps extends BaseTest{
    @Given("Open Home Page")
    public void open_Home_Page() {
        goToPage("www.hepsiburada.com/");
    }

    @Given("User Login")
    public void user_Login() {
        HomePage home = new HomePage();
        Assert.assertTrue(home.clickUserLogin());
        LoginPage login = new LoginPage();
        Assert.assertTrue(login.userLogin());
    }

    @When("^User search product (.*)$")
    public void user_search_product(String product) {
        HomePage home = new HomePage();
        Assert.assertTrue(home.searchProduct(product));
    }

    @When("User choose one product")
    public void user_choose_one_product() {
       ProductPage product = new ProductPage();
        Assert.assertTrue(product.selectOneRandomProduct());
    }

    @Then("User add two different sellers for chosen product")
    public void user_choose_two_different_sellers_for_chosen_product() {
        ProductPage product = new ProductPage();
        Assert.assertTrue(product.selectRandomDifferentSeller());
        Assert.assertTrue(product.selectRandomDifferentSeller());
    }
    @Given("^User go to page (.*)$")
    public void user_go_to_page(String page) {
        HomePage home = new HomePage();
        Assert.assertTrue(home.getCategoryPopup(page));
    }
    @When("^User go to tab (.*)$")
    public void user_go_to_tab(String tab) {
        HomePage home = new HomePage();
        Assert.assertTrue(home.clickTab(tab));
    }
    @When("^User Choose Category (.*)$")
    public void user_choose_category(String category) {
        HomePage home = new HomePage();
        Assert.assertTrue(home.chooseCategory(category));
    }
    @Then("User add product to cart")
    public void user_add_product_to_cart() {

    }
}
