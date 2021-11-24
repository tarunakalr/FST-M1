package Project;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class activity2_1 {
	
	AndroidDriver<MobileElement> driver= null;
	WebDriverWait wait  ;

 
  
  @BeforeClass
 
	  public void BeforeClass() throws MalformedURLException {
		  
	      DesiredCapabilities caps = new DesiredCapabilities();
	  	
	      caps.setCapability("deviceName", "<device name>");
		
	      caps.setCapability("platformName", "Android");
		
	      caps.setCapability("appPackage", "com.android.chrome");
		
	      caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
	      caps.setCapability("noReset", true);
	      
	      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	  	
	      driver = new AndroidDriver<MobileElement>(appServer, caps);
		
	      wait = new WebDriverWait(driver, 5);
	      
	      driver.get("https://www.training-support.net/selenium");
	      
  }

  @Test
  
  public void todoList() throws InterruptedException {
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[2][contains(@text,'Get Started!')]")));      
	      
	  driver.findElementByXPath("//android.widget.Button[2][contains(@text,'Get Started!')]").click(); 
	  
		
	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5).scrollIntoView(textContains(\"To-Do List\"))")).click();
	  
	  String tasks[] = {"Add tasks to list","Get number of tasks","Clear the list"};
	  
	  for(String addtask:tasks)
	  {
	 
	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@resource-id='taskInput']")));
	  driver.findElementById("taskInput").sendKeys(addtask);
	  Thread.sleep(5000);
	  driver.findElementByXPath("//android.widget.Button[contains(@text,'Add Task')]").click();
	  Thread.sleep(5000);
	  }
	  
	  driver.findElementByXPath("//android.view.View[contains(@text,'Add tasks to list')]").click();
	  driver.findElementByXPath("//android.view.View[contains(@text,'Get number of taskst')]").click();
	  driver.findElementByXPath("//android.view.View[contains(@text,'Clear the list')]").click();
	  Thread.sleep(5000);
	  
	  driver.findElementByXPath("//android.view.View[contains(@text,'Clear List')]").click();
	  
	  
	  		
	  
  }
  
  
  @AfterClass
   
  public void AfterClass()
  {
	driver.quit();
	
  }
}
  


