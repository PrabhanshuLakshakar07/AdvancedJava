package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavabasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Class<SpringConfig> configClass =SpringConfig.class;
		ApplicationContext appContext=
				new AnnotationConfigApplicationContext(configClass);
		Object Obj =appContext.getBean("getWelcomeService");
		//Object Obj =appContext.getBean("myBean");
		GreetingService gs=(GreetingService)Obj;
		String reply=gs.sayGreeting();
		System.out.println(reply);
		
		
		 

	}

}
