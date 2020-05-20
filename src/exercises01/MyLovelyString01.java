package exercises01;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 20.05.2020; Time: 16:59
 * <p>
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */

// 01_08
public class MyLovelyString01 {
	public static void main(String[] args) {
/*		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		System.out.println(firstHalf("hfghhgfnjhgjnghfjfdlökgjsldfgkjhadölgkjhsdgv"));*/

	/*	System.out.println(nonStart("Hello", "There"));
		System.out.println(nonStart("java", "code"));
		System.out.println(nonStart("shotl", "java"));*/
		System.out.println(theEnd("Hello", true));
		System.out.println(theEnd("Hello", false));
		System.out.println(theEnd("oh", true));
	}



	public static String theEnd(String content, boolean b) {
		String myFirstChar = content.substring(0, 1);
		String myLastChar = content.substring(content.length() - 1);
		String result = "";
		if (b) {
			result = myFirstChar;
		} else {
			result = myLastChar;
		}
		return result;
	}

	private static String nonStart(String a, String b) {
		a = a.substring(1);
		b = b.substring(1);
		return a + b;
	}

	private static String firstHalf(String attribute) {
		int polovina = attribute.length() / 2;
		String result = attribute.substring(0, polovina);
		return result;
	}

	/*
	Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

	nonStart("Hello", "There") → "ellohere"
	nonStart("java", "code") → "avaode"
	nonStart("shotl", "java") → "hotlava"
	 */

	/*
	Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
	theEnd("Hello", true) → "H"
	theEnd("Hello", false) → "o"
	theEnd("oh", true) → "o"
	 */

}
