package Second.child;

import org.springframework.stereotype.Component;

@Component("second_child") //Assigning an Id To this Bean
public class SecondChildComponent {
	public void doWork() {
		System.out.println("Second child Component Works...");
		
		
		
		
	}
}
