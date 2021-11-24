package activities;

import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class activity1 {
	AndroidDriver<MobileElement> driver = null;
	WebDriverWait wait;
	 @Test
	  public void CalcTest() throws MalformedURLException {
		 
	        DesiredCapabilities caps = new DesiredCapabilities();
	    	caps.setCapability("deviceName", "TestEmulator");
		
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
		
	        caps.setCapability("appPackage", "com.android.calculator2");
	        
		
	        caps.setCapability("appActivity", ".Calculator");
		
	        caps.setCapability("noReset", true);
	        
	        
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait= new WebDriverWait(driver, 10);
	        System.out.println("calculator is open");
		
	 
	        	driver.quit();
  }

}


