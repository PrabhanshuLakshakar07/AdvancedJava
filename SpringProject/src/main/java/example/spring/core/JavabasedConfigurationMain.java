package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavabasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Class<SpringConfig> configClass =SpringConfig.class;
		ApplicationContext appContext=
				new AnnotationConfigApplicationContext(configClass);
		//Object Obj =appContext.getBean("getWelcomeService");
		Object Obj =appContext.getBean("myBean");
		Object Obj2 =appContext.getBean("myBean");
		Object Obj3 =appContext.getBean("myBean");
		
		System.out.println(Obj==Obj2);
		System.out.println(Obj==Obj3);
		
		
		
//		GreetingService gs=(GreetingService)Obj;
//		String reply=gs.sayGreeting();
//		System.out.println(reply);
		
		
		 

	}

}
