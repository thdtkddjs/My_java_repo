package test.mypac;
//이미 존재하는 phone 클래스를 상속 받아서 HandPhone 클래스를 정의
public class HandPhone extends phone{
	
	public HandPhone() {
		System.out.println("HandPhone 생성자 호출됨");
	}
	public void Mobilecall() {
		System.out.println("이동중에 전화를 걸어요");
	}
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}
}
