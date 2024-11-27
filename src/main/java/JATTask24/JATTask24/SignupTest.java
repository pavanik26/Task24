package JATTask24.JATTask24;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SignupTest {
	WebDriver driver;
	Signupage signUpPage;

    @BeforeMethod
    public void setUp() {
        // Setup WebDriver
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        signUpPage = new Signupage(driver);
    }

	
	 @Test
	    public void testSignUp() {
	      
	        // Perform actions
		    signUpPage.clickSignUp();
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-username")));
	        signUpPage.enterUsername("Test@112724");
	        signUpPage.enterPassword("Test@112724");
	        signUpPage.clickSignUpButton();

	        // Assertion to verify successful sign-up

	        wait.until(ExpectedConditions.alertIsPresent());
	        // Switch to the alert
	        Alert alert = driver.switchTo().alert();    
	        
	        // Get the alert text
	        String alertText = alert.getText();

	        // Assert that the alert message is "Sign up successful"
	        Assert.assertEquals(alertText, "Sign up successful.", "Alert message is not as expected!");

	        // Accept the alert to close it
	        alert.accept();
	    }
	 

		 

	 @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
