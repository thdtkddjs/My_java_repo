package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass09 {
	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");
		
		//반복자(Iterator) 객체 얻어내기
		//저장된 item을 일렬로 세웠다고 연상하면 됨.
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			String item=it.next();
			System.out.println(item);
		}
		//다양한 HashSet method들
		boolean isContain=names.contains("김구라");
		
		int size=names.size();
		
		names.remove("해골");
		
		names.clear();
	}
}
