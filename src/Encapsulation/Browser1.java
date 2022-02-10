package Encapsulation;

public class Browser1 {
	
	public void launchBrowser() {
		System.out.println("Launch");
		browserVersion();
		enoughRam();
		osVersion();
		System.out.println("Browser launched");
	}
	
	private void browserVersion() {
		System.out.println("Version");
	}
	
	private void enoughRam() {
		System.out.println("Ram capacity");
	}
	
	private void osVersion() {
		System.out.println("OS Version");
	}
}
