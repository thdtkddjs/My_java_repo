package test.main;

import java.util.Random;


public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 0~10 사이의 랜덤한 정수를 얻어내서 콘솔창에 출력하고 싶다.
		 */
		Random a=new Random();
		a.nextInt();
		double b = Math.random();
		double c = b * 10;
		System.out.println((int)c);
		System.out.println(a.nextInt(100));
		
		int d = a.nextInt(45) + 1;
		boolean e = a.nextBoolean();
		
		System.out.println(e);
	}
}
