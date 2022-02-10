package JavaSession;

public class DataConversion {

	public static void main(String[] args) {
		
		short v = (short)329034;
		System.out.println(v);
		
		int w = 329034;
		System.out.println(w);
		
		
		
		String c ="100";
		int j =10;
		System.out.println(j+c);
		int k =Integer.parseInt(c);
		System.out.println(k+j);
		
		String u ="200A";
		String x = u.replace('A',' ').trim();
		int y = Integer.parseInt(x);
		System.out.println(y+j);
		

	}

}
