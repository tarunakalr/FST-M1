package activities;

import java.util.List;

//import org.apache.xmlbeans.SchemaTypeSystem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity8_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();	
		//Actions builder = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://training-support.net/selenium/tables");
	    List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		
		System.out.println(cols.size());
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		System.out.println(rows.size());
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
    	
        for(WebElement c : thirdRow) {
	
            System.out.println(c.getText());
	
        }
	

        WebElement col2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
	
        System.out.println(col2_2.getText());
	

        driver.close();
	
    }
}
		
		
		
	
		
	
	
      



