package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration                 //Marks this class as a configuration specific class
public class SpringConfig {
	@Bean("myBean") //override the default ID
	//WelcomeService
	public WelcomeService getWelcomeService() {
		return new WelcomeService() ;
		
		
	}

}//<bean class="...WelcomeService" id="myBean">
