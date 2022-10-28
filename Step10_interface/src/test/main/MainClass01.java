package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		//인터페이스도 데이터 타입은 가능하다.
		Remocon r1=null;
		//하지만 단독으로 객체 생성은 불가능하므로 
		//이를 구현(implements) 한 클래스를 이용해 참조값을 얻어낸다.
		Remocon r2=new MyRemocon();
		r2.up();
		r2.down();
		//인터페이스의 필드를 참조는 할 수 있다.
		String result=Remocon.COMPANY;
	}
	
}
