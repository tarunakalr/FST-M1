package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class activity5 {
 WebDriver driver;
 
  @BeforeClass
  
  public void beforeClass() {
	driver = new FirefoxDriver();	
	driver.get( "https://www.training-support.net/selenium/target-practice");
	
  }

 
  @Test
  public void test1() {
	  String  text = driver.getTitle();
  	  //System.out.println("tittle of page is "+text);
  	  Assert.assertEquals("Target Practice", text);
  }
  @Test  (groups = {"HeaderTests"})
  public void Headertest2()
  {
	  String text1= driver.findElement(By.id("third-header")).getText();
	  Assert.assertEquals( text1,"Third header");
  }
  
  @Test  (groups = {"HeaderTests"})
  public void Headertest3() {
	  
	  WebElement obj= driver.findElement(By.cssSelector(".ui.green.header"));
			   String text2=obj.getCssValue("Color");
			   Assert.assertEquals(text2, "rgb(251, 189, 8)");
			   
  }
  
  @Test (groups = {"ButtonTests"})
  public void Buttontest1() {
	 String button1= driver.findElement(By.cssSelector(".ui.olive.button")).getText();
			Assert.assertEquals(button1, "Olive");
	 
  }
  
  @Test (groups = {"ButtonTests"})
  public void Buttontest2() {
	 String button2= driver.findElement(By.cssSelector(".ui.brown.button")).getText();
	 Assert.assertEquals(button2, "Brown");
  }
  
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
