package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class activity5 {
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
  public void editInfo() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();
	  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	  Thread.sleep(2000);
	  WebElement Fname= driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
	  Fname.clear();
	  
	  Fname.sendKeys("Bella");
	  Thread.sleep(2000);
	  WebElement Lname= driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
	  Lname.clear();
	  Lname.sendKeys("Joseph");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("personal_cmbNation")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//option[@value='82']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
