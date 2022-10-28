package test.main;

import test.mypac.Gun;
import test.mypac.Weapon;
import test.mypac.yourWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		//동일 클래스 안에 있는 static 메소드 호출 가능
		test("안녕 안녕 안녕~");
		//직접 클래스를 만들고 객체 생성을 해서 아래의 useWeapon() 메소드 호출
		yourWeapon a=new yourWeapon();
		a.weaponJack();
		useWeapon(a);
		Weapon g1=new Gun();
		useWeapon(g1);
		
	}
	//동일 클래스 내에 있더라도
	//같은 필드(ex static)에 있지 않다면 서로 참조할 수 없다.
	public static void test(String msg) {
		System.out.println(msg);
	}
	//인자로 전달된 Weapon type을 사용하는 static method
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
