package mapConcept;

import java.util.HashMap;

public class LoginPage {
	
	public static String getUserRole(String role) {
		HashMap<String, String> log = new HashMap<String, String>();
		log.put("admin", "admin@a.com:admin1234");
		log.put("NonAdmin", "nadmin@a.com:nadmin1234");
		log.put("Super", "super@a.com:super1234");
		log.put("customer", "adsd@a.com:admin1234");
		
		return log.get(role);
	}
	
	public static void userCred(String un, String pwd) {
		System.out.println("Login with:" +un + " and "+pwd);
	}

	public static void main(String[] args) {
		
		 String cred[] = getUserRole("admin").split(":");
		 
		 String un = cred[0];
		 String pwd = cred[1];
		 userCred(un, pwd);
		
		
	

	}

}
