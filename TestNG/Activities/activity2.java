package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

public class activity2 {
	WebDriver driver;
	
    @BeforeTest
  public void beforeClass() 
    {
		driver = new FirefoxDriver();	
		driver.get("https://www.training-support.net/selenium/target-practice");
  }
    @Test
    public void Test1() {
    	String  text = driver.getTitle();
  	  System.out.println("tittle of page is "+text);
  	  Assert.assertEquals("Training Support", text);
    }
    @Test
    public void Test2() {
    	
    WebElement obj=	driver.findElement(By.xpath("//button[contains(text(),'Black')]"));
    Assert.assertTrue(obj.isDisplayed());
    Assert.assertEquals(obj.getText(),"RED");
    }
    @Test(enabled= false)
    
    public void Test3() {
    System.out.println("It should be skipped");
    }
    @Test
    public void Test4()
    {
    	   throw new SkipException("Skipping test case");  
    }  

  @AfterTest
  public void afterClass() {
	  driver.close();
	  
  }

}
