package test.main;
/*
 * while문을 활용해서 원하는 횟수만큼 반복하기
 * 
 * - 반복 횟수가 명확히 정해져 있으면 for문으로 반복
 * - 반복 횟수가 정해져 있지 않거나 반복 도중에 횟수가 변하는 경우는
 * 	 while문으로 반복
 */

public class MainClass08 {
	public static void main(String[] args) {
		//while 문 제어용 변수를 미리 만들어서 0으로 초기화
		int count=0;
		//count를 조건으로 특정 조건 하에 무한 루프가 break됨.
		while(true) {
			System.out.println("안녕! 안녕! 안녕!");
			count++;
			if(count==5) {
				break;
			}
		}
		System.out.println("-------");
		count = 0;
		//if(int i; i<5; i++)와 완전히 같은 동작을 한다.
		while (count<5) {
			System.out.println("또 안녕! 안녕! 안녕!");
			count++;
		}
		//반대로 이렇게 쓰는 경우는 while(true)와 완전히 같다.
		for(;;) {
			
		}
	}
}
