package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class activity7 {
	WebDriver driver;
	
	
	 @BeforeClass
	  public void beforeClass() throws InterruptedException 
	 {
		  driver = new FirefoxDriver();	
			 driver.get("http://alchemy.hguy.co/orangehrm");
			 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
			  driver.findElement(By.id("btnLogin")).click();
		      Thread.sleep(2000);
	  }
	 
  @Test
  public void AddWE() throws InterruptedException
  {
	  driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[9]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"addWorkExperience\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("experience_employer")).sendKeys("IBM");
	  Thread.sleep(2000);
	  driver.findElement(By.id("experience_jobtitle")).sendKeys("Test Analyst");
	  Thread.sleep(2000);
	  driver.findElement(By.id("btnWorkExpSave")).click();
	  
	  
	
  }
 

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
