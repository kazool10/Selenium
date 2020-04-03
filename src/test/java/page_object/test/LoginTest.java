/*package page_object.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.page.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver  driver;
        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        }
    @Test
    public void testLoginWithProperCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
        Assert.assertEqauls("Automated Tester", loginPage.getLoggedUserName());
    }

    @After
    public void
    }*/

