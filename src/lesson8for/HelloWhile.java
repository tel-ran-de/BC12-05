package lesson8for;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 19.05.2020; Time: 17:18
 */
public class HelloWhile {
	public static void main(String[] args) {
		howDoYOuDo();
	}

	public static void howDoYOuDo() {
		int i = 10;
		do {
			System.out.println(i);
			i++;
		}
		while (i < 100);
	}

	public static void whileDoWhileHello() {
		int i = 0;

		//////////////////////////////////
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		////////////////////////////////////

		do {
			System.out.println(i);
			i++;
		}
		while (i < 100);
	}
}
