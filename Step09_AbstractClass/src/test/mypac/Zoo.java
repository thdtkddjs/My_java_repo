package test.mypac;
//동물원 클래스
public class Zoo {
	//클래스 안의 클래스(내부 클래스)
	public class Monkey{
		public void say() {
			System.out.println("안녕 나는 원숭이야!");
		}
	}
	public class Tiger{
		public void say() {
			System.out.println("안녕 나는 호랑이야!");
		}
	}
	//내부 클래스에 딸린 메소드를 만든다.
	public Monkey getMonkey() {
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}
