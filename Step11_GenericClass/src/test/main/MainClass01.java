package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;

public class MainClass01 {
	public static void main(String[] args) {
		//객체 생성시 Generic 클래스는 비워도 된다.
		//참조값을 필드나 변수에 받을때만 type을 선언해주면 된다.
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setItem(new Apple());
		Apple a=box1.getItem();
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setItem(new Banana());
		Banana b=box2.getItem();
	}
}
