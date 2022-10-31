package test.main;

import test.mypac.joinner;

public class MainClass05 {
	public static void main(String[] args) {
		joinner j1=new joinner() {
			
			@Override
			public String join(String one, String two) {
				// TODO Auto-generated method stub
				return one+two;
			}
		};
		String result1=j1.join("안녕", "하신가?");
		
		joinner j2=(one,two)->{
			return one+two;
		};
		//메소드가 딱히 필요로 하지 않는다면 아래와 같이 중괄호를
		//생략하고 리턴할 값을 명시만 해도 된다.
		//이를 람다식 이라 부른다.
		joinner j3=(one,two)-> one+two;
	}
}
