package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//Car type을 저장할 수 있는 ArrayList를 생성해서
		//참조값을 cars에 담는다
		List<Car> cars= new ArrayList<>();
		//Car 객체를 3개 생성해서 List객체에 저장한다.
		cars.add(new Car("포드"));
		cars.add(new Car("기아"));
		cars.add(new Car("봉고"));
		
		//반복문 for를 이용해서 저장된 모든 Car객체의 drive메소드를
		//순서대로 호출한다.
		for(Car tmp:cars) {
			tmp.drive();
		}
		System.out.println("----Consumer 인터페이스 활용----");
		cars.forEach((item)->{
			item.drive();
		});
	}
}
