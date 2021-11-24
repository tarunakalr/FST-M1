package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;

import org.testng.annotations.BeforeClass;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class activity5 {
	
AndroidDriver<MobileElement> driver =null;
WebDriverWait wait;

  @Test
  public void OpenSMS() {
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("description(\"Start new conversation\")")));
	  
	  driver.findElement(MobileBy.AndroidUIAutomator("description(\"Start new conversation\")")).click();
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resource-id(\"com.google.android.apps.messaging:id/recipient_text_view\")")));
	  MobileElement text  =driver.findElement(MobileBy.AndroidUIAutomator("resource-id(\"com.google.android.apps.messaging:id/recipient_text_view\")"));
	  
	  
	  text.sendKeys("9560870909");
	  
	
	  
	  
	 
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("deviceName", "<device name>");
	  caps.setCapability("platformName", "Android");
	  caps.setCapability("appPackage", "com.google.android.apps.messaging");
	  caps.setCapability("appActivity", ".ui.ConversationListActivity");
	  caps.setCapability("noReset", true);
	  
	// Instantiate Appium Driver
	  URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	  driver = new AndroidDriver<MobileElement>(appServer, caps);
  }

  @AfterClass
  public void afterClass() {
  }

}
