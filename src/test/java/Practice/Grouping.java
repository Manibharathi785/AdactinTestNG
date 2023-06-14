package Practice;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "RAM = 64")
	public void apple64() {
		System.out.println("Apple RAM = 64");
	}

	@Test(groups = "RAM = 128")
	public void apple128() {
		System.out.println("Apple RAM = 128");
	}

	@Test(groups = "RAM = 64")
	public void poco64() {
		System.out.println("Poco RAM = 64");
	}

	@Test(groups = "RAM = 128")
	public void poco128() {
		System.out.println("Poco RAM = 128");
	}

	@Test(groups = "RAM = 64")
	public void samsung64() {
		System.out.println("Samsung RAM = 64");
	}

	@Test(groups = "RAM = 128")
	public void samsung128() {
		System.out.println("Samsung RAM = 128");
	}

	@Test(groups = "RAM = 64")
	public void lenovo64() {
		System.out.println("Lenovo RAM = 64");
	}

	@Test(groups = "RAM = 128")
	public void lenovo128() {
		System.out.println("Lenovo RAM = 128");
	}

}
