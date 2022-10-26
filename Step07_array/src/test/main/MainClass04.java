package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/* 1.bike 객체를 담을 수 있는 방 3개짜리 배열객체 생성
		 * 2.배열의 각각의 방에 Bike 객체를 생성해서 담기
		 * 반복문 for를 이용하여 각각의 방에 있는 Bike 객체의
		 * ride() 메소드를 호출
		 */
		Bike[] bikes=new Bike[3];
		
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for(int i=0;i < bikes.length;i++) {
			bikes[i].ride();
		}
		
	}
}
