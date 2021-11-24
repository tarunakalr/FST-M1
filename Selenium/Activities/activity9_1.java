package activities;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class activity9_1 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		        WebDriver driver = new FirefoxDriver();

		       
		        driver.get("https://training-support.net/selenium/selects");

		       
		        Select dropdown = new Select(driver.findElement(By.id("single-select")));

		        //Select second option by visible text
		        dropdown.selectByVisibleText("Option 2");
		        Thread.sleep(2000);

		        //Select third option by index
		        dropdown.selectByIndex(3);
		       
		        //Select fourth option

		        dropdown.selectByValue("4");
                    Thread.sleep(2000);
driver.close();
		        
		        
		       
	}

		     
}
		   
		

	
