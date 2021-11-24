package activities;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class activity9 {
	WebDriver driver;
  @Test
  public void simpleAlertTestCase() {
      Reporter.log("simpleAlertTestCase started |");
  	
     driver.findElement(By.id("simple")).click();
	
      Reporter.log("Simple Alert opened |");
      Alert simpleAlert = driver.switchTo().alert();
      Reporter.log("Focus changed to alert");
      String text= simpleAlert.getText();
      Reporter.log("Text is: " + text + " |");
      
      Assert.assertEquals("This is JavaScript Alert!",text);
      simpleAlert.accept();
  	
      Reporter.log("Alert closed");
	  Reporter.log("Test case ended |");
	  
  }
  
  @Test(priority = 1)
 public void confirmAlertTestCase()
 {
 Reporter.log("confirmAlertTestCase started |");
	
driver.findElement(By.id("confirm")).click();

 Reporter.log("Confirm Alert opened |");
 Alert confirmAlert = driver.switchTo().alert();

 Reporter.log("Switched foucs to alert |");

 String alertText = confirmAlert.getText();

 Reporter.log("Alert text is: " + alertText + " |");

 Assert.assertEquals("This is a JavaScript Confirmation!", alertText);
 confirmAlert.accept();
 Reporter.log("Alert closed |");
 Reporter.log("Test case ended |");
  
  }
  @Test
  void promtAlertTestCase()
   {
      Reporter.log("promptAlertTestCase started |");
  	
    
      driver.findElement(By.id("prompt")).click();
	
      Reporter.log("Prompt Alert opened |");
	
      Alert promptAlert = driver.switchTo().alert();
	
      Reporter.log("Foucs changed to alert |");
	
      String alertText = promptAlert.getText();
	
      Reporter.log("Alert text is: " + alertText + " |");
	

	
      promptAlert.sendKeys("Its done");
	
      Reporter.log("Text entered in prompt alert |");
	
     
      Assert.assertEquals("This is JavaScript Prompt!", alertText);
	  promptAlert.accept();
	  Reporter.log("Alert closed |");
      Reporter.log("Test case ended |");
   }
   
  
  

  @AfterTest
  public void AfterTest() {
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
      driver = new FirefoxDriver();
      Reporter.log("Test is started |");
      driver.get("https://www.training-support.net/selenium/javascript-alerts");
      Reporter.log("Opening browser |");
      Reporter.log("Page tittle is"+driver.getTitle()+"|");
      
      
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  driver.switchTo().defaultContent() ;
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
