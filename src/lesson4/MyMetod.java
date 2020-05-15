package lesson4;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 15.05.2020; Time: 17:44
 */
public class MyMetod {
	public static void main(String[] args) {
		//americano();
		cappuchino();
	}

	private static void cappuchino() {
		int coffee = 20;
		int waterInCup = 40;
		int milkInCup = 50;

		String result = "Наш капучино состоит из " + water(waterInCup) + espresso(coffee) + milk(milkInCup);
		System.out.println(result);
	}

	private static void americano() {
		int coffee = 20;
		int waterInCup = 40;

		System.out.println("Американо состоит из " + water(waterInCup) + espresso(coffee) + " Получите свой кофе");
	}

	public static String water(int ml) {
		String cup = ml + " ml вода";
		return cup;
	}

	public static String milk(int ml) {
		String cup = ml + " ml молоко";
		return cup;
	}

	public static String espresso(int ml) {
		String cup = ml + " ml эспрессо";
		return cup;
	}

	public static void simpleMilk() {
		System.out.println("sdgdghsdfhhggfj");
	}
}
