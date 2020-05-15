package lesson4;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 15.05.2020; Time: 17:26
 */
public class HomeWorkFrom02And03 {
	public static void main(String[] args) {
		//cube();
		//chess();
		double changeResult = euroToDollar();
		// возвращают - исполняют
		char dollar = '$';
		System.out.println("" + dollar + changeResult);

	}

	private static void chess() {
		// Как же найти два в 64 степени
		int a = 2;
		int b = 63;
		double c = Math.pow(a, b) - 1;
		//^
		System.out.println(c);
	}

	public static void cube() {
		int a = 5;
		int square = 6 * a * a;
		int perimetr = 12 * a;
		System.out.println("Это периметр куба " + square);
		System.out.println("Это площадь куба " + perimetr);
		// shortcuts jetbrains idea
	}

	public static double euroToDollar() {
		int countEuro = 500;
		double cursEuroToDollar = 1.1;
		double resultDollar = countEuro / cursEuroToDollar;

		return resultDollar;
	}

}
