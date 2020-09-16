package JUnitpart2;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class Runner {
	
	@Test
	public void tc1() {
		
		org.junit.runner.Result  r =  JUnitCore.runClasses(A.class,B.class,C.class);
		
		System.out.println("runcount"+ r.getRunCount());
		System.out.println("ingronecount"+r.getIgnoreCount());
		System.out.println("failcount"+r.getFailureCount());
		System.out.println("runtime"+ r.getRunTime());
		
		List<Failure> failures = r.getFailures();
		
		for(Failure failure : failures) {
			System.out.println(failure);
		}
		
	}
	
	

}
