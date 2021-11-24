package activities;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class activity2 {
	AndroidDriver<MobileElement> driver = null;
	WebDriverWait wait;
	 @BeforeClass
	  public void BeforeClass() throws MalformedURLException {
		 
	        DesiredCapabilities caps = new DesiredCapabilities();
	    	caps.setCapability("deviceName", "TestEmulator");
		
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
		
	        caps.setCapability("appPackage", "com.android.chrome");
	        
		
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
	        caps.setCapability("noReset", true);
	        
	        
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait= new WebDriverWait(driver, 10);
	        System.out.println("chrome is open");
	 }
	 
	 @Test
	 public void getHeading() throws InterruptedException
	 {
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	        
	    	
	        driver.get("https://www.training-support.net/");
	        
	        Thread.sleep(2000);
	        
	       // wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[@text='Training Support']")));
	        
	      
		
	 
		
	        String Title = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
		
	        System.out.println("Title on Homepage: " + Title);
	        
	        
	        
	        MobileElement butt = driver.findElementByXPath(("//android.view.View[@text='About Us']"));
	    	
	        butt.click();
	        String newPage = 
	       driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]") .getText();
			
		
	        System.out.println("Title on new page: " + newPage);
		
	        Assert.assertEquals(Title, "Training Support");
		
	        Assert.assertEquals(newPage, "About Us");
		
	    }    
	        
	 
	 
	        @AfterClass
	        public void AfterClass() {
	      	  driver.quit();
	        }
  }





