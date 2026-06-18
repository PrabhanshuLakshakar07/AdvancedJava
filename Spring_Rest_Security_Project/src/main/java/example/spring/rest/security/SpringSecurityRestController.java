package example.spring.rest.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityRestController {
	@GetMapping("/doGreet")
	public String getGreeting() {
		return "wellcome to spring security";
	}
	
	@GetMapping("/doRegular")
	public String getRegular() {
		return "Doing Regular work";
	}
	
	@GetMapping("/doAdmin")
	public String getAdmin() {
		return "Doing admin work";
	}

}
