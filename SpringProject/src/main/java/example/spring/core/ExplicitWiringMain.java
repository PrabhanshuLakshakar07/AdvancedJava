package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExplicitWiringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appContext=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		Object custObj=appContext.getBean("cust");
		System.out.println(custObj);

	}

}
