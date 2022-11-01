package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		
		try {
			/*
			 * Thread(실행의 흐름)을 임의로 5초동안 잡아두기
			 * 컴파일시 Exception이 발생하기 떄문에 
			 * 반드시 예외처리가 필요하다.
			 */
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됨");
	}
}
