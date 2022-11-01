package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain2 {
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
		
		
		
		while(true) {
			System.out.println("검색할 단어를 입력하세요:");
			String msg=scan.nextLine();
			System.out.println("입력한 메시지 :"+msg);
			//해당 키값이 존재하는지 여부를 알아낸다.
			boolean isExist=dic.containsKey(msg);
			//get() 메소드 사용 시 key값이 없으면
			//String의 경우 null이, 
			//int의 경우 0이나 -1(이쪽이 더 많다)이 리턴된다.
			String result = dic.getOrDefault(msg, "목록에 없습니다.");
			if (msg.equals("q")) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			
			if (!isExist) {
				System.out.println(msg+" 의 뜻은 "+result);
			}
			else {System.out.println(msg+" 의 뜻은 "+result+"입니다.");}
		}
	}
	
}