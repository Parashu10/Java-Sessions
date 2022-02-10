package JavaSession;

import java.util.ArrayList;

public class Customer {
	
	public ArrayList<String> doSearch(String categoryname) {
		ArrayList<String> ar = new ArrayList<String>();
		switch (categoryname) {
		case "apple":
			ar.add("iphone");
			ar.add("iphone12");
			ar.add("iphone13");
			break;
			
		case "samsung":
			ar.add("s12");
			ar.add("s10");
			ar.add("s7");
			break;
			
		case "hp":
			ar.add("head");
			ar.add("laptop");
			ar.add("mouse");
			break;

		default:
			System.out.println("Not found");
			break;
		}
		return ar;
		
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		ArrayList<String> applelist = c.doSearch("apple");
		System.out.println(applelist.size());
		System.out.println(applelist);
		
		ArrayList<String> samsunglist = c.doSearch("samsung");
		System.out.println(samsunglist);
		
		
		

		
		
		

		
		
		

		
		
		
		

	}

}
