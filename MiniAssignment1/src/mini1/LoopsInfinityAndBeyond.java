
package mini1;

/**
 * Utility class with a bunch of static methods for loop practice.
 * 
 * @author
 */
public class LoopsInfinityAndBeyond {
// disable instantiation
	private LoopsInfinityAndBeyond() {
	}

	/**
	 * Returns a new string in which every character in the given string that is not
	 * already repeated consecutively is doubled.
	 * <p>
	 * For example:
	 * 
	 * <pre>
	 * {@code
	 * "attribute1" -> "aattrriibbuuttee11"
	 * "AAA Bonds" -> "AAA  BBoonnddss"
	 * }
	 * </pre>
	 * 
	 * @param text given starting string
	 * @return string with characters doubled
	 */
	public static String doubleChars(String text) {
		String result = "";
		int i = 0;
		while (i < text.length()){
		    char ch = text.charAt(i);
		    if(i==0) {
		    	result = result + ch + ch;
		    }
	    	if(i!= 0 && text.charAt(i-1) == ch) {
	    		if(i != 1 && text.charAt(i-2) == ch) {
	    			result = result + ch;
	    		}
	    	}
		    if(i != 0 && text.charAt(i-1) != ch) {
		    	result = result + ch + ch;

		    }
		    i++;
		}
		return result;
	}

	/**
	 * Returns a year with the highest value, given a string containing pairs of
	 * years and values (doubles). If there are no pairs, the method returns -1. In
	 * the case of a tie, the first year with the highest value is returned. Assumes
	 * the given string follows the correct format.
	 * <p>
	 * For example, given the following string, the year 1995 is returned.
	 * 
	 * <pre>
	 * 1990 75.6 1991 110.6 1995 143.6 1997 62.3
	 * </pre>
	 * 
	 * @param data given string containing year-value pairs
	 * @return first year associated with the highest value, or -1 if no pair given
	 */
	public static int maxYear(String data) {
		String[] dataNums = data.split(" ");
		int number;
		int maxNum = 0;
		double maxDecimal = 0;		
		double decimal;
		if(data.length() == 0) {
			return -1;
		}
		for(int i = 0; i < dataNums.length/2; i++) {
			number = Integer.parseInt(dataNums[2 * i]);
			decimal = Double.parseDouble(dataNums[(2 * i) +1]);

			
			if(decimal > maxDecimal) {
				maxNum = number;
				maxDecimal = decimal;
			}
		}
		
		return maxNum;
	}

	/**
	 * Returns the number of iterations required until <code>n</code> is equal to 1,
	 * where each iteration updates <code>n</code> in the following way:
	 * 
	 * <pre>
	 *     if n is even
	 *         divide it in half
	 *     else
	 *         multiply n by three and add 1
	 * </pre>
	 * 
	 * For example, given <code>n == 6</code>, the successive values of
	 * <code>n</code> would be 3, 10, 5, 16, 8, 4, 2, 1, so the method returns 8. If
	 * <code>n</code> is less than 1, the method returns -1.
	 * <p>
	 * <em>(Remark:</em> How do we know this won't be an infinite loop for some
	 * values of <code>n</code>? In general, we don't: in fact this is a well- known
	 * open problem in mathematics. However, it has been checked for numbers up to
	 * 10 billion, which covers the range of possible values of the Java
	 * <code>int</code> type.)
	 * 
	 * @param n given starting number
	 * @return number of iterations required to reach <code>n == 1</code>, or -1 if
	 *         <code>n</code> is not positive
	 */
	public static int collatzCounter(int n) {
		int count = 0;
		if(n < 1) {
			return -1;
		}
		while(n != 1) {
			if(n % 2 == 0) {
				n = n/2;
			}
			else {
				n = 3 * n + 1;
			}
			count += 1;
		}
		return count;
	}

	/**
	 * Returns a new string in which every word in the given string is doubled. A
	 * word is defined as a contiguous group of non-space (i.e., ' ') characters
	 * that starts with an alphabetic letter and are surrounded by spaces and/or the
	 * start or end of the given string. Assumes the given string does not contain
	 * more than one consecutive white-space.
	 * <p>
	 * For example:
	 * 
	 * <pre>
	 * {@code
	 * "the time time" -> "the the time time time time"
	 * "The answer is 42." -> "The The answer answer is is 42."
	 * "A. runtime = 10ms" -> "A. A. runtime runtime = 10ms"
	 * }
	 * </pre>
	 * 
	 * @param text given starting string
	 * @return new string in which words are doubled
	 */
	public static String doubleWords(String text) {
		String[] arr = text.split(" ");   
		String output = "";
		
		int i = 0;
		if(text.length() > 0) {
			while( i < arr.length) {
				
				if(arr[i].charAt(0) >= 65 && arr[i].charAt(0) <= 122) {
					if(arr[i].charAt(0) <= 90 || arr[i].charAt(0) >= 97) {
						if(i != arr.length) {
							output = output + arr[i] +" "+ arr[i] + " ";
						}
						else{
							output = output + arr[i] +" "+ arr[i];
						}
					}
				}
				else {
					if(i != arr.length) {
						output = output + arr[i] + " ";
					}
					else {
						output = output + arr[i];
					}
				}
				i++;
			}
		}
		//This part sucked so much
		 if (output != null && output.length() > 0 && output.charAt(output.length() - 1) == ' ') {
		        output = output.substring(0, output.length() - 1);
		    }
		return output;
		    
		
	}
	private static boolean isVowel(char c) { 
		 return "aeiouAEIOU".indexOf(c) >= 0;  
	} 
	/**
	 * Returns true if string t can be obtained from string s by removing exactly
	 * one vowel character. The vowels are the letters 'a', 'e', 'i', 'o' and 'u'.
	 * Vowels can be matched in either upper or lower case, for example, 'A' is
	 * treated the same as 'a'. If s contains no vowels the method returns false.
	 * <p>
	 * For example:
	 * 
	 * <pre>
	 * {@code
	 * "banana" and "banna" returns true
	 * "Apple" and "ppl" returns false
	 * "Apple" and "pple" returns true
	 * }
	 * </pre>
	 * 
	 * @param s longer string
	 * @param t shorter string
	 * @return true if removing one vowel character from s produces the string t
	 */
	public static boolean oneVowelRemoved(String s, String t) {
		StringBuilder newString = new StringBuilder("");
		for(int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i)) == true) {
				for(int j = 0; j < i; j++) {
					newString.append(s.charAt(j));
				}
				for(int k = i+1; k< s.length(); k++) {
					newString.append(s.charAt(k));
				}
				String isIt = newString.toString();
				if(isIt.equals(t)) {
					return true;
				}
				newString.setLength(0);
				
			}
		}
		
		return false;
	}

	/**
	 * Returns a new string in which a UFO pattern in the given string is shifted
	 * one character to the right. The UFO pattern starts with a {@code '<'}, has
	 * one or more {@code '='} and ends with a {@code '>'}. The pattern may wrap
	 * around from the end to the beginning of the string, for example
	 * {@code ">  <="}. Any other characters from the given string remain in place.
	 * If the UFO moves over top of another character, that character is removed. If
	 * there are multiple UFO patterns, only the one that starts farthest to the
	 * left is moved.
	 * <p>
	 * For example:
	 * 
	 * <pre>
	 * {@code
	 * " <=>  *   . <=> " ->
	 * "  <=> *   . <=> "
	 * 
	 * "   <=>*   .     " ->
	 * "    <=>   .     "
	 * 
	 * ">.   x     .  <=" ->
	 * "=>   x     .   <"
	 * 
	 * " <= <===>   .   " ->
	 * " <=  <===>  .   "
	 * }
	 * </pre>
	 * 
	 * @param space given string
	 * @return a new string with a UFO pattern moved one to the right
	 */
	public static String ufo(String space) {
		StringBuilder out = new StringBuilder(space);
		int numOfEquals = 0;
		int shipRightSide;
		int shipLeftSide;
		boolean shipMoved = false;
			if(space.charAt(space.length()-1) == '<') {
				out.setCharAt(out.length()-1, ' ');
			}
			for(int j = 0; j < space.length()-3; j++) {
				if(space.charAt(j) == '<' && shipMoved == false) {
					shipRightSide = j;
					for(int k = j; k < space.length()-1 ; k++) {
						if(space.charAt(k) == '>') {
							shipLeftSide = k;
							for(int m = j; m < k; m++) {
								if(space.charAt(m) == '=') {
									numOfEquals = numOfEquals + 1;
								}
							}
							for(int r = j+1; r < k; r++) {
								if(space.charAt(r) != '=') {
									numOfEquals = 0;
								}
							}
							if(numOfEquals > 0) {
								out.setCharAt(shipRightSide, ' ');
								out.setCharAt(shipRightSide+1, '<');
								for(int n = 0; n < numOfEquals; n++) {
									//if(space.length() <= j+n+2) {
									out.setCharAt(shipRightSide+n+2, '=');
									//}
								}
								if(shipRightSide+numOfEquals+2 < space.length()) {
									out.setCharAt(shipRightSide+numOfEquals+2, '>');
								}
								numOfEquals = 0;
								shipRightSide = 0;
								shipLeftSide = 0;
								shipMoved = true;
							}
						}
					}
				}
			}
			if(space.charAt(0) == '>') {
				out.setCharAt(0, '=');
				out.setCharAt(1, '>');		
			}
			if((space.charAt(space.length()-2) == '<') && space.charAt(space.length()-1) == '='){
				out.setCharAt(space.length() - 2, ' ');
				out.setCharAt(space.length() - 1, '<');
			}
			
		
		return out.toString();
	}

	/**
	 * Prints a pattern of <code>2*n</code> rows containing slashes, dashes and
	 * backslashes as illustrated below.
	 * <p>
	 * When {@code n <= 0 }, prints nothing.
	 * <p>
	 * <code>n = 1</code>
	 * 
	 * <pre>
	 * \/
	 * /\
	 * </pre>
	 * <p>
	 * <code>n = 2</code>
	 * 
	 * <pre>
	 * \--/
	 * -\/
	 * -/\
	 * /--\
	 * </pre>
	 * <p>
	 * <code>n = 3</code>
	 * 
	 * <pre>
	 * \----/
	 * -\--/
	 * --\/
	 * --/\
	 * -/--\
	 * /----\
	 * </pre>
	 * 
	 * @param n number of rows in the output
	 */
	public static void printX(int n) {
		if(n>0) {
			for(int i = 0; i< n; i++) {
				for(int v = 0; v < i; v++) {
					System.out.print("-");
				}
				System.out.print("\\");
				for(int m = n-1; m>i;m--) {
					System.out.print("--");
				}
				System.out.print("/");
				System.out.print("\n");
			}
			
			for(int j = n; j> 0; j--) {
				for(int u = j; u>1; u--) {
					System.out.print("-");
				}
				System.out.print("/");

				for(int p = j; p<n;p++) {
					System.out.print("--");
				}
				System.out.print("\\");
				System.out.print("\n");
			}
			
		}
		
				
		
			
	}
}
