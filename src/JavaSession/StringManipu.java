package JavaSession;

import java.util.Arrays;

public class StringManipu {

	public static void main(String[] args) {
		
//		String s = "This is my java program and java is best also am happy";
//		System.out.println(s.indexOf('i'));
//		System.out.println(s.indexOf("i", s.indexOf("i")+1));
//		System.out.println(s.indexOf('i', (s.indexOf("i", s.indexOf("i")+1))+1));
		
		
		String s1 = "Hello Java"; 
		String s2 = "Hello Java";
		
//		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2); // == will return true only if they are stirng literals. If they are not literal then reference and then object and their value ll be compared
		
		String s3 = new String("Hello Ruby");
		String s4 = "Hello Ruby";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		String m = "Java_Python_Net_Perl_Ruby";
		String j[] = m.split("_");
		System.out.println(j[0]);
		System.out.println(Arrays.toString(j));
		
		for (String e : j) {
			System.out.println(e);
		}
	

	}

}
