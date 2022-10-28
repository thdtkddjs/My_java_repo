package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	Weapon w1=new Weapon() {
		
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("쉬운 공격!");
		}
	};
	
	public static void main(String[] args) {
		Weapon w2=new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("더 쉬운 공격!");
			}
		};
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("더더 쉬운 공격!");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
