package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//Member를 이용한 배열 형식의 객체 ArrayList 예제
		
		List<Member> m1= new ArrayList<>();
		
		Member a = new Member(1, "김구라","노량진");
		Member b = new Member(2, "해골","행신동");
		Member c = new Member(3, "덩어리","상도동");
		
		m1.add(a);
		m1.add(b);
		m1.add(c);
		
		for(Member tmp:m1) {
			System.out.println(
					"번호 : "+tmp.num+
					" 이름 : "+tmp.name+
					" 주소 : "+tmp.addr);
		}
		
		
	}
}
