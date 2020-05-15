package lesson4;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 15.05.2020; Time: 18:38
 */
public class MyWebSite {
	public static void main(String[] args) {
		myBestProjectManagerTaskNumber100();
	}

	public static void myBestProjectManagerTaskNumber100() {
		int a = 5;
		a = a + 2;
		String articleTitle = "LONDON IS THE CAPITAL OF GREAT BRITAIN";
		articleTitle = articleTitle.substring(0, 1).toUpperCase()
				+ articleTitle.substring(1).toLowerCase();

		String city = "berlin";

		city = city.substring(0, 1).toUpperCase()
				+ city.substring(1, 2).toLowerCase()
				+ city.substring(2, 3).toUpperCase()
				+ city.substring(3, 4).toLowerCase()
				+ city.substring(4, 5).toUpperCase()
				+ city.substring(5, 6).toLowerCase();

		System.out.println(city);
		System.out.println(articleTitle);
		// articleTitle = articleTitle.toLowerCase();

	}
}
