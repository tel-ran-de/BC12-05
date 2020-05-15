package lesson4;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 15.05.2020; Time: 18:08
 */
public class HelloChar {
	public static void main(String[] args) {
		helloString();
	}

	public static void myNewDataTypeChar() {
		char digit = 100;
		char octalDigit = '\u039A';
		char euro = '€';
		char tabulator = '\t';
		char phi = '\u03A6';
		System.out.println(digit);
		System.out.println(octalDigit);
		System.out.println(euro);
		System.out.println(tabulator);
		System.out.println(phi);

		String name = "Andrej";
		System.out.println("\"Andrej\"");
		System.out.println("Andrej");
	}

	public static void helloString() {
		String firstName = "Andrej";
		String secondName = "Podlubnyj";
		char copyright = '\u00A9';
		int old = 18;
		System.out.println(firstName + " " + secondName + " " + old);
		String student = firstName + " " + secondName + " " + copyright;
		System.out.println(student);
	}

	public static void myIntToDouble() {
		int a = 5;
		double b = a;
		int c = (int) b;

		short myShortUno = 3;
		short myShortDos = 4;
		short myShortTres = (short) (myShortUno + myShortDos);

	}
}
