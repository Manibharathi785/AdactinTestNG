package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataFromExcel {

	WebDriver driver;

	String[][] data = null;

	@DataProvider(name = "LoginData")
	public String[][] loginDataProvider() throws BiffException, IOException {

		data = getExcelData();
		return data;
	}

	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Excel\\JXL.xls");
		Workbook wb = Workbook.getWorkbook(excel);
		Sheet sht = wb.getSheet(0);
		int rows = sht.getRows();
		int columns = sht.getColumns();
		String[][] testData = new String[rows - 1][columns - 1];
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < columns; j++) {
				testData[i - 1][j - 1] = sht.getCell(j, i).getContents();
			}
		}
		return testData;
	}

	@BeforeTest
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Chrome 114\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	@Test(dataProvider = "LoginData")
	public void loginCombinations(String uName, String pWord) throws IOException {

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(uName);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pWord);
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();

	}

}
