package JavaSession;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels = 4;
	
	public void getInfo() {
		System.out.println("non static method");
	}
	
	public static void test() {
		System.out.println("static method");
	}
	
	//static class variables should have common value not properties

	public static void main(String[] args) {
		System.out.println("Inside main");
		Car c1 = new Car();
		c1.name = "Benz";
		c1.color = "Blue";
		c1.price = 50;
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.color = "White";
		c2.price = 70;
		
		Car c3 = new Car();
		c3.name = "Audi";
		c3.color = "White";
		c3.price = 70;	
		
		System.out.println(c1.name+" "+c1.color+" "+c1.price);
		
		//Ways of accessing static variables
		//1.No need to create object
		
		
		//1.Within the class directly use the variable
		System.out.println(wheels);
		
		//2.Using calss name -- good appraoch
		System.out.println(Car.wheels);
		
		//3. using object reference -- don't prefered by java
		//System.out.println(c1.wheels);
		
		//c1.getInfo();
		test();
		Car.test();
		
	}

}
