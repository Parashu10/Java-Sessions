package Super;

public class LoginPage extends Page {
	
	int time = 200;
	
	public void loginInfo() {
		System.out.println("Login Info");
//		display();
	}
	
	public void display() {
		System.out.println("LoginPage-deisplay");
		super.display();
	}
	
	
	
	public void getTime() {
		System.out.println(time);
		System.out.println(super.time);
	}

}
