package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity_11_2 {
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();	
	driver.get("https://www.training-support.net/selenium/javascript-alerts");
    System.out.println(driver.getTitle());
    
    driver.findElement(By.id("confirm")).click();
    Alert confirmAlert = driver.switchTo().alert();
    
    String text = confirmAlert.getText();
    System.out.println("Alert message is "+ text);
     confirmAlert.accept();
     
     driver.findElement(By.id("confirm")).click();
     
     System.out.println("Now dismiss again");
     
     confirmAlert.dismiss();
     
     
     driver.close();
}
}

     


