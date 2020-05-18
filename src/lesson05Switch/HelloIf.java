package lesson05Switch;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 18.05.2020; Time: 16:56
 */
public class HelloIf {
	public static void main(String[] args) {
		spaceShuttle(5);
	}

	public static void spaceShuttle(int speed) {
		final int SUPERCONSTANT_G = 10;
		// модификатор final обозначает константность переменной, которую невозможно изменить.
		// например, ускорение свободного падения на поверхности Земли или
		// PI, которое всегда константо. Кроме этой особенности final на результаты вычисления
		// не влияет

		if (speed > SUPERCONSTANT_G) {
			System.out.println("Ракета улетает в космос");
			System.out.println("Выпустить пресс-релиз об успешном запуске");
			System.out.println("Подготовить программистов к государственным наградам");
		} else {
			System.out.println("Первоночальное ускорение недостаточно");
			System.out.println("Ракета не может стартовать");
			System.out.println("Подготовить аварийные службы");

		}
	}

	public static void ifTest() {
		int a = 5;
		int b = 7;
		if (a < b && true || false) {
			System.out.println("я поеду в летний лагерь");
		} else {
			System.out.println("я останусь на всё лето дома");
		}
	}
}
