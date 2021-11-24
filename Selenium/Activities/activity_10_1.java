package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity_10_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
        
       WebElement cube= driver.findElement(By.id("wrapD3Cube"));
       actions.click(cube);
       WebElement cubeVal = driver.findElement(By.className("active"));
       String text= cubeVal.getText();
       System.out.println("on left click"+ text);
       
       //double click
       
       actions.doubleClick(cube).perform();
       cubeVal=driver.findElement(By.className("active"));
       String text1= cubeVal.getText();
       System.out.println("on double click"+ text1);
       
       //right click
       
       actions.contextClick(cube).perform();
       cubeVal=driver.findElement(By.className("active"));
       String text2= cubeVal.getText();
       System.out.println("on right click"+ text2);
       
       driver.close();
       
       
       
   	
     
        

	}

}