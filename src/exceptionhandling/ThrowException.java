package exceptionhandling;

public class ThrowException {

	public static void main(String[] args) {
		
		String data = null;
		
		if(data == null) {
			try {
				throw new Exception("Parashu Exception");
			}
			catch(Exception e) {
				System.out.println("Parashu Exception");
				e.printStackTrace();
			}
		}
		
		try {
			int x=10/2;
			System.out.println(x);
			throw new Exception("Parashu Exception");
//			System.out.println("x");
		}
		catch(Exception e) {
			System.out.println("Parashu Exception");
			e.printStackTrace();
		}
		
		

	}

}
