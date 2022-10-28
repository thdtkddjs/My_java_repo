package test.main;

import test.mypac.ARemocon;
import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인
		MyRemocon r1= new MyRemocon();
		Remocon r2= new MyRemocon();
		Object r3= new MyRemocon();
		
		useRemocon(new ARemocon());
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
