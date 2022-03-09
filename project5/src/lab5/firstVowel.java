package lab5;
import java.util.Scanner;

public class firstVowel {
	public static void main(String[] args) {
		System.out.println(firstIndex());
	}

	private static int firstIndex() {
		Scanner scnr = new Scanner(System.in);
		String statement = scnr.nextLine();
		String vowels = "AEIOUaeiou";
		scnr.close();
		for(int i =0; i<=statement.length()-1;i++) {
			for(int j =0; j<=vowels.length()-1; j++) {
				if(statement.charAt(i) == vowels.charAt(j)) {
					return i;
				}
			}
				
		}

		return -1;
	}
}
