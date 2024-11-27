package JATTask24.JATTask24;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterMethod;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static void main(String[] args) {
	
	
		WebDriverManager.chromedriver().setup();
	
    
    // Initialize ChromeDriver with options
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.guvi.in/register");
    
    // Maximize the window
    driver.manage().window().maximize();

//	    @AfterMethod
//	    public void tearDown() {
//	        // Quit the WebDriver session after each test
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }

}
}
