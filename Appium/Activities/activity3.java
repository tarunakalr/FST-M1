package activities;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.WebDriverWait;


public class activity3 {
	AndroidDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
	
	 @BeforeClass
	  public void BeforeClass() throws MalformedURLException {
		 
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
	 }
	 
	    @Test
		
	    public void add() {
		
	        driver.findElementById("digit_5").click();
		
	        driver.findElementById("op_add").click();
		
	        driver.findElementById("digit_9").click();
		
	        driver.findElementById("eq").click();
		
		
	        String result = driver.findElementById("result").getText();
		
	        System.out.println(result);
		
	        Assert.assertEquals(result, "14");
		
	    }
		
	    
		
	    @Test
		
	    public void subtract() {
		
	        driver.findElementById("digit_1").click();
		
	        driver.findElementById("digit_0").click();
		
	        driver.findElementById("op_sub").click();
		
	        driver.findElementById("digit_5").click();
		
	        driver.findElementById("eq").click();
		
	 
		
	       
		
	        String result = driver.findElementById("result").getText();
		
	        System.out.println(result);
		
	        Assert.assertEquals(result, "5");
		
	    }
		
	 
		
	    @Test
		
	    public void multiply() {
		
	        driver.findElementById("digit_5").click();
		
	        driver.findElementById("op_mul").click();
		
	        driver.findElementById("digit_1").click();
		
	        driver.findElementById("digit_0").click();
		
	        driver.findElementById("digit_0").click();
		
		
	        driver.findElementById("eq").click();
		
	        String result = driver.findElementById("result").getText();
		
	        System.out.println(result);
		
	        Assert.assertEquals(result, "500");
		
	    }
		
	 
		
	    @Test
		
	    public void divide() {
		
	        driver.findElementById("digit_5").click();
		
	        driver.findElementById("digit_0").click();
		
	        driver.findElementById("op_div").click();
		
	        driver.findElementById("digit_2").click();
		
	        driver.findElementById("eq").click();
		
	        String result = driver.findElementById("result").getText();
		
	        System.out.println(result);
		
	        Assert.assertEquals(result, "25");
		
	    }
		
	        @AfterClass
	        public void AfterClass() 
	        {
	      	  driver.quit();
  }

}


