package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//h3[@id='third-header']"));
        
        WebElement obj1=driver.findElement(By.xpath("//h5"));
        		String value1 =obj1.getCssValue("color");
        		System.out.println("color of header is"+ value1);
        WebElement obj2	=	driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
        String Value2=obj2.getAttribute("class");
        System.out.println("class attributes are "+ Value2);
        WebElement obj3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[2]"));
        String Value3= obj3.getText();
        System.out.println("Grey button text is"+ Value3);
        
        
        driver.close();
        
                
              
                
                
        		
        		
        		

	}

}
