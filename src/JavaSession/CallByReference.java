package JavaSession;

public class CallByReference {
	
	String browser;
	double version;
	String vendor;
	
	public void getInfo(CallByReference cr) {
		System.out.println(cr.browser + " " + cr.version + " " + cr.vendor);
	}

	public static void main(String[] args) {
		
		CallByReference c = new CallByReference();
		c.version = 10.0;
		c.vendor = "google";
		c.browser = "chrome";
		c.getInfo(c);//call by reference/pass by referenece
		

	}

}
