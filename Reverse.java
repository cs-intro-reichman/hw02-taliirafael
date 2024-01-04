/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String x = args[0];
		int w = x.length();
		for (int i = 0; i < w; i++) {
					//backwards 
			System.out.print(x.charAt((w - i) - 1)); 
		}

					// middle character
		System.out.println("");
		if ((w%2) == 0) {
			w--;

		}
		System.out.println("The middle character is " + (x.charAt(w / 2)));
		}
	}
