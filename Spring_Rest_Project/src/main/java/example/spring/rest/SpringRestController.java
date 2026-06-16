package example.spring.rest;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
	
//	@GetMapping("/doGreet")
//	public @ResponseBody String getGreeting() {
//		return "greet";  // in this case "greet" is the not  view name,it is
//	}

	@GetMapping("/doGreet")
	public String getGreeting() {
		return "Welcome to spring Rest";  // in this case "greet" is the  view name,it is
	}
  
	@GetMapping("/person")
	public Person getPerson() {
		Person personObj=new Person("Jack","Doctor",LocalDate.of(2000, 5, 21));
		return personObj;
	}
	
	
	
}
