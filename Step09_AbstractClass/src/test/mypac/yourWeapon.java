package test.mypac;

public class yourWeapon extends Weapon{
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("공격!");
		}
		public void weaponJack() {
			System.out.println("무기 발견");
			System.out.println("이제 이 무기는 제겁니다.");
		}
}