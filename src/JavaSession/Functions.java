package JavaSession;

public class Functions {
	
	public void test() {
		System.out.println("Hi");
		int i =10;
		System.out.println(i);
	}
	
	public int getBalance() {
		System.out.println("balance");
		int i =10;
		int j = 5;
		int total = i+j;
		return total;
	}
	
	public String trainerName() {
		String name = "Parashu";
		return name;
//		
//		return "Parashu";
	}
	
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public int courseFee(String course) {
		
		System.out.println("get course fee:" + course);
		if(course.toLowerCase().equals("java")) {
			return 100;
		}
		else if(course.equals("api")) {
			return 80;
		}
		else 
			System.out.println("courser not found");
			return -1;

	}

	public static void main(String[] args) {
		
		Functions f = new Functions();
//		f.test();
//		int x = f.getBalance();
//		System.out.println(x);
//		
//		String s = f.trainerName();
//		System.out.println(s);
//		
//		
//		int sum = f.add(2, 3); // a&b are method parameters, 2&3 are called method arguments
//		System.out.println(sum);
		
		int x = f.courseFee("JAVA");
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
