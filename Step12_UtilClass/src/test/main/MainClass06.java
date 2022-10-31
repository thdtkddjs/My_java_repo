package test.main;

import java.util.HashMap;
/*
 * java에서 어떤 데이터를 key:value 쌍으로 관리하고 싶으면
 * HashMap 객체를 사용한다.
 * key의 Generic은 자유지만 보통 String type이며,
 * value의 Generic은 Object를 쓰면 여러가지 type을 다 쓸수 있다.
 */
public class MainClass06 {
	public static void main(String[] args) {
		HashMap<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("isMan", true);
		/*
		 * value의 Generic 클래스가 Object이므로
		 * 리턴되는 Object type을 원래 type으로 casting해야한다.
		 */
		
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		boolean isMan=(boolean)map1.get("isMan");
		
		map1.put("name", "에이콘");
		
		map1.remove("isMan");
		
		map1.clear();
	}
}
