package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterSuite {

	public static WebDriver driver;
	long start, end;

	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Chrome 114\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void openGoogle() {
		start = System.currentTimeMillis();
		driver.navigate().to("http://www.google.com");
	}

	@Test
	public void openBing() {
		driver.navigate().to("http://www.bing.com");
	}

	@Test
	public void openYahoo() {
		driver.navigate().to("http://www.yahoo.com");

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		end = System.currentTimeMillis();
		long total = end - start;
		System.out.println("Total time taken = " + total);

	}

}
