package File_related_testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class xl_related {

	
	@Test
	public void xl_cases() throws IOException {
		
		FileInputStream fi=new FileInputStream("/home/sellerp26/Abiraj_project/basic_java/src/test/resources/test_data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet("test_data");
		XSSFRow row=sheet.getRow(0);
		
	int	rc=sheet.getLastRowNum();
		int cc=row.getLastCellNum();
		System.out.println(rc+"  "+cc);
		fi.close();
		wb.close();
		
		
	}
	
	
	
	
	
}
