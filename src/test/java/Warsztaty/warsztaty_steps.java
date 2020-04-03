package Warsztaty;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;


public class warsztaty_steps {
    private WebDriver driver;
    List<String> myListOfData = new ArrayList<>();

    @Given("User is in login page")
    public void userIsInLoginPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @When("User writing email")
    public void userWritingEmail() {
    WebElement email = driver.findElement(By.name("email"));
    email.sendKeys("pkowalski@gmail.com");
    }

    @And("User writing password")
    public void userWritingPassword() {
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abbb123");
    }

    @And("User logs in to the account")
    public void userLogsInToTheAccount() {
        WebElement submit = driver.findElement(By.id("submit-login"));
        submit.click();
    }

    @And("Click add a new address")
    public void clickAddANewAddress() {
       driver.findElement(By.id("addresses-link")).click();
    }

    @And("Add a new address")
    public void addANewAddress() {
        driver.findElement(By.cssSelector("div.addresses-footer i.material-icons")).click();
    }

    @And("Fill (.*) input")
    public void fillAliasInput(String alias) {
    WebElement alias_1 = driver.findElement(By.name("alias"));
    alias_1.sendKeys(alias);
    this.myListOfData.add(alias);
    }

    @And("User fill (.*) input")
    public void userFillAddressInput(String address) {
        WebElement address_1 = driver.findElement(By.name("address1"));
        address_1.sendKeys(address);
        this.myListOfData.add(address);
    }

    @And("Add (.*) input")
    public void addZipInput(String zip) {
        WebElement zip_1 = driver.findElement(By.name("postcode"));
        zip_1.sendKeys(zip);
        this.myListOfData.add(zip);
    }

    @And("Point (.*)")
    public void pointCity(String city) {
        WebElement city_1 = driver.findElement(By.name("city"));
        city_1.sendKeys(city);
        this.myListOfData.add(city);
    }

    @And("Check (.*)")
    public void checkNationality(String nationality) {
        WebElement nation_1 = driver.findElement(By.name("id_country"));
        nation_1.click();
        nation_1.sendKeys(nationality);
        this.myListOfData.add(nationality);
    }

    @And("Write (.*) input")
    public void writePhoneInput(String phone) {
        WebElement phone_1 = driver.findElement(By.name("phone"));
        phone_1.sendKeys(phone);
        this.myListOfData.add(phone);
        phone_1.submit();
    }


    @And("Verify that the data is correct")
    public void verifyThatTheDataIsCorrect() {
        List<WebElement> elements = driver.findElements(By.cssSelector(".address-body"));
        int size = elements.size();
        WebElement webElement = elements.get(size - 1);
        String text = webElement.getText();
        text.split("\n");
        String[] splitted = text.split("\n");

        Assert.assertEquals(myListOfData.get(0), splitted[0]);
        Assert.assertEquals(myListOfData.get(1), splitted[2]);
        Assert.assertEquals(myListOfData.get(2), splitted[4]);
        Assert.assertEquals(myListOfData.get(3), splitted[3]);
        Assert.assertEquals(myListOfData.get(4), splitted[5]);
        Assert.assertEquals(myListOfData.get(5), splitted[6]);
    }

    @Then("Close browser")
    public void closeBrowser() {
        driver.quit();
    }
}
