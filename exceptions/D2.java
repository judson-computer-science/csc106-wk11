public class D2 {

	public static void main(String[] args) {

		try {
			String name = null;
			System.out.println("my name is" + name.toString());

		} catch (NullPointerException npe) {
			System.out.println("Error");
		} finally {
			System.out.println("Done");
		}
	}
}
