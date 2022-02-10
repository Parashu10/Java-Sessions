package JavaSession;

public class ClassExample {
	
	int i =20;//class variables need to access through object

	public static void main(String[] args) {
		
		
		int i =10; //local variables scope is within the method
		System.out.println(i);

		ClassExample ce = new ClassExample();
		System.out.println(ce.i);
		
		//class - template/blueprint for the objects
		//object - physical entity should be created from the class
	}

}
