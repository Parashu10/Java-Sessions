package exceptionhandling;

public class ThrowsKeyword {
	
	public void m1() throws ArithmeticException {
		System.out.println("m1");
		m2();
	}
	
	public void m2() throws ArithmeticException{
		System.out.println("m2");
		m3();
	}
	
	public void m3() throws ArithmeticException { // throws can not handle the exception just it ll pass the excpetion
		System.out.println("m3");
		int i =9/0;
	}

	public static void main(String[] args) throws ArithmeticException {
		
		ThrowsKeyword t = new ThrowsKeyword();
		t.m1();
		System.out.println("Bye");
		

	}

}
