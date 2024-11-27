package JATTask24.JATTask24;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginpageTest {
	
	 WebDriver driver;
	    Loginpage loginPage;

	    @BeforeMethod
	    public void setUp() {
	        // Setup WebDriver
	        driver = new ChromeDriver();
	        driver.get("https://www.demoblaze.com/");
	        loginPage = new Loginpage(driver);
	    }
	
	
	
	@Test
    public void testLogin() {
        // Perform actions
        loginPage.clickLogin();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
        loginPage.enterUsername("Test@112724");
        loginPage.enterPassword("Test@112724");
        loginPage.clickLoginButton();

        if(driver.findElements(By.id("nameofuser")).size()>0)
        {
         Assert.assertTrue(true, "element displayed");
        }
        else
        {
         Assert.assertTrue(false, "element not displayed");
        } 
    }
	
	@AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
