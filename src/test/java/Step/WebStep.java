package Step;

import Page.WebPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WebStep {
    WebPage webPage;

    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("open web login page")
    public void openWebLoginPage() {
        webPage.openWebLoginPage();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        WebPage.userInputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPage.userInputPassword(password);
    }

    @And("user clik login button")
    public void userClikLoginButton() {
        webPage.userClikLoginButton();
    }

    @And("user will see icon cart in homepage")
    public void userWillSeeIconCartInHomepage() {
        webPage.userWillSeeIconCartInHomepage();
    }

    @And("user will see error massage {string}")
    public void userWillSeeErrorMassage(String massage) {
        webPage.userWillSeeErrorMassage(massage);
    }

    @And("user add item to cart")
    public void userAddItemToCart() {
        webPage.userAddItemToCart();
    }

    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String count) {
        webPage.verifyCartItemIsMatch(count);
    }

    @And("user remove item from cart")
    public void userRemoveItemFromCart() {
        webPage.userRemoveItemFromCart();
    }
}
