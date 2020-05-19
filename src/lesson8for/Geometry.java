package lesson8for;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 19.05.2020; Time: 17:25
 */
public class Geometry {
	public static void main(String[] args) {
		rectangle(10);
	}

	public static void rectangle(int numberLine) {
		String star = "*";
		String line = "";
		for (int i = 0; i < numberLine; i++) {
			line = line + star;
			System.out.println(line);
		}
	}
}
