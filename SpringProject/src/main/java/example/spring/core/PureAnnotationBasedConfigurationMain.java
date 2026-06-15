package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Second.SecondComponent;
import Second.child.SecondChildComponent;
import first.FirstComponent;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext=
				new AnnotationConfigApplicationContext(SpringConfig.class);
	
//		ManagedComponents mgComp=appContext.getBean(ManagedComponents.class);
//		mgComp.doWork();
		
		FirstComponent  firstComp=
			appContext.getBean(FirstComponent.class);
		firstComp.doWork();
		
		SecondComponent  secondComp=
				appContext.getBean(SecondComponent.class);
			secondComp.doWork();
			
			
//			SecondChildComponent secondChildComp=
//					appContext.getBean(SecondChildComponent.class);
//				secondChildComp.doWork();
			
			Object obj = appContext.getBean("second_child");
			SecondChildComponent secondChildComp=
					(SecondChildComponent)obj;
			secondChildComp.doWork();
				
				

	}

}
