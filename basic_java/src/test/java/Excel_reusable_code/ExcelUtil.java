package Excel_reusable_code;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	private Workbook workbook;
	private Sheet sheet;
	
	/*These are class-level variables.

	Why?
	Because:
	Constructor initializes them once.
	All methods use same workbook & sheet.*/
	
	
	//constructor for load excel file and sheet
	
	public ExcelUtil(String filepath,String sheetName)
	{
		try {
			FileInputStream fis=new FileInputStream(filepath);
			workbook=new XSSFWorkbook(fis);
//			👉 Converts file stream into Workbook object.
//			👉 Apache POI now understands Excel structure.
//			Internally:
//			Parses XML of Excel file
//			Loads sheets into memory
		
			sheet=workbook.getSheet(sheetName);
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	//get total row count(excluding header)
	
	public int getRowCount(){
		return sheet.getLastRowNum();
	
	}
	
	// Get total column count
	
	public int getCellCount(){
		
		return sheet.getRow(0).getLastCellNum();	
	}
	
	
	// Get cell data as String
	
	public String getcellData(int rowNum,int cellNum){
		Cell cell=sheet.getRow(rowNum).getCell(cellNum);
		DataFormatter formatter=new DataFormatter();
		return formatter.formatCellValue(cell);

	}
	 // Read entire Excel into 2D Object array
	
	public Object[][] getData(){
		int rows=getRowCount();
		int cols=getCellCount();
		
		Object[][] data=new Object[rows][cols];
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=0;j<cols;j++) {
				data[i-1][j]=getcellData(i, j);
			}
			
			
		}
		return data;
		
	}
	
	
	
	
	
}
