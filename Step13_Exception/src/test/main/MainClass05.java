package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass05 {
	public static void main(String[] args) {
		Random ran=new Random();
		//0~4사이의 랜덤한 정수 생성
		int ranNum=ran.nextInt(5);
		
		//우연히 가장 큰 수가 나오면 WowException 발생시키기
		if(ranNum==4) {
			throw new WowException("대단하군요!");
			
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
