package text.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 객체를 하나만 생성해서 그 객체가 가지는
		//메소드들을 차례로 호출해보세요.
		//단, 메소드가 어떤 data를 리턴하면 해당 데이터를 지역변수에 
		//저장하세요
		MyObject a=new MyObject();
		
		a.walk();
		int num=a.getNumber();
		String hi = a.getGreeting();
		Car C1=new Car();
		// setNum, setName, useCar 메소드 사용
		a.setName("김구라");
		a.setNum(300);
		C1.name = "벤츠";
		a.useCar(C1);
		
		//Method 호출시 전달할 값이 지역인자로 이미 존재하는 경우
		int a1=999;
		String b="누구게";
		Car c2=new Car();
		c2.name="횬다이";
		
		//값이 들어 있는 변수를 인자로 전달할 수도 있다.		
		a.setNum(a1);
		a.setName(b);
		a.useCar(c2);
		a.doSomething(a1, b, c2);
	}
}
