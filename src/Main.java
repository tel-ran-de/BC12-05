import lesson05Switch.ReviewIf;
import lesson4.HomeWorkFrom02And03;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 14.05.2020; Time: 17:13
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Проверка года на високосность, ожидаю false, так как год 1999. ----  "
				+ ReviewIf.checkLeapYear(1999));
		System.out.println("Проверка года на високосность, ожидаю true, так как год 2000. ----  "
				+ ReviewIf.checkLeapYear(2000));
		System.out.println("Проверка года на високосность, ожидаю false, так как год 1900. ----  "
				+ ReviewIf.checkLeapYear(1900));
		System.out.println("Проверка года на високосность, ожидаю true, так как год 2020. ----  "
				+ ReviewIf.checkLeapYear(2020));
		System.out.println("Ничего не знаю, просто печатаю 1700: " + ReviewIf.checkLeapYear(1700));
	}
}
