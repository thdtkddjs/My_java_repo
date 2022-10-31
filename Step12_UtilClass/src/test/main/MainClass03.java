package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 ArrayList 객체
		//GenericClass의 대상은 기본 데이터 타입은 될 수 없다.
		//따라서 참조 데이터 타입으로 넣어줘야 오류가 나지 않는다.
		List<Integer> nums = new ArrayList<>();
		
		nums.add(100);
		nums.add(200);
		nums.add(300);
		
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	}
}
