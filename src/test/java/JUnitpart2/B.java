package JUnitpart2;

import org.junit.Ignore;
import org.junit.Test;

public class B {
	
	@Test
	public void tc1() {
		System.out.println("test case 1");
	}

	@Ignore
	@Test
	public void tc3() {
		System.out.println("test case 3");
	}
	
	@Test
	public void tc2() {
		System.out.println("test case 2");
	}

}
