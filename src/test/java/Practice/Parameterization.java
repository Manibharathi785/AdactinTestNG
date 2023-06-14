package Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Test
	@Parameters({ "Name", "Number" })
	public void confirmation(String name, int num) {
		System.out.println(name + " is a Gay. His number is " + num + ".");
	}
}
