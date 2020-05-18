package lesson05Switch;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 18.05.2020; Time: 16:53
 */
public class HelloSwitch {
	public static void main(String[] args) {
		//За пятёрку в четверти по математике папа обещал мне велосипед.
		//За четвёрку в четверти по математике мама купит мне GoPro4.
		//За тройку меня, наверное, не будут ругать.
		//За двойку меня отругают.
		//За единицу меня "убьют".
		int schoolNotes = 2;
		poorBoy(schoolNotes);
		System.out.println(calenderMonth(6));
	}

	// оператор выбора  - switch
	public static void poorBoy(int note) {
		String papaSay;
		switch (note) {
			case 5:
				papaSay = "Велосипед";
				break;
			case 4:
				papaSay = "GoPro6";
				break;
			case 3:
				papaSay = "Награды не будет";
				break;
			case 2:
				papaSay = "Потерянный час жизни, слушать этих родителей";
				break;
			case 1:
				papaSay = "Совсем плохая papaSay";
				break;
			default:
				papaSay = "Такой я оценки не существует";
				break;
		}
		System.out.println(papaSay);
	}

	public static String calenderMonth(int month) {
		String monthString;
		switch (month) {
			case 1:
				monthString = "January";
				break;
			case 2:
				monthString = "February";
				break;
			case 3:
				monthString = "March";
				break;
			case 4:
				monthString = "April";
				break;
			case 5:
				monthString = "May";
				break;
			case 6:
				monthString = "June";
				break;
			case 7:
				monthString = "July";
				break;
			case 8:
				monthString = "August";
				break;
			case 9:
				monthString = "September";
				break;
			case 10:
				monthString = "October";
				break;
			case 11:
				monthString = "November";
				break;
			case 12:
				monthString = "December";
				break;
			default:
				monthString = "Invalid month";
				break;
		}
		return monthString;
	}

	public static void coffeeAutomat(){
		int a = 1; //номер кнопки в кофе-автомате
		switch (a) {
			case 1:
				System.out.println("Кофе американо готовится");
				break;
			case 2:
				System.out.println("Кипяток сейчас будет");
				break;
			case 3:
				System.out.println("Кофе эспрессо готовится");
				break;
			case 4:
				System.out.println("Какао уже в пути");
				break;
			case 5:
				System.out.println("Вода кипятится");
				System.out.println("Кофе мелется");
				System.out.println("Сливки добавляются");
				break;
			default:
				System.out.println("повторите свой выбор, напиток под номером: "
						+ a + " Временно недоступен");
				break;
		}
		System.out.println("Программа отработана без ошибок");
	}
}
