package test.main;

import test.mypac.HandPhone;
import test.mypac.phone;

public class MainClass04 {
	public static void main(String[] args) {
		Object p3 =new HandPhone();
		phone p2 = (HandPhone)p3;
		HandPhone p1 = (HandPhone)p3;
	}
}
