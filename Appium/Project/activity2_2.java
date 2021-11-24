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
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class activity2_2 {
	
	AndroidDriver<MobileElement>  driver = null;
	WebDriverWait wait ;
 
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
  
  public void validCredentials() throws InterruptedException {
	  	
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[2][contains(@text,'Get Started!')]")));
	  driver.findElementByXPath("//android.widget.Button[2][contains(@text,'Get Started!')]").click();
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[contains(@text,'Login Form')]")));
	  driver.findElementByXPath("//android.view.View[contains(@text,'Login Form')]").click();
	
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[1][contains(@resource-id,'username')]")));
	  driver.findElementByXPath("//android.widget.EditText[1][contains(@resource-id,'username')]").sendKeys("admin");
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[2][contains(@resource-id,'password')]")));
	  driver.findElementByXPath("//android.widget.EditText[2][contains(@resource-id,'password')]").sendKeys("password");
	  driver.findElementByXPath("//android.widget.Button[contains(@text,'Log in')]").click();
	//  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[4][contains(@text,'Welcome Back,admin')]")));
	 Thread.sleep(5000);
	  String loginMesssage = driver.findElementByXPath("//android.view.View[contains(@text,'Welcome Back, admin')]").getText();
			
	  
	
	  Assert.assertEquals(loginMesssage, "Welcome Back, admin");
  }
  @Test (priority=2)
  public void invalidCredentials() throws InterruptedException {
	  	
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[2][contains(@text,'Get Started!')]")));
	  Thread.sleep(5000);
	  driver.findElementByXPath("//android.widget.Button[2][contains(@text,'Get Started!')]").click();
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[contains(@text,'Login Form')]")));
	  driver.findElementByXPath("//android.view.View[contains(@text,'Login Form')]").click();
	
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[1][contains(@resource-id,'username')]")));
	  driver.findElementByXPath("//android.widget.EditText[1][contains(@resource-id,'username')]").sendKeys("admins");
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[2][contains(@resource-id,'password')]")));
	  driver.findElementByXPath("//android.widget.EditText[2][contains(@resource-id,'password')]").sendKeys("password");
	  driver.findElementByXPath("//android.widget.Button[contains(@text,'Log in')]").click();
	
	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[4][contains(@text,'Invalid Credentials')]")));
	  Thread.sleep(5000);
	  String output = driver.findElementByXPath("//android.view.View[contains(@text,'Invalid Credentials')]").getText();
	
	  Assert.assertEquals(output, "Invalid Credentials");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  
	  
	  //android.widget.Button[@text='Log in']
  }

}
