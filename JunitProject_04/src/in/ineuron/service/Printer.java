package in.ineuron.service;

public class Printer {
	
	private static Printer INSTANCE=new Printer();
	
	private Printer() {
	
	}
	
	public static Printer getInstance() {
		return INSTANCE;
	}
	
}
