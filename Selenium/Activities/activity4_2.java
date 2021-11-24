package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
			 WebDriver driver = new FirefoxDriver();
		        driver.get("https://www.training-support.net/selenium/simple-form");
		        System.out.println(driver.getTitle());
		        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Taruna");
		        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kalra");
		        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@xyz.com");
		        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9876543456");
		        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/textarea[1]")).sendKeys("This is selenium test");
		        driver.findElement(By.xpath("//input[@class='ui green button']")).click();
		        
		        Thread.sleep(2000);
		        driver.close();

	}

}
