package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.training-support.net");
	        System.out.println(driver.getTitle());
	        driver.findElement(By.xpath("//a[@id='about-link']")).click();
	        System.out.println("New page");
	        System.out.println(driver.getTitle());
	        driver.close();
	        
	}

}
