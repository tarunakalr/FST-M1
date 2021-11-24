package activities;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class activity1 {
	WebDriver driver;



	
	@BeforeClass
	public void beforeClass() {
		 driver = new FirefoxDriver();	
		 driver.get("http://alchemy.hguy.co/orangehrm");
	}
  @Test
  public void fetchTittle () {
	  String  text = driver.getTitle();
  	  System.out.println("tittle of page is "+text);
  	  Assert.assertEquals("OrangeHRM", text);
  }
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
