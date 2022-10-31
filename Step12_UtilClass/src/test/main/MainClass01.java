package test.main;

import java.util.ArrayList;
import java.util.List;

/*
 * java에서 배열은 크기를 조절할 수 없는 고정 배열이다.
 * 따라서 동적으로 item을 추가하고 삭제하는 작업을 하려면
 * 일반 배열은 사용할 수 없다.
 * 그래서 해당 작업에는 ArrayList 객체를 사용한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//String 타입을 저장하는 ArrayList 객체
		List<String> names=new ArrayList<>();
		
		
		/*
		 * 김구라, 해골, 원숭이 3개의 값을 저장하고
		 * 0번방의 아이템을 불러와서 item이란 변수에 담아보고
		 * 1번방의 아이템을 삭제해보고
		 * 0번방에 "에이콘"을 넣고 싶으면?
		 * 저장된 아이템의 갯수를 size라는 지역 변수에 담아보고
		 * 저장된 아이템 전부를 삭제해보자.
		 */
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		String item = names.get(0);
		names.remove(1);
		names.set(0, "에이콘");
		int size=names.size();
		names.removeAll(names);
	}
}
