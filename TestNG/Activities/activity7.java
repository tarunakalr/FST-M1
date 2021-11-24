package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class activity7 {
	WebDriver driver;
	WebDriverWait wait;
	
	
  @Test(dataProvider = "Authentication")
  public void LoginTest(String username, String password)
  {
      WebElement usernameField = driver.findElement(By.id("username"));
  	
      WebElement passwordField = driver.findElement(By.id("password"));
	
      
	
      //Enter values
	
      usernameField.sendKeys(username);
	
      passwordField.sendKeys(password);
	
      
	
      //Click Log in
	
      driver.findElement(By.cssSelector("button[type='submit']")).click();
	
      
	
      //Assert Message
	
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	
      Assert.assertEquals(loginMessage, "Welcome Back, admin");
	
  }
	  
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	    wait = new WebDriverWait(driver, 10);
	    driver.get(" https://www.training-support.net/selenium/login-form");
  }
	    @DataProvider(name = "Authentication")
		
	    public static Object[][] credentials() {
		
	        return new Object[][] { { "admin", "password" }};
		
	    
	    
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

 
  

}
