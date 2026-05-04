package File_related_testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_data_from_xl {

	static List<String> userName = new ArrayList<String>();
	static List<String> passWord = new ArrayList<String>();

	public void data_from_xl() throws IOException {

		String file_path="/home/sellerp26/Abiraj_project/basic_java/src/test/resources/test_data.xlsx";
		FileInputStream excelfile = new FileInputStream(file_path);

		Workbook wb = new XSSFWorkbook(excelfile);
		Sheet sheet = wb.getSheet("test_data");

		Iterator<Row> rowiterator = sheet.iterator();

		while (rowiterator.hasNext()) {
			Row rowvalue = rowiterator.next();

			Iterator<Cell> celliterator = rowvalue.iterator();

			int i = 2;
			while (celliterator.hasNext()) {
				if (i % 2 == 0) {
					userName.add(celliterator.next().getStringCellValue());
				} else {
					passWord.add(celliterator.next().getStringCellValue());
				}

				i++;

			}

		}

	}

	public void login(String uName, String pWord) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.preprod2.platform.sellermania.com");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(uName);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pWord);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.close();

	}

	public void execution() {

		for (int i = 0; i < userName.size(); i++) {
			login(userName.get(i), passWord.get(i));
		}

	}

	public static void main(String[] args) throws IOException {

		Test_data_from_xl data = new Test_data_from_xl();

		data.data_from_xl();

		System.out.println("username list" + userName);

		System.out.println("password list" + passWord);

		data.execution();

	}

}
