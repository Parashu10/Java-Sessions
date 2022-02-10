package inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoPark();
		b.engine();
		
		Vehicle v = new Vehicle();
		v.engine();
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.engine();
		
		
		//top casting
		 Car c1 = new BMW();
		 c1.start();
		 c1.stop();
		 c1.refuel();
		 
		 Vehicle v1 = new BMW();
		 v1.engine();
		 
		 //down casting not allowed in java-class cast exception while runtime
//		 BMW b1 = (BMW)new Car(); // ClassCast exception Runtime error.
//		 b1.start();
		
	


		

	}

}
