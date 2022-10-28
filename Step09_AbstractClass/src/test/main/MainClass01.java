package test.main;

import test.mypac.Weapon;
import test.mypac.myWeapon;
/*
 * 추상클래스(abstract class)
 * 
 * class 예약어 앞에 abstract를 명시해야 추상 클래스가 정의된다.
 * 형태만 정의되고 실제 구현은 되지 않은 메소드가 포함됨을 알려주는 역할
 * 형태만 정의된 메소드 역시 abstract 예약어를 붙여서 정의한다.
 * 생성자는 존재하지만 단독 객체 생성(new)이 불가능하다.
 * 
 * 추상 클래스 Type의 id가 필요하다면 추상클래스를 상속받은
 * 자식 클래스를 정의해서 객체를 생성한다.
 * 
 * 이때 자식 클래스는 부모의 추상메소드들을 모두 오버라이드(재정의)해야
 * 오류가 나지 않는다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//추상클래스도 Data Type으로 기능한다.
		Weapon w1=null;
		//추상 클래스 단독으로는 객체를 생성할 수 없다.
		//weapon w2=new weapon();
		
		myWeapon w3=new myWeapon();
		w3.prepare();
		w3.attack();
		
		Weapon w4 = w3;
		w4.prepare();
		w4.attack();
	}
}
