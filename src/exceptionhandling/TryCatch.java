package exceptionhandling;

public class TryCatch {
	
	String name;

	public static void main(String[] args) {
		
		TryCatch b = new TryCatch();
		
		b.name = "Ravi";
//		b = null;
		
		System.out.println("Print A");
		
		try {
			System.out.println(b.name);
//			int i = 10/2;
			System.out.println("Error");
		}
		
		catch(Throwable e) {
		e.printStackTrace();
	}
		
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		catch (ArithmeticException e){ //Exception-Throwable-Object : Print method is defined in Throwable so it won't be accessible through Object.(Chile method through parent class reference not possible)
//			e.printStackTrace();
//			System.out.println("Hi");
//		}
//		catch (NullPointerException e) {
//			e.printStackTrace();
//			System.out.println("Bi");
//		}
		
		System.out.println("Print B");
		

	}

}
