package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		//Static 메소드, 필드는 클래스 명에 .을 찍어서
		//바로 호출/참조가 가능하다.
		MyUtil.send();
		MyUtil.version = "1.0";
	}
}
