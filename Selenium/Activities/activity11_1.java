package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity11_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        
        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        
        String text = simpleAlert.getText();
        System.out.println("Alert message is "+ text);
         simpleAlert.accept();
         driver.close();
         
        

	}

}
