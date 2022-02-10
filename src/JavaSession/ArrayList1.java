package JavaSession;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(10);
		ar.add(20);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(1));
		
		ar.remove(1);
		
		System.out.println(ar.size());
		
		ar.add(12.33);
		
		ar.add("STR");
		
		for (int i=0; i<ar.size();i++) {
			System.out.print(ar.get(i));
		}
		
		
	}

}
