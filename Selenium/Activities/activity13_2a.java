package activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class activity13_2a {
	
    public void writeExcel(String filePath) throws IOException {
    
        XSSFWorkbook wb = new XSSFWorkbook();
	
 
        XSSFSheet sheet = wb.createSheet("Sheet1");
	
        List<String[]> data = new ArrayList<String[]>();
	
        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
	
        String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
	
        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
	
        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};
	
        
	
        data.add(heading);
	
        data.add(row1);
	
        data.add(row2);
	
        data.add(row3);

        int rownum = 0;
    	
        for (String[] rowData : data) {
	
            //Creates a new row in the sheet
	
            Row row = sheet.createRow(rownum++);
	
            int cellnum = 0;
	
            for (String cellData : rowData) {
	
                //Creates a cell in the next column of that row
	
                Cell cell = row.createCell(cellnum++);
	
                cell.setCellValue(cellData);
	
            }
	
        }
	
        try {
	
            //this Writes to the workbook
	
            FileOutputStream out = new FileOutputStream(new File(filePath));
	
            wb.write(out);
	
            out.close();
	
            wb.close();
	
        }
	
        catch (Exception e) {
	
            e.printStackTrace();
	
        }
	
    }
	
 
	
  
    @SuppressWarnings("rawtypes")
	public void readExcel(String filePath) {
	
        try {
	
            FileInputStream file = new FileInputStream(filePath);
	
 
	
            //Create Workbook instance holding reference to Excel file
	
            XSSFWorkbook workbook = new XSSFWorkbook(file);
	
 
	
            //Get first sheet from the workbook
	
            XSSFSheet sheet = workbook.getSheetAt(0);
	
 
	
            //Iterate through each rows one by one
	
            Iterator<Row> rowIterator = sheet.iterator();
	
            while (rowIterator.hasNext()) {
	
                Row row = rowIterator.next();
	
                //For each row, iterate through all the columns
	
                Iterator<Cell> cellIterator = row.cellIterator();
	
 
	
                while (cellIterator.hasNext()) {
	
                    Cell cell = cellIterator.next();
	
                    //Check the cell type and format accordingly
	
                    switch (cell.getCellType()) {
	
                    case NUMERIC: 
	
                        System.out.print(cell.getNumericCellValue() + " \t ");
	
                        break;
	
                    case STRING: 
	
                        System.out.print(cell.getStringCellValue() + " \t ");
	
                        break;
	
                    default:
	
                        System.out.println("Invalid value");
	
                        break;
	
                    }
	
                }
	
                System.out.println("");
	
            }
	
            file.close();
	
            workbook.close();
	
        }
	
        catch (Exception e) {
	
            e.printStackTrace();
	
        }
	
    }
	
 
	
    public static void main(String args[]) throws IOException {
	
        //Prepare the path of excel file
	
        String filePath = "src/test/resources/sample.xlsx";
	
 
	
        //Create an object of current class
	
        activity13_2a objExcelFile = new activity13_2a();
	
	
        objExcelFile.writeExcel(filePath);
	
       
	
        objExcelFile.readExcel(filePath);
	
    }
	
}

