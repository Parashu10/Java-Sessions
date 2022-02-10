package JavaSession;

public class IfElseCondition {

	public static void main(String[] args) {
	
		
		int a = 10;  // = assignment operator and == comparision operator
		int b = a;
		
		if(a==b) {
			System.out.println("both are qual");
		}
		else {
			System.out.println("both are not equal");
		}
		
		
		//Dead code
		if(true) {
			System.out.println("Print Hi");
		}
//		else {
//			System.out.println("print bye");
//		}
		
		boolean t = true;
		
		if(t) {
			System.out.println("Print Hi");
		}
		else {
			System.out.println("print bye");
		}
		
		int number = 90;
		
		if(number<=100) {
			if(number>=90) {
				System.out.println("Got grade A");
			}
			if(number>=75 && number<90){
				System.out.println("Got grade B");
			}
		}
		else {
			System.out.println("Invalid number");
		}
		
		
//		String browser = "firefox";  // Memory : - Stack Area and Heap Area- Inside Heao there ll be string constants pool in that it ll allocates browser value
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		if(browser.equals("IE")) {
//			System.out.println("launch IE");
//		}
//		else {
//			System.out.println("Invalid browser"); // Execution of other statements
//		}
		
		
		
		String browser = "firefox";  
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firfox");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("invalid browser");
		}
		
		
		String browser1 = "FiRefox";  
		
		if(browser1.equalsIgnoreCase("firefox")) {
			System.out.println("equal");
		}
		else {
		System.out.println("not");	
		}
		
		
		}
		

	}