package buildpattern;

public class TestEcomm {

	public static void main(String[] args) {

		EcommApp user = new EcommApp();
		user.login();
//			.generateOrderId(10);
		user.login()
			.addToCart("name")
				.doPayment("Test");
		
		
		user.login("kaur@gmail.com", "kaur123")
		.search("Nike Tshirt")
				.addToCart("Nike Tshirt")
					.doPayment("6565b 64646 76767 8777", 989)
							.logout();
		

	}

}
