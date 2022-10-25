package test.main;

import test.mypac.Member;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Member 객체를 생성해서
		Member no1=new Member();
		//2. 회원 한명의 정보를 담고
		no1.num = 1;
		no1.name = "김구라";
		no1.address = "노량진";
		//3. showinfo() 메소드를 호출
		no1.showInfo();
	}
}
