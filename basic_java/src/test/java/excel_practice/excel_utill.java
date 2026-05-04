package excel_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_utill {

	
	private Workbook workbook;
	private Sheet sheet;
	
	
	public excel_utill(String filepath,String sheetname) throws IOException {
		
		FileInputStream fi=new FileInputStream(filepath);
		
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		
	}
	
	public int getrowcount() {
		return sheet.getLastRowNum();
	}
	
	public int getcellcount() {
		return sheet.getRow(0).getLastCellNum();
	
	}
	
	
	public String getcellData(int rownum,int cellnum) {
		
		Cell cell=sheet.getRow(rownum).getCell(cellnum);
		
		DataFormatter formatter=new DataFormatter();
		return formatter.formatCellValue(cell);	
	}
	
	
	public Object[][] getdata(){
		int rows=getrowcount();
		int cols=getcellcount();
		Object[][] data=new Object[rows][cols];
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=0;j<cols;j++) {
				data[i-1][j]=getcellData(i,j);
			}
			
			
		}
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
