package test.mypac;

public abstract class Weapon {
	
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	//공격을 하는 메소드의 모양만 정의하고 실제 구현은 하지 않기.
	//미완성된 추상 메소드를 만들때는 abstract 예약어가 필요하다.
	public abstract void attack();
}
