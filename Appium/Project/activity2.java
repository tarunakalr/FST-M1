package Project;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class activity2 {
	AndroidDriver<MobileElement> driver = null;
	WebDriverWait wait;
	 @BeforeClass
	  public void beforeClass() throws MalformedURLException {
		 
	        DesiredCapabilities caps = new DesiredCapabilities();
	    	caps.setCapability("deviceName", "TestEmulator");
		
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
		
	        caps.setCapability("appPackage", "com.google.android.keep");
	        
		
	        caps.setCapability("appActivity", ".activities.BrowseActivity");
		
	        caps.setCapability("noReset", true);
	        
	        
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait= new WebDriverWait(driver, 10);
	        System.out.println("Google keep is open");
		
	 
	  }
	 @Test
	 public void GglKeep() throws InterruptedException
	 
	 {
		 
		 wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("New text note")));
		 
		 driver.findElementByAccessibilityId("New text note").click();
		 Thread.sleep(1000);
		 
		 driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("abc");
		 Thread.sleep(1000);
		 driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("task1");
		 Thread.sleep(1000);
		 
		
		 
		 
	 driver.findElementByAccessibilityId("Navigate up").click();
	 Thread.sleep(2000);
	
		String addedNote= driver.findElementById("com.google.android.keep:id/index_note_title").getText();
		
		Assert.assertEquals(addedNote,"abc");
		 
	 }
	 
 
      public void afterClass() {
	  driver.quit();
  }

}


