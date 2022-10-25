package test.mypac;
/*
 * 메소드를 만들 때 고려해야할 것
 * 
 * 1. 접근 지정자 (ex public)
 * 2. static or non static
 * 3. 리턴 type
 * 4. 메소드명
 * 5. 메소드에 전달하는 인자의 갯수와 데이터 type
 */
public class MyObject {
	
	public void walk() {
		System.out.println("걸음을 걸어요");
	}
	
	public int getNumber() {
		return 10;
	}
	
	public String getGreeting() {
		return "안녕하세요";
	}
	public Car getCar() {
		return new Car();
	}
	public void setNum(int num) {
		System.out.println("num: "+num);
	}
	public void setName(String name) {
		System.out.println("name: "+name);
	}
	public void useCar(Car car) {
		car.drive();
	}
	public void doSomething(int no, String msg, Car car1) {
		System.out.println("무언가 작업중입니다!");
	}
}
