package accessmodifier1;

public class Car {
	
	String carName;
	public String color;
	protected int price;
	private int number;

	public static void main(String[] args) {
		
		Car c = new Car();
		c.number = 10;
		System.out.println(c.number);
		
		

	}

}
