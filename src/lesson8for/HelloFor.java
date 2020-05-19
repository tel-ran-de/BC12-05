package lesson8for;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 19.05.2020; Time: 16:46
 */
public class HelloFor {
	public static void main(String[] args) {
		nocheinMethod();
	}



	public static void nocheinMethod() {

		for (int i = 3; i < 10; i++) {
			System.out.println(i);
		}


	}




	public static void toUnLimited() {

		for (int i = 0; i < 20; i = 2 * i) {
			int b = 1;
			if (true) {
				b++;
			}
		}
		System.out.println();
	}
}
