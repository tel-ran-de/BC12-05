package lesson02;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 14.05.2020; Time: 17:10
 * float fl;
 * double doub;
 * char ch;
 * boolean bool;
 */
public class HelloBasic {
	public static void main(String[] args) {
/*		System.out.println("Второй урок базисный Java");
		System.out.print("\u0423\u0440\u0430 \n");
		String name = "Andrej";
		System.out.println(name);*/

		int i;
		byte b;
		long l;
		short s;

		int a = 2;
		int c = 3;
		int d = a + c;
		System.out.println("Здесь будет проверяться значение д: " + d);
		a = 6; // Сторона квадрата
		System.out.println(a);
		System.out.println("Площадь квадрата = " + a * a);
		System.out.println("Периметр квадрата = " + 4 * a);
		int perimetr = 4 * a;

	}

}
