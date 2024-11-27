package JATTask24.JATTask24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage {
	
//	public void enterCredentials(String username, String password) {
//        // Code to enter login credentials
//    }
//
//    public void submitLogin() {
//        // Code to submit the login form
//    }
	// WebElements for Login page
	
	@FindBy(id = "login2")
	private WebElement login;
	
    @FindBy(id = "loginusername")
    private WebElement usernameField;

    @FindBy(id = "loginpassword")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElement loginButton;
    
    WebDriver driver;

    // Constructor to initialize WebElements
    public Loginpage(WebDriver driver) {
    	this.driver=driver;
        PageFactory.initElements(driver, this);  
    }
    
 // Method to click login first
    public void clickLogin() {
		// TODO Auto-generated method stub
    	login.click();
	}

    // Method to enter username
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    // Method to click on login button
    public void clickLoginButton() {
        loginButton.click();
    }
}
