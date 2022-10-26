package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//0으로 초기화된 방 3개짜리 int[] 객체를 만들어보기
		int[] nums= {0, 0, 0};
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		//0으로 초기화된 배열을 빠르게 만드는 방법
		//default 값이 0이므로 가능하다.
		int[] nums2 =new int[3];
		
		nums2[0]=100;
		nums2[1]=200;
		nums2[2]=300;
		
		System.out.println("main 메소드가 정상종료됨");
	}
}
