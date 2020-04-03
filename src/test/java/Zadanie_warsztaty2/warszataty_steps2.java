package Zadanie_warsztaty2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class warszataty_steps2 {

    WebDriver driver;

    @Given("User is on the store website")
    public void userIsOnTheStoreWebsite() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @When("User is logged on website")
    public void userIsLoggedOnWebsite() {
        WebElement email = driver.findElement(By.name("email"));
        email.click();
        email.sendKeys("pkowalski@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abbb123");
        driver.findElement(By.id("submit-login")).click();
    }

    @And("User is searching product Humningbird Printed Sweater in input and click him")
    public void userIsSearchingProductHumningbirdPrintedSweaterInInputAndClickHim() {
        WebElement search =  driver.findElement (By.name("s"));
        search.sendKeys("Hummingbird Printed Sweater");
        search.submit();

        WebElement productName = driver.findElement(By.cssSelector(".h3.product-title"));
        if (productName.getText().contains("Hummingbird Printed Sweater")){
            productName.click();
        }
    }

    @And("Chooses (.*)")
    public void choosesSize(String size) {
        WebElement productSize = driver.findElement(By.cssSelector(".form-control.form-control-select"));
        productSize.click();
        productSize.sendKeys(size);
        productSize.click();
    }

    @And("Enter the (.*)")
    public void enterTheQuantity(String quantity) {
        WebElement productQuantity = driver.findElement(By.id("quantity_wanted"));
        productQuantity.click();
        productQuantity.clear();
        productQuantity.sendKeys(quantity);
    }

    @And("Add to cart and go to checkout")
    public void addToCartAndGoToCheckout() {
        driver.findElement(By.cssSelector(".btn.btn-primary.add-to-cart")).click();
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.cart-content-btn a.btn.btn-primary")));
        driver.findElement(By.cssSelector("div.cart-content-btn a.btn.btn-primary")).click();
        driver.findElement(By.cssSelector("div.card.cart-summary a.btn.btn-primary")).click();
    }

    @And("Gives the address")
    public void givesTheAddress() {
        driver.findElement(By.name("confirm-addresses")).click();
    }

    @And("Select delivery method")
    public void selectDeliveryMethod() {
        WebElement deliveryMethod = driver.findElement(By.id("delivery_option_1"));
        if (!deliveryMethod.isSelected()){
            deliveryMethod.click();
        }
        driver.findElement(By.name("confirmDeliveryOption")).click();
    }

    @And("Select payment method")
    public void selectPaymentMethod() {
        driver.findElement(By.id("payment-option-1")).click();
    }

    @And("Agree terms of service")
    public void agreeTermsOfService() {
        driver.findElement(By.id("conditions_to_approve[terms-and-conditions]")).click();
    }

    @And("Confirm order")
    public void confirmOrder() {
        driver.findElement(By.id("payment-confirmation")).click();
    }

    @And("Make a screenshot")
    public void makeAScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/marcin/Obrazy/screeenshot.png"));
    }

    @Then("Close browser")
    public void closeBrowser() {
        driver.quit();
    }
}
