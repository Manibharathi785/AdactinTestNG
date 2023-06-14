package com.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static Select s;
	public static Actions act;
	public static Alert alert;
	public static Robot rbt;
	public static JavascriptExecutor js;

	/* 1 */ public static void getDriver(String url) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Chrome 114\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	/* 2 */ public static void maximum() {
		driver.manage().window().maximize();
	}

	/* 3 */ public static void sendKeys(WebElement target, String value) {
		target.sendKeys(value);
	}

	/* 4 */ public static void click(WebElement target) {
		target.click();
	}

	/* 5 */ public static void rightClick(WebElement target) {
		act = new Actions(driver);
		act.contextClick(target);
	}

	/* 6 */ public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	/* 7 */ public static void screenshotNow(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Screenshot\\" + name + ".png");
		FileUtils.copyFile(from, to);
	}

	/* 8 */ public static void selectByIndex(WebElement target, int index) {
		s = new Select(target);
		s.selectByIndex(index);
	}

	/* 9 */ public static void selectByvalue(WebElement target, String string) {
		s = new Select(target);
		s.selectByValue(string);
	}

	/* 10 */ public static void selectByText(WebElement target, String text) {
		s = new Select(target);
		s.selectByVisibleText(text);
	}

	/* 11 */ public static void deselectByIndex(WebElement target, int index) {
		s = new Select(target);
		s.deselectByIndex(index);
	}

	/* 12 */ public static void selectAllAndPrint() {
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allSelected : allSelectedOptions) {
			System.out.println(allSelected.getText());
		}
	}

	/* 13 */ public static void deselectAll(WebElement target) {
		s = new Select(target);
		s.deselectAll();
	}

	/* 14 */ public static void printAll(WebElement target) {
		s = new Select(target);
		List<WebElement> options = s.getOptions();
		for (WebElement allOptions : options) {
			System.out.println(allOptions.getText());
		}
	}

	/* 15 */ public static void iframe(WebElement target) {
		driver.switchTo().frame(target);
	}

	/* 16 */ public static void defaultframe() {
		driver.switchTo().defaultContent();
	}

	/* 17 */ public static void sleep(int millisec) throws InterruptedException {
		Thread.sleep(millisec);
	}

	/* 18 */ public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	/* 19 */ public static void alertCancel() {
		driver.switchTo().alert().dismiss();
	}

	/* 20 */ public static void alertSendKeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	/* 21 */ public static void pressDown() throws AWTException {
		rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
	}

	/* 22 */ public static void releaseDown() throws AWTException {
		rbt = new Robot();
		rbt.keyRelease(KeyEvent.VK_DOWN);
	}

	/* 23 */ public static void srcollinto(WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("Arguments[0].scrollIntoView();", target);
	}

	/* 24 */ public static void scrollApprox(int horizontal, int vertical) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + horizontal + "," + vertical + ");");
	}

	/* 25 */ public static void getOptions(WebElement target) {
		s = new Select(target);
		s.getOptions();
	}

	/* 26 */ public static void pressBackSpace() throws AWTException {
		rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_BACK_SPACE);
	}

	/* 27 */ public static void releaseBackSpace() throws AWTException {
		rbt = new Robot();
		rbt.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

	/* 28 */ public static void pressControl() throws AWTException {
		rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
	}

	/* 29 */ public static void releaseControl() throws AWTException {
		rbt = new Robot();
		rbt.keyRelease(KeyEvent.VK_CONTROL);
	}

	/* 30 */ public static void pressA() throws AWTException {
		rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_A);
	}

	/* 31 */ public static void releaseA() throws AWTException {
		rbt = new Robot();
		rbt.keyRelease(KeyEvent.VK_A);
	}

}
