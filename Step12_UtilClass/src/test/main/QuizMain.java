package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		//sample 데이터
		Map<String, String> dic=new HashMap<>();
		dic.put("house","집");
		dic.put("phone","전화기");
		dic.put("car","자동차");
		dic.put("pencil","연필");
		dic.put("eraser","지우개");
		
		
		/*
		 * 단어를 검색하여 그 뜻을 출력해보자
		 */
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("검색할 단어를 입력하세요:");
			String msg=scan.nextLine();
			System.out.println(msg);
			String result = dic.getOrDefault(msg, "목록에 없습니다.");
			if (result=="목록에 없습니다.") {
				System.out.println(msg+" 의 뜻은 "+result);
			}
			else {System.out.println(msg+" 의 뜻은 "+result+"입니다.");}
		}
	}
	
}
