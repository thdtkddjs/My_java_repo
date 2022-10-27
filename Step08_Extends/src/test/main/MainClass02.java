package test.main;

import test.mypac.HandPhone;
import test.mypac.phone;

/*
 * 지역변수나 필드 앞에 선언하는 data type은
 * 
 * 그안에 들어있는 참조값의 사용 설명서라고 생각하면 된다.
 * 
 * 그렇기 떄문에 그 지역변수나 필드에 .을 찍으면 사용 설명서에 명시된
 * 
 * 기능만 사용할 수 있다.
 * 
 * java의 모든 객체는 다형성을 가질 수 있다.
 * 
 * 다형성은 type이 여러개라는 의미이다.
 */
public class MainClass02 {
	public static void main(String[] args) {
	
		HandPhone p1=new HandPhone();
		//어떤 객체의 참조값을 부모 type으로도 받을 수 있다.
		phone p2=new HandPhone();
		Object p3=new HandPhone();
		//이 경우에는 자식 type으로 객체를 생성해도 
		//자식 타입의 기능을 사용할 수 없다.
	}
		
		
}
