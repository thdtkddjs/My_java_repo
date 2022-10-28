package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	static class RangedWeapon extends Weapon{

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("공중 공격을 해요!");
		}
		
	}
	
	public static void main(String[] args) {
		Weapon w1= new RangedWeapon();
		useWeapon(w1);
		
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("광역 공격을 해요!");
			}
			
		}
		Weapon w2=new OurWeapon();
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
