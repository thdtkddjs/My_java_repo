package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass02 {
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");
		
		//for문을 다양하게 활용하여 names의 값을 추출한다.
		for(int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("---- 확장 for 문을 사용하면 ----");
		for(String tmp:names) {
			System.out.println(tmp);
		}
		System.out.println("---- forEach() 메소드 활용1 ----");
		Consumer<String> con=new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		names.forEach(con);
		
		System.out.println("---- forEach() 메소드 활용2 ----");
		Consumer<String> con2=(t)->{
				System.out.println(t);
		};
		names.forEach(con2);
		
		System.out.println("---- forEach() 메소드 활용3 ----");
		names.forEach((t)->{
			System.out.println(t);
		});
	}
}
