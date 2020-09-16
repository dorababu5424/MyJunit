package org.junit;

import java.util.Date;

public class Sample {
		
	@BeforeClass
	public static void lunch() {
		// TODO Auto-generated method stub
		System.out.println("Lunch Bowser");
	}
	
	@AfterClass
	public static  void Closebowser() {
		// TODO Auto-generated method stub
		System.out.println("CloseBower");
	}
	@Before
	public void startime() {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void endtime() {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1() {
		// TODO Auto-generated method stub
		System.out.println("test case 1");
	}
	@Test 
	public void tc2() {
		// TODO Auto-generated method stub
		System.out.println("test case 2");
	}

	
}

