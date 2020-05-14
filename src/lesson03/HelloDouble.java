package lesson03;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 14.05.2020; Time: 18:11
 */
public class HelloDouble {
	public static void main(String[] args) {
		//helloFloat();
		// justInt();
		//helloDouble();
		// helloDouble2();
		magicDouble();
	}

	public static void justInt() {
		int a, b, c;
		a = 1;
		b = 10;
		c = a / b;
		System.out.println(c);
	}

	public static void helloDouble() {
		double a, b, c;
		a = 1;
		b = 10;
		c = a / b;
		System.out.println("в первый раз " + c);
		int g = 7;
		c = c + g;
		System.out.println("во второй раз " + c);
		int f = (int) (c + g);
		double myNewDoubleVariable = c + g;
		System.out.println("myNewDoubleVariable " + myNewDoubleVariable);
		System.out.println("МАГИЯ " + f);
	}

	public static void helloFloat() {
		float a = 2.5f;
		float b = 45.6F;
		float c = (float) 5.5;
		float d = a + b + c;
		System.out.println("a + b + c = " + d);
	}

	public static void helloDouble2() {
		double a = 2;
		double b = 30;
		double c = Math.pow(a, b);
		System.out.println("Степень двойки в 30 " + c);
		// 1.073741824E9
		// 1.07 * 10 в девятой степени
	}

	public static void magicDouble() {

		int var1 = 5;
		int var2 = 2;
		int var3 = var1 / var2;

		double var4 = 5.0;
		double var5 = 2.0;
		double var6 = var4 / var5;
		double var7 = var1 / var2;

		double var25 = var1 / var4;

		System.out.println("Int Var3 = " + var3);
		System.out.println("double Var6 = " + var6);
		System.out.println("double Var7 = " + var7);
		System.out.println("double Var25 = " + var25);

		int var11 = (int) (var1 / var4);

		System.out.println("Int Var11 = " + var11);
		System.out.println("Магия " + 5.0 / var2);
	}
}
