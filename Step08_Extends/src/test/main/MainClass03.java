package test.main;

import test.mypac.HandPhone;
import test.mypac.phone;

public class MainClass03 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		
		//p1의 참조값을 p2라는 phone타입 지역 변수에 대입
		phone p2=p1;
		//p1의 참조값을 p3라는 Object타입 지역 변수에 대입
		Object p3=p1;
	}
}
