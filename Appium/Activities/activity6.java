package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class activity6 {
	AndroidDriver<MobileElement>  driver = null;
	WebDriverWait wait ;
	
	@Test(priority=1)
  public void Imagetest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementByClassName("android.view.View"), "Lazy Loading"));
		 
		// List<MobileElement> imgCount =driver.findElementsByXPath("//android.widget.Image");
		
        List<MobileElement> imgCount = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
    	
        System.out.println("Number of image shown currently: " + imgCount.size());
		 //System.out.println("no of images" +imgCount.size());
  }
	
	@Test
	  public void ImageAftertest() {
		 driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"helen\"))")).click();
			
			// wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementByClassName("android.view.View"), "Lazy Loading"));
			 
			// List<MobileElement> imgCount =driver.findElementsByXPath("//android.widget.Image");
			
	        List<MobileElement> imgCount = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
	    	
	        System.out.println("Number of image shown currently: " + imgCount.size());
			 //System.out.println("no of images" +imgCount.size());
	  }
	
	
	
	
  @BeforeClass
  public void beforeClass() throws MalformedURLException, InterruptedException {
	  
      DesiredCapabilities caps = new DesiredCapabilities();
  	
      caps.setCapability("deviceName", "<device name>");
	
      caps.setCapability("platformName", "Android");
	
      caps.setCapability("appPackage", "com.android.chrome");
	
      caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	
      caps.setCapability("noReset", true);
      
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
  	
      driver = new AndroidDriver<MobileElement>(appServer, caps);
	
      wait = new WebDriverWait(driver, 5);
      
      driver.get("https://www.training-support.net/selenium/lazy-loading");
      
      Thread.sleep(2000);
      
      
  }

  @AfterClass
  public void afterClass() {
	  
	 driver.quit();
	 
  }

}
