package example.spring.mvc;


public class UserValidator {
	
	public static boolean isValid(User currentUser) {
		
		boolean validationStatus =false;
		
		String currentUserName =currentUser.getUserName();
		
		String currentPassword =currentUser.getPassword();
		
		if(currentUserName.equals("prabhanshu") && currentPassword.equals("asAdmin")) {
			validationStatus=true;
		}
		
		return validationStatus;
		
		
	}

}
