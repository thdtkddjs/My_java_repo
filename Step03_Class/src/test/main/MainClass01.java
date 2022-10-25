package test.main;

import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		//text.mypac에 있는 car 클래스로
		//객체를 생성해서 참조값을 얻어냈지만 사용하지 않고 버림
		new Car();
		//위와 같은 경우에서 참조값을 car1이라는 지역변수에 저장함
		Car car1=new Car();
		//필드에 값 대입
		car1.name="포니타";
		car1.drive();
		car1.stop();
		
		Car car2=new Car();
		car2.name="람보르기니";
		car2.drive();
		car2.stop();
	}
}
