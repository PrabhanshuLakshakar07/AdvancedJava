package example.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.HttpServletRequest;

@Controller ///marks this class as a controller class
@SessionAttributes({"loggedInUser"})
public class SpringMvcController {
	
	//@RequestMapping("/doGreet")
	@GetMapping("/doGreet")
	public String getGreeting() {
		System.out.println("Request Received....");
		String viewName ="greet";
		return viewName;
		
	}
	
	//@RequestMapping("/doLogin")
	@GetMapping("/doLogin")
	public String getLogin() {
		return "login";
	}
	
	//@RequestMapping(value="/doValidate",method =RequestMethod.POST)
//    @PostMapping("/doValidate")
//	public String getResult(HttpServletRequest request) {
//		String userName=request.getParameter("uid");
//		String password=request.getParameter("pwd");
//		User currentUser =new User (userName,password);
//		boolean valid = UserValidator.isValid(currentUser);
//		String result ="failure";
//		if(valid)
//			result ="success";
//		
//		return result;
//	}
	
//    @PostMapping("/doValidate")
//   	public String getResult(@RequestParam("uid") String userName ,
//   			@RequestParam("pwd") String password) {
////   		String userName=request.getParameter("uid");
////   		String password=request.getParameter("pwd");
//   		
//   		User currentUser =new User (userName,password);
//   		boolean valid = UserValidator.isValid(currentUser);
//   		String result ="failure";
//   		if(valid)
//   			result ="success";
//   		
//   		return result;
//   	}
	
	
    @PostMapping("/doValidate")
   	public String getResult(
   			@RequestParam("uid") String userName ,
   			@RequestParam("pwd") String password ,
   			Model dataModel
   			
   			) {
//   		String userName=request.getParameter("uid");
//   		String password=request.getParameter("pwd");
   		
   		User currentUser =new User (userName,password);
   		boolean valid = UserValidator.isValid(currentUser);
   		String result ="failure";
   		if(valid) {
   			dataModel.addAttribute("loggedInUser",userName);
   			result ="success";
   		}
   			
   		
   		return result;
   	}

}
