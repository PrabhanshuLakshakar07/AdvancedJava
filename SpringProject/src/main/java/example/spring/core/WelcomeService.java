package example.spring.core;

public class WelcomeService implements GreetingService{
	
	public WelcomeService() {
	System.out.println("Inside Welcome no-arg");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayGreeting() {
		return "wellcome to Spring";
		
	}
}
