// tip: each public class is put in its own file
public class Palindrom {
	// tip: arguments are passed via the field below this editor
	public static void main(String[] args) {
		String a = "HARISH";
		String b = "HSIRAH";

		// reverse - string builder
		a = new StringBuilder(a).reverse().toString();
		if (a.equals(b)) {
			System.out.println("Yes, Palindrine " + a + " == " + b);
		} else {
			System.out.println("Not A Palindrine " + a + " != " + b);
		}

		// reverse array
		StringBuilder sb = new StringBuilder();
		for (int i = a.length() - 1; i >= 0; i--) {
			sb.append(a.charAt(i));
		}
		a = sb.toString();
		System.out.println("Post reverse a -> " + a);

		if (a.equals(b)) {
			System.out.println("Yes, Palindrine " + a + " == " + b);
		} else {
			System.out.println("Not A Palindrine " + a + " != " + b);
		}
	}
}