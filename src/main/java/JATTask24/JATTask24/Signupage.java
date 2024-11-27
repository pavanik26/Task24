package JATTask24.JATTask24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signupage {
    
    // WebElements for SignUp page
	
	@FindBy(id = "signin2")
	private WebElement SignUp;
	
    @FindBy(id = "sign-username")
    private WebElement usernameField;

    @FindBy(id = "sign-password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    private WebElement signUpButton;
    
    WebDriver driver;
    // Constructor to initialize WebElements
    public Signupage(WebDriver driver) {
    	this.driver=driver;
        PageFactory.initElements(driver, this);  
    }
   
    
	// Method to click signup first
    public void clickSignUp() {
		// TODO Auto-generated method stub
    	
    	
    	SignUp.click();
	}

    // Method to enter username
    public void enterUsername(String username) {
		// TODO Auto-generated method stub
		 usernameField.sendKeys(username);
	}

    // Method to enter password
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    // Method to click on sign up button
    public void clickSignUpButton() {
        signUpButton.click();
    }
   
    
	

}
