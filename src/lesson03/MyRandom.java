package lesson03;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 14.05.2020; Time: 18:30
 */
public class MyRandom {
	public static void main(String[] args) {
		int min = 30;
		int max = 100;
		int result = (int) (Math.random() * ((max - min) + 1) + min);
		System.out.println(result);
	}
}
