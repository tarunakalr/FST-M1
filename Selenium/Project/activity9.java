package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class activity9 {
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
  public void EmergencyContacts() throws InterruptedException {
	  
	  
	  driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(text(),'Emergency Contacts')]")).click();
	  
	// List <WebElement> tablerows = driver.findElements(By.xpath("//table[@id='emgcontact_list']"));
	  
	  
	  
	 
	  
	 
	 for(int i=1; i<= 15; i++) {
		   WebElement row = driver.findElement(By.xpath("//table[@id='emgcontact_list']//tr[" + i + "]"));
		    System.out.println("Row " + i + ": " + row.getText());
	 }
		}
	  
	  
	  
	//a[contains(text(),'Emergency Contacts')]
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
