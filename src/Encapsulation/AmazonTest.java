package Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.setUsername("parashu");
		lp.setPassword("admin");
		lp.login(lp.getUsername(), lp.getPassword());
		
		
		Browser1 b = new Browser1();
		b.launchBrowser();

	}

}
