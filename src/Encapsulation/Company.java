package Encapsulation;

public class Company {
	
	public String name;
	private int sharePrice;
	public String hq;
	
	public int getInfo() {
		return sharePrice;
	}
	
	public void setInfo(int sp) {
		sharePrice = sp;
	}

	public static void main(String[] args) {
		Company c = new Company ();
		c.name = "IBM";
		c.sharePrice = 100;
		c.getInfo();
	}

}
