public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
	int d = Integer.parseInt(args[0]);
		for (int i = 1; i <= d; i++) {
		if (d % i == 0) {
			System.out.println(i);
		}
	}
}
}
