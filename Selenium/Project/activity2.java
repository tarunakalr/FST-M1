package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class activity2 {
	WebDriver driver;
	 @BeforeClass
	 
	 public void beforeClass() {
		 driver = new FirefoxDriver();	
		 driver.get("http://alchemy.hguy.co/orangehrm");
	  }
  @Test
  public void getimage() {
	  WebElement obj= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	 String text=  obj.getAttribute("src");
	 System.out.println("URL of image is" +text);
	  
  }
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
