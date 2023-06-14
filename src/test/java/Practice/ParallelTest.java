package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void openFacebook() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Chrome 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.quit();
	}

	@Test
	public void openInstagram() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Chrome 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.quit();
	}

}
