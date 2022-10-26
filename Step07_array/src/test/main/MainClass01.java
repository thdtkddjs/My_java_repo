package test.main;
/*
 * java에서 배열도 객체이다.
 * 즉 배열은 참조데이터 type이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//int type 5개를 저장하고 있는 배열 객체 생성 후
		//nums 라는 지역변수에 담기
		int[] nums= {10,20,30,40,50};
		//각 
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 1042.13};
				
		boolean[] truth = {true, true, false, false, true};
				
		String[] names= {"김구라", "해골", "원숭이", "주뎅이"};
		
		//배열의 각각의 방 참조 하기
		int result1=nums[0];
		
		//배열 객체의 메소드와 필드 사용해보기
		//참조값은 다르고 내용물만 복사
		int[] cloned=nums.clone();
		int[] copied=nums; //참조값을 복사
		int size=nums.length;
		
	}

}
