package lesson02;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 14.05.2020; Time: 17:37
 */

// Определение, объявление, инициализация переменных
// Definition, declaration, initialization


public class HelloLong {
	public static void main(String[] args) {
		//helloLong();
		//helloInt();
		//купи молоко
		helloByte();
	}

	public static void helloBinar() {
		int hexValue1 = 0x100; // Шестнадцатеричная система счисления
		int binar = 0B1001_1001; // Двоичная система счисления
		int octal = 0757;  // восьмеричная система счисления
	}

	public static void helloByte() {
		byte a = 120;
		byte b = 10;
		byte c = (byte) (a + b);
		System.out.println("The c variable Value after Addition is : " + c);
	}

	public static void helloLong() {
		long a1 = 7_456_678_678L;
		long a2 = 7_456_678_678L;
		long c = a1 + a2;
		long g = 1;
		System.out.println(c);
	}

	public static void helloInt() {
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
