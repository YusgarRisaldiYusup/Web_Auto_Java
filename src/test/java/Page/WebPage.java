package Page;

import org.openqa.selenium.By;

import static helper.utility.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class WebPage {

    static By inputUsername = By.id("user-name");
    By inputPassword = By.id("password");
    By btnLogin = By.id("login-button");
    By iconChart = By.xpath("//a[@class='shopping_cart_link']");
    By errorMassage (String msg) {return  By.xpath("//h3[contains(text(),'"+msg+"')]");}
    By addToChart = By.xpath("(//*[text()='Add to cart'])[1]");
    By removeChart = By.xpath("(//*[text()='Remove'])[1]");
    By nomorIconChart = By.xpath("//span[@class='shopping_cart_badge']");

    public void openWebLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public static void userInputUsername(String username) {
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void userInputPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void userClikLoginButton() {
        driver.findElement(btnLogin).click();
    }

    public void userWillSeeIconCartInHomepage() {
        driver.findElement(iconChart).isDisplayed();
    }

    public void userWillSeeErrorMassage(String massage) {
        driver.findElement(errorMassage(massage)).isDisplayed();
    }

    public void userAddItemToCart() {
        driver.findElement(addToChart).click();
    }

    public void verifyCartItemIsMatch(String count) {
        String itemExpected = count;
        String itemActual = driver.findElement(nomorIconChart).getText();
        assertThat(itemExpected).isEqualTo(itemActual);
    }

    public void userRemoveItemFromCart() {
        driver.findElement(removeChart).click();
    }
}
