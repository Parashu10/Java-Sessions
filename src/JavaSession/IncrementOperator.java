package JavaSession;

public class IncrementOperator {

	public static void main(String[] args) {
		
		//Post increment/decrement -- Immediate assign and increment later
		float a= 1.0f;
		float b = a++;
		
		System.out.println(a);
		System.out.println(b);

		//Pre increment/decrement -- Immediate increment  and assign later
		int c =10;
		int d = ++c;
		System.out.println(c);
		System.out.println(d);
		
		int t =10;
	
		System.out.println("----");
		System.out.println(t++);
		System.out.println(t);
		
		System.out.println("---444-");
		int i =10;
		System.out.println(i++ + ++i);
	}

}
