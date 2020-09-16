package Junitcorerun;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class Runner {
	
	
	@Test
	
	public void tc1() {
		// TODO Auto-generated method stub
		
		org.junit.runner.Result r = JUnitCore.runClasses(Login.class);
		
		System.out.println("run count " + r.getRunCount());
		System.out.println("ingore count"+r.getIgnoreCount());
		System.out.println("failure count"+r.getFailureCount());
		
		List<Failure> failures = r.getFailures();
		for(Failure failure : failures) {
			System.out.println(failure);
			
		}

	}

}
