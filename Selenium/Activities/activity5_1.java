package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        
        WebElement obj1 = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        boolean value= obj1.isDisplayed();
        System.out.println("Check box is" + value);
        
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println("Check box is" + value);
        
        driver.close();
        
        
        
        

	}

}
