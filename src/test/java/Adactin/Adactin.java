package Adactin;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class Adactin extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		getDriver("http://adactinhotelapp.com/");
		maximum();

		WebElement user = driver.findElement(By.id("username"));
		sendKeys(user, "sampleproject");
		WebElement password = driver.findElement(By.name("password"));
		sendKeys(password, "Mani@adactin785");
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		click(login);

		WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		selectByvalue(location, "Los Angeles");
		WebElement hotels = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		selectByIndex(hotels, 1);
		WebElement rooms = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		selectByText(rooms, "Super Deluxe");
		WebElement roomsCount = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		selectByIndex(roomsCount, 1);
		WebElement checkIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		click(checkIn);
		pressControl();
		pressA();
		releaseControl();
		releaseA();
		pressBackSpace();
		releaseBackSpace();
		sendKeys(checkIn, "18/03/2023");
		WebElement checkOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		click(checkOut);
		pressControl();
		pressA();
		releaseControl();
		releaseA();
		pressBackSpace();
		releaseBackSpace();
		sendKeys(checkOut, "21/03/2023");
		WebElement adultsCount = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		selectByvalue(adultsCount, "2");
		WebElement childCount = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		selectByIndex(childCount, 1);
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		click(search);

		WebElement selectHotel = driver.findElement(By.id("radiobutton_0"));
		click(selectHotel);
		WebElement confirmHotel = driver.findElement(By.id("continue"));
		click(confirmHotel);

		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		sendKeys(fname, "Ahamed");
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		sendKeys(lname, "Alikhan");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		sendKeys(address, "No.9/A, 2nd Cross Street, Murugesan Nagar, Thiruninravur.");
		WebElement cardNo = driver.findElement(By.name("cc_num"));
		sendKeys(cardNo, "1234 1234 1234 1234");
		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		selectByIndex(cardType, 1);
		WebElement expMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		selectByText(expMonth, "May");
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		selectByIndex(expYear, 4);
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		sendKeys(cvv, "987");
		WebElement book = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		click(book);

		screenshotNow("New Pic");
		driver.quit();

	}

}
