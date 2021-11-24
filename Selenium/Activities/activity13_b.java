package activities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity13_b {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        
        String filePath = "C:/Users/TarunaKalra/Desktop/FST traning/Fsample.csv";

        
        activity13_b srcExcel = new activity13_b();
        
        
        List<List<String>> data = srcExcel.readExcel(filePath);
        List<String> row;
        
        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        
        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        
       
        row = data.get(1);
            
        //Find the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        
        firstName.sendKeys(row.get(1));
        lastName.sendKeys(row.get(2));
        
        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(row.get(3));
        
        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys(row.get(4));
        
        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        
        //Switch to alert
        Alert message = driver.switchTo().alert();
        
        //Get alert message
        System.out.println("Alert message: " + message.getText());
        message.accept();

        //Close the browser
        driver.close();
    }
    
    public List<List<String>> readExcel(String filePath) {
        List<List<String>> data = new ArrayList<List<String>>();
        try {
            FileInputStream file = new FileInputStream(filePath);

           
            XSSFWorkbook workbook = new XSSFWorkbook(file);

          
            XSSFSheet sheet = workbook.getSheetAt(0);

            
            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()) {
               
                List<String> rowData = new ArrayList<String>();
                Row row = rowIterator.next();
                
                
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if(row.getLastCellNum() == 5) {
                      
                        rowData.add(cell.getStringCellValue());
                    }
                }
             
                data.add(rowData);
            }
            file.close();
            workbook.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}