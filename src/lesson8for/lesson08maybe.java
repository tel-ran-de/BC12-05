package lesson8for;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 19.05.2020; Time: 16:16
 */
public class lesson08maybe {
	public static void main(String[] args) {
		mySince();
	}

	public static void mySince(){
		int a = 20;
		int b = 11;
		int c;
		for (int i = 0; i < a; i++) {
			b = b + i;
			c = i + 1;
			System.out.println("c " + c);
		}
		System.out.println("b " + b);
	}


	public static void startShuttle() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Start!!!!");
	}

	public static void workToWife() {
		int workStart = 8;
		int workHour = 16;
		int evening = 20;

		int a = 4;
		a++;
		a += 2;
		a = a + 2;
		System.out.println(a);
		// Начало, условие, шаг

		for (int i = workStart; i < workHour; i++) {
			System.out.println("Пришёл");
			System.out.println("Ушёл");
		}

		for (int i = workHour; i < evening; i += 2) {
			System.out.println("В магаз");
		}

		for (int i = 0; i < 10; i = i/3) {
			
		}

		for (int i = 0; i < 10; i *= 10) {

		}


	}


	public static void myPoorLife(int weekDays) {
		for (int i = 1; i <= weekDays; i++) {
			System.out.println(i);
			System.out.println("--------------");
			System.out.println("Новый день");
			System.out.println("Я встаю в шесть утра");
			System.out.println("Я иду на завод");
			System.out.println("после работы я иду домой");
			System.out.println("Дома я включаю телевизор и смотрю кино");
			System.out.println("Курю с соседом");
			System.out.println("Иду спать");
			System.out.println("День подошёл к концу");
		}
	}
}
