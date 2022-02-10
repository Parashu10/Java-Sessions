package JavaSession;

public class StringConcat {

	public static void main(String[] args) {
		
		String s = "Hello";
		String s1 = "Testing";
		
		int x= 100;
		int y = 200;
		
		System.out.println(x+y); // addition
		System.out.println(s+s1); //concat
		
		System.out.println(x+s);
		
		System.out.println(x+y+s+s1); // left to right
		System.out.println(s+s1+x+y);
		System.out.println("hi");
		System.out.println("The value of x is:" + x);
		System.out.println("The value of y is:" + y);
		System.out.println("The sum of x + y is:" + (x + y));
		System.out.println(s + " "+ s1);

		
		char c1 = 'a';  //ascii range u should remember 97 -122
		char c2 = 'b';  
		System.out.println(c1+c2);
		System.out.println(c1+""+c2);
		
		
		byte b1 = 60;
		byte b2 = 50;
		long b3 = b1+b2; //Whenever adds two number java always assumes result ll be integer or long number (big number)..
		System.out.println(b3);
		
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3); // If any one is float then result ll be in float number
		System.out.println(10/0.0); //Infinity
		System.out.println(0/10);
		//System.out.println(0/0);
		System.out.println(0.0/0); //nan;
		
		System.out.println(0/0.0); //nan
		System.out.println(0.0/0.0); // Any thingh divided by 0.0 is always infinity
		
		char t = 'a';
		System.out.println((int)t);
		
		
		
		
		
	}

}
