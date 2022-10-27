package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//자식에게 사 준 일반 핸드폰(인터넷)
		HandPhone p1=new HandPhone();
		//자식이 갑자기 인터넷을 하고싶다고 함
		SmartPhone p2=(SmartPhone)p1;
		//ClassCastException이 발생함
		
		//작동 x
		p2.doInternet();
	}
}
