package JavaSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer> (Arrays.asList(10,20,30,40));
		System.out.println(ar);
		
		int i[] = {10,20,30,40}; //int i[] = new int[4];
		System.out.println(i);
		System.out.println(Arrays.toString(i));
		
		ArrayList<String> s1 = new ArrayList<String> (Arrays.asList("Java", "Python", "JavaScript"));
		ArrayList<String> s2 = new ArrayList<String> (Arrays.asList("z", "a", "B"));
		
		
		System.out.println(s2);
		Collections.sort(s2);
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		if(s1.equals(s2)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		ArrayList<String> s4 = new ArrayList<String> (Arrays.asList("A", "B", "C"));
		ArrayList<String> s5 = new ArrayList<String> (Arrays.asList("z", "a", "B"));
		
		s4.removeAll(s5);
		System.out.println(s4);
		
		// removeall to remove common elements from first list l1 =l1.removeall(l2)
		//retainall to retain or find the common elements l1.retainall(l2)
		//addall to add the elements to first lisr l1.addall(l2)
		//clear removes everything l7.clear()
		//add(0,10)
		
		@SuppressWarnings("unchecked")
		ArrayList<String> cl = (ArrayList<String>) s5.clone();
		System.out.println(cl);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
