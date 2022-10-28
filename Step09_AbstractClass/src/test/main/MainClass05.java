package test.main;

import java.util.Scanner;

import test.mypac.Weapon;

public class MainClass05 {
	//필드를 선언하면서 값을 대입하는 코드
	int num=999;
	String name="kim";
	Scanner scan=new Scanner(System.in);
	//필드는 선언만 하면 기본값이 들어간다.
	int weight;//0이 기본값
	boolean isRun;//false가 기본값
	String msg;//null이 기본값
	Scanner scan2;
	//static 영역에 올리고 싶은 필드는 static 예약어를 사용한다.
	static String greet="안녕";
	
	static Weapon w1=new Weapon() {

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("공격 하긴합니다");
		}
		
	};
	
	
	public static void main(String[] args) {
		useWeapon(w1);
		
		Weapon w2=new Weapon() {

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("이게 되네?");
			}
			
		};
		useWeapon(w2);
		
		useWeapon(new Weapon() {

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
