package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		Member m1=new Member();
		m1.num = 0;
		m1.name = "deus ax makina";
		m1.addr = "Matrix";
		
		Member m2=new Member(1, "김구라", "노량진");
		
		m1.showInfo();
		m2.showInfo();
	}
}
