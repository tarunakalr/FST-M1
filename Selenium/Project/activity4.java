package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class activity4 {
	
	WebDriver driver;
	 @BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();	
		 driver.get("http://alchemy.hguy.co/orangehrm");
	  
	  }
  @Test
  public void getinputs() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	 // String text=driver.getTitle();
	  //System.out.println(text);
	  
	// Assert.assertEquals(text, "OrangeHRM");
	  
	  driver.findElement(By.id("menu_pim_viewPimModule")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#btnAdd")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.id("firstName")).sendKeys("Prabha");
	  Thread.sleep(2000);
	  driver.findElement(By.id("lastName")).sendKeys("Batra");
	  driver.findElement(By.id("btnSave")).click();
	  
	  
	  driver.findElement(By.id("menu_pim_viewPimModule")).click();
	  
	  driver.findElement(By.id("searchBtn")).click();
	  driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Prabha");
	  Thread.sleep(2000);
	  driver.findElement(By.id("searchBtn")).click();
	  Thread.sleep(2000);
	  
	  WebElement tableRow = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));
	  String rowtext = tableRow.getText();
	  
	  Assert.assertEquals(rowtext,"Prabha");
	  	 
	  
  }

  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
