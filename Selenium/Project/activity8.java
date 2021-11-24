package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class activity8 {
	WebDriver driver;
	
	
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
		  driver = new FirefoxDriver();	
			 driver.get("http://alchemy.hguy.co/orangehrm");
			 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
			  driver.findElement(By.id("btnLogin")).click();
		      
	  }
	  @Test
	  public void ApplyLeaves() throws InterruptedException {
	 
	  
	  {
		  driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]"));
		  driver.findElement(By.xpath("//span[contains(text(),'Apply Leave')]"));
		  Thread.sleep(2000);
		WebElement applyLeave = driver.findElement(By.xpath("//option[contains(text(),'--Select--')]"));
		
		Select leaveType= new Select(applyLeave);
		leaveType.selectByIndex(2);
		  
	  }
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
