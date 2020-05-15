package lesson4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created for BC12-05-2020.
 * User: andron13
 * Date: 15.05.2020; Time: 18:27
 */
public class JustChar {
	public static void main(String[] args) {
		//myString();
		mygicString();
	}
	public static void myString(){
		String name = "Вася";
		String secondName = "Сидоров";
		String student = name + " " + secondName;
		int dlina = student.length();
		int shortNameLength = name.length();
		System.out.println(dlina);
	}
	public static void myChar(){
		// € ® ™ η µ
		char euro = '€';
		char copyright = '©';
		String result = "";
		System.out.println(result + euro);
	}

	public static void mygicString(){
		String digit = "10";
		int myNewDigit = Integer.parseInt(digit);
		myNewDigit = myNewDigit +1;
		System.out.println(myNewDigit);
	}
}
