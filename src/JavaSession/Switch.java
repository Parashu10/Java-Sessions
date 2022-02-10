package JavaSession;

public class Switch {

	public static void main(String[] args) {
		
		
		String browser = "Firefox";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("pass right browser");
			break;
		}
		
		
		char c1='a';
        char c2='b';
        if( c1==c2){
        	System.out.println("characters are equal");
        }
        else {
        	System.out.println("characters are not equal");
        } 

	}

}
