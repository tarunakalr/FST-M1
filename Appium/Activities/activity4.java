package activities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class activity4 {

	AndroidDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@Test
	public void Createcontact() throws InterruptedException {
		driver.findElementByAccessibilityId("Create new contact").click();
		// adding details
		MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='First name']");

		MobileElement lastName = driver.findElementByXPath("//android.widget.EditText[@text='Last name']");

		MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");

		firstName.sendKeys("Test2");

		lastName.sendKeys("User2");

		phoneNumber.sendKeys("1234578");
		driver.findElementById("com.android.contacts:id/editor_menu_save_button").click();

		Thread.sleep(4000);

		MobileElement contactcard = driver.findElementById("com.android.contacts:id/toolbar_parent");

		Assert.assertTrue(contactcard.isDisplayed());

		String ContactName = driver.findElementById("com.android.contacts:id/large_title").getText();

		Assert.assertEquals(ContactName, "Test2 User2");

	}

	@BeforeClass
	public void beforeClass() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "TestEmulator");

		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");

		caps.setCapability("appPackage", "com.android.contacts");

		caps.setCapability("appActivity", ".activities.PeopleActivity");

		caps.setCapability("noReset", true);

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 10);
		System.out.println("contacts are open");

	}

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
