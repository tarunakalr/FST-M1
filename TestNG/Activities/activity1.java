package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class activity1 {
	  WebDriver driver;	
  @Test
  public void get() {
	  
	 
	 String  text = driver.getTitle();
	  System.out.println("tittle of page is "+text);
	  Assert.assertEquals("Training Support", text);
	  driver.findElement(By.id("about-link")).click();
	  
	  String text1 = driver.getTitle();
	  System.out.println("tittle of page is "+text1);
	  
	  Assert.assertEquals("About Training Support", text1);
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();	
	  driver.get("https://www.training-support.net");
	 
	  
	  }

  @AfterMethod
  public void afterMethod() {
  
driver.quit();
  }

}
