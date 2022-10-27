package test.auto;
/*
 * -접근 지정자 접근범위
 * public : 어디에서나 접근 가능
 * protected : 동일한 package 혹은 상속 관계에서 자식에서 접근 가능
 * default : 동일한 package 안에서만 접근 가능
 * 위의 디폴트는 작성 자체를 안하면 (공백)인 경우에 자동으로 지정.
 * private : 동일한 클래스, 혹은 동일한 객체에서만 접근 가능
 * 
 * -접근 지정자를 붙이는 위치
 * 1. 클래스를 선언시
 * 2. 생성자
 * 3. 필드
 * 4. 메소드
 * 
 * 클래스는 default와 public 두가지의 접근 지정자만 지정 가능하다.
 * 접근 지정자를 생략한 것이 default 접근 지정자다.
 */
public class Car {
	protected Engine engine;
	
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴수가 없어요.");
			return;
		}
		System.out.println("달려요!");
	}
}
