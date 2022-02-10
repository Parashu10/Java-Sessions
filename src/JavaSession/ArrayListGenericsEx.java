package JavaSession;

import java.util.ArrayList;

public class ArrayListGenericsEx {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		
//		ar.add(10);
//		ar.add(200);
//		ar.add(100);
//		ar.add(500);
//		
//		for (int i =0; i<ar.size();i++) {
//			System.out.println( ar.get(i));
//		}
		
		for(int i =0 ; i<10;i++) {
			ar.add(20);
		}
		System.out.println(ar.size());
		for (int i =0; i<ar.size();i++) {
		System.out.println( ar.get(i));
		}

	}

}