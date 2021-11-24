	package activities;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        WebElement user = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        user.sendKeys("Taruna");
        String NewUser= user.getText();
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("Kalra");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("Kalra");
        
        driver.findElement(By.xpath("//input[contains(@class, 'email')]")).sendKeys("abx@xyz.com");
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Thank you for registering,"+NewUser));
        String text= driver.findElement(By.id("action-confirmation")).getText();
        
        System.out.println(text);
        driver.close();
      
	}

}
