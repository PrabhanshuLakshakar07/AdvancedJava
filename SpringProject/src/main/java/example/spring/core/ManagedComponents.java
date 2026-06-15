package example.spring.core;

import org.springframework.stereotype.Component;

@Component //marks this class as a managed component so that spring can managed
public class ManagedComponents {
	
	public void doWork() {
		System.out.println("Managed Component Works...");
		
		
		
		
	}

}
