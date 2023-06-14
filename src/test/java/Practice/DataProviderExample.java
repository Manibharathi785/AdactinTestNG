package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	WebDriver driver;

	String[][] data = { { "sampleproject", "Mani@adactin222" }, { "sampleproject1", "Mani@adactin785" },
			{ "sampleproject1", "Mani@adactin222" }, { "sampleproject", "Mani@adactin785" } };

	@DataProvider(name = "LoginData")
	public String[][] loginDataProvider() {
		return data;
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
	public void correctUsernameWrongPassword(String uName, String pWord) throws IOException {

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(uName);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pWord);
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
	}

}
