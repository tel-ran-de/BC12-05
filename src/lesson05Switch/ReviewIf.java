package lesson05Switch;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 18.05.2020; Time: 17:16
 */
public class ReviewIf {
	public static boolean checkLeapYear(int year) {
		boolean result = false;

		int condition400 = 400;
		int condition100 = 100;
		int condition4 = 4;

		if (year % condition400 == 0) {
			result = true;
		} else if (year % condition100 == 0) {
			result = false;
		} else if (year % condition4 == 0) {
			result = true;
		}
		return result;
	}

	public static boolean checkLeapYearDos(int year) {
		return year % 400 == 0 ^ year % 100 == 0 || year % 4 == 0;
	}

	public static void main(String[] args) {
		System.out.println(checkLeapYearDos(2000));
	}
}
