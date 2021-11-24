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

public class projectactivity1 {
	AndroidDriver<MobileElement> driver = null;
	WebDriverWait wait;
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
	  	caps.setCapability("deviceName", "TestEmulator");
		
	      caps.setCapability("platformName", "Android");
	      caps.setCapability("automationName", "UiAutomator2");
		
	      caps.setCapability("appPackage", "com.google.android.apps.tasks");
	      
		
	      caps.setCapability("appActivity", ".ui.TaskListsActivity");
		
	      caps.setCapability("noReset", true);
	      
	      
	      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	      driver = new AndroidDriver<MobileElement>(appServer, caps);
	      wait= new WebDriverWait(driver, 10);
	      System.out.println("Google tasks is open");
	  }
  @Test
  public void addTasks() throws InterruptedException {
	  
	  String[] taskstoAdd  = {
			  "Complete Activity with Google Tasks",
			  "Complete Activity with Google Keep",
			  "Complete the second activity Google keep"
	  
	  };
	  for(String tasktoAdd : taskstoAdd)
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task")));
	  driver.findElementByAccessibilityId("Create new task").click();
	  Thread.sleep(1000);
	  driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys(tasktoAdd);
	  Thread.sleep(1000);
	  driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	  
	 String taskdetails=  driver.findElementById("com.google.android.apps.tasks:id/task_name").getText();
	 
	 Assert.assertEquals(taskdetails, "Complete the second activity Google keep");
	  
	  
	  }
	  
	  		
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
