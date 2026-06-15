package example.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller ///marks this class as a controller class
public class SpringMvcController {
	
	@RequestMapping("/doGreet")
	public String getGreeting() {
		System.out.println("Request Received....");
		String viewName ="greet";
		return viewName;
		
	}
	
	
	
	

}
