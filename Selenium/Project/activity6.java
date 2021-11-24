package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class activity6 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		
		driver = new FirefoxDriver();	
		 driver.get("http://alchemy.hguy.co/orangehrm");
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
	      Thread.sleep(2000);
	  }
  @Test
  public void directoryCheck() 
  {
	  WebElement obj1= driver.findElement(By.xpath("//b[contains(text(),'Directory')]"));
	  boolean status= obj1.isDisplayed();
	  Assert.assertEquals(true, status);
	  
  }
  @Test
  public void directoryEnable()  
  {
      WebElement obj1= driver.findElement(By.xpath("//b[contains(text(),'Directory')]"));
	  boolean status1 = obj1.isEnabled();
	  Assert.assertEquals(true, status1);
	  
  }
  
  @Test
  
  public void directoryClick()  
  {
	  driver.findElement(By.xpath("//b[contains(text(),'Directory')]")).click();
	  
	WebElement obj2 = driver.findElement(By.xpath("//div[@class='head']"));
	
	String text=  obj2.getText();
	
	Assert.assertEquals("Search Directory", text); 
	
	System.out.println("text is " + text);
	  
	  
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
