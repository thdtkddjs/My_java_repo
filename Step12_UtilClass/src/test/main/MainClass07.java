package test.main;

import java.util.HashSet;

/*
 * HashSet은 Set 인터페이스를 구현한 클래스이다.
 * -순서가 없다
 * -key값도 없다.
 * -중복을 허용하지 않는다.
 * -어떤 데이터를 묶음으로 관리하고자 할때 사용한다.
 */
public class MainClass07 {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(30);
		set.add(30);
		
		HashSet<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("peter");
		set2.add("lee");
		set2.add("park");
		set2.add("park");
	}
}
