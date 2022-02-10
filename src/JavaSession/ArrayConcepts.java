package JavaSession;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		int i[] = new int[5];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[4]);
//		System.out.println(i[5]);
//		System.out.println(i[-1]); //negative index not allowed
		System.out.println(i[0]+i[1]);
		System.out.println(i.length);
		
		int len = i.length;
		System.out.println(len);
		
		for(int j=0;j<=len-1;j++) {
			System.out.println(i[j]);
		}
		
//		for each loop : Enhanced for loop to avoid mistakes which may happen in typical for loop like index out of bound
		for(int e : i) {
			System.out.println(e);
//			System.out.println(i);
		}
		
		
		char c[] = new char[4];
		c[0] = 'a';
		c[1] = '$';
		c[2] = '1';
		c[3] = 't';
		System.out.println("-------------");
		int g =0;
		for(char e : c) {
			System.out.println(g + ":"+ e);
			g++;
//			System.out.println(c);
		}
		
		
//		Limitations : 	
//		size is fixed : Dynamic array or array list need to be used to come out.
//		similar type of data : Static object array/Dynamic array
		
		
		Object emp[] = new Object [4];
		
		emp[0] = "xnnn";
		emp[1] = 10;
		emp[2] = 12.33;
		
		int k = emp.length;
		
		for (Object l : emp) {
			System.out.println(l);
		}
		
		for(int j=0;j<k;j++) {
			System.out.println(emp[j]);
		}
		
		
		
		
	}

}
