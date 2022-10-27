package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * phone 클래스를 상속받은 HandPhone 클래스로
		 * 객체를 생성해서 그 참조값을 p1에 담기
		 * 
		 * HandPhone 클래스를 호출했을 뿐인데
		 * Phone 클래스의 생성자도 호출된다.
		 * 
		 * 따라서 하나의 참조값이 Phone과 HandPhone의 기능이
		 * 모두 사용될 수 있다.
		 */
		HandPhone p1=new HandPhone();
		
		p1.call();
		p1.takePicture();
		p1.Mobilecall();
	}
}
