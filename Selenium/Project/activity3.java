package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class activity3 {
	
	WebDriver driver;
	
	
	@BeforeClass
	
	  public void beforeClass() {
		driver = new FirefoxDriver();	
		 driver.get("http://alchemy.hguy.co/orangehrm");
	  }
  @Test
  public void getInputs() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  String text=driver.getTitle();
	  //System.out.println(text);
	  
	 Assert.assertEquals(text, "OrangeHRM");
	 
	  
	}
  

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
