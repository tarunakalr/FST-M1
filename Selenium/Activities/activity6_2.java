package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());
       driver.findElement(By.cssSelector(".ui.violet.button")).click();
       
       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
       
       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1"),"HELLO!"));
       
       
       
       
    String text= driver.findElement((By.id("ajax-content"))).getText();
               System.out.println(text);
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3"),"I'm late!"));
      String text2= driver.findElement((By.id("ajax-content"))).getText();
      System.out.println(text2);
      driver.close();
      
      
      
      
    
       
	}

}
