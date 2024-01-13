public class Divide {

	public static void main(String[] args) {

//			int numerator = Integer.parseInt(args[0]);
//			int denominator = Integer.parseInt(args[1]);

//			int quotient = numerator / denominator;
//			int remainder = numerator % denominator;

//			System.out.println(
//				numerator + " / " + denominator + " = " +
//				quotient + " remainder " + remainder);

//			System.out.println("Re-run the program to try again");
			wrapper1(args[0], args[1]);

	}

	private static void wrapper1(String a1, String a2) {
		wrapper2(a1, a2);
	}

	private static void wrapper2(String a1, String a2) {

		int numerator = Integer.parseInt(a1);
		int denominator = Integer.parseInt(a2);

		int quotient = numerator / denominator;
		int remainder = numerator % denominator;
	}
}
