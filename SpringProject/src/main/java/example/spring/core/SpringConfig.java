package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration                 //Marks this class as a configuration specific class
@ComponentScan(basePackages= {"first" ,"Second" , "example "})    //Enabling package scaning for picking  @Component Anotation
public class SpringConfig {
	@Bean("myBean") //override the default ID
	@Lazy
	@Scope("prototype")
	//WelcomeService
	public WelcomeService getWelcomeService() {
		return new WelcomeService() ;
		
		
	}
	
	@Bean
	public Address getAddress() {
		return new Address("Mumbai",422001);
			
	}
	@Bean
	public Address getAddress2() {  
		return new Address("Bangalore",500001);
			
	}
	
	
	@Bean("cust")
	public Customer getCustomer() {
		Customer cst =new Customer();
		cst.setName("Prabhanshu");
		cst.setEmail("plakshakar97@gmail.com");
		
		cst.setCommAddress(getAddress2());
		
		return cst;
		
	}
	
	@Bean("petrol")@Primary
	
	public Engine getEngine() {
		return new Engine("Petrol");
		
	}
	@Bean("diesel")
	public Engine getDiesel() {
		return new Engine("Diesel");
		
	}
	
	@Bean("myCar")
     public  Car getMyCar() {
		Car myCar =  new Car();
		myCar.setMake("BMW");
		myCar.setModel("XM");
		return myCar;
		//not setting engine because it is to be auto-wire
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//<bean class="...WelcomeService" id="myBean">
