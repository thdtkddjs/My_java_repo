package test.main;
/*
 * 1. 한명의 회원 정보를 담을 수 있는 객체를 생성할 Member 클래스를
 * mypac쪽에 만든다.
 * 회원 한 명의 정보는 번호, 이름, 주소로 이루어져있다.
 */

import test.mypac.Member;

public class MainClass03 {
	public static void main(String[] args) {
		//2. Member 클래스로 객체를 생성하여 참조값을 m1이라는
		//지역 변수에 담는다.
		Member m1=new Member();
		//3. m1에 담긴 참조값을 이용해서 1, 김구라, 노량진이라는 정보를
		//저장한다.
		m1.num = 1;
		m1.name = "김구라";
		m1.address = "노량진";
		
		Member m2=new Member();
		m2.num = 2;
		m2.name = "해골";
		m2.address = "행신동";
		
		// m1 안의 참조값을 이용해서 콘솔창에 김구라의 정보를 콘솔창에
		// 번호 : 1 이름 : 김구라, 주소 : 노량진을 출력
		
		m1.showInfo();
		m2.showInfo();
	}

}
