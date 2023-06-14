package Practice;

import org.testng.annotations.Test;

public class Priority {

	@Test
	public void born() {
		System.out.println("Born Baby");
	}

	@Test(priority = -1)
	public void home() {
		System.out.println("Home");
	}

	@Test(dependsOnMethods = "home", priority = 0, enabled = true)
	public void playSchool() {
		System.out.println("Play School");
	}

	@Test(dependsOnMethods = "playSchool", priority = 1)
	public void playGround() {
		System.out.println("Play Ground");
	}

	@Test(priority = 2)
	public void primarySchool() {
		System.out.println("Primary School");
	}

	@Test(priority = 3)
	public void secondarySchool() {
		System.out.println("Secondary School");
	}

	@Test(priority = 4)
	public void college() {
		System.out.println("College");
	}

	@Test(priority = 5)
	public void office() {
		System.out.println("Office");
	}

	@Test
	public void retirement() {
		System.out.println("Retirement");
	}

	@Test
	public void death() {
		System.out.println("Death");
	}

}
