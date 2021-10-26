package java_Programs;

import java.util.Calendar;

public class Days_adding {
	
	static Calendar cal1 = Calendar.getInstance();
	
	public static void method() {
		System.out.println(cal1.getTime());
	}
	
	public static void main(String[] args) throws Throwable{
		//Days_adding.method();
		System.out.println(cal1.getTime());
		cal1.add(Calendar.DAY_OF_MONTH, 30);
		System.out.println(cal1.getTime());
	}
}
