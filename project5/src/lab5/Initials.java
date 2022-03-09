package lab5;
import java.util.Scanner;


public class Initials {
	public static void main(String[] args) {
		initials();
	}
	public static String initials() {
		System.out.println("Print you full name: ");
		Scanner scnr = new Scanner(System.in);
		String name = "";
		while(scnr.hasNext()){
		    name = scnr.next();
		    for(int i =0; i<1; i++) {
		    	System.out.print(name.charAt(i));
		    }
		}
		scnr.close();
		
		return name;
	}
}
