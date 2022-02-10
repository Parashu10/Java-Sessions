package Encapsulation;

public class Employee {

	public static void main(String[] args) {
		
		Company c1 = new Company();
		
		c1.name = "Microsoft";
		c1.hq = "Bangalore";
		c1.setInfo(200);
		int j = c1.getInfo();
		System.out.println(j);
		

	}

}
