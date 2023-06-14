package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void born() {
		System.out.println("Born Baby");
	}

	@BeforeTest
	public void home() {
		System.out.println("Home");
	}

	@BeforeClass
	public void playSchool() {
		System.out.println("Play School");
	}

	@BeforeMethod
	public void playGround() {
		System.out.println("Play Ground");
	}

	@Test
	public void primarySchool() {
		System.out.println("Primary School");
	}

	@Test
	public void secondarySchool() {
		System.out.println("Secondary School");
	}

	@AfterMethod
	public void college() {
		System.out.println("College");
	}

	@AfterClass
	public void office() {
		System.out.println("Office");
	}

	@AfterTest
	public void retirement() {
		System.out.println("Retirement");
	}

	@AfterSuite
	public void death() {
		System.out.println("Death");
	}

}
