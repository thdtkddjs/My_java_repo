package test.main;

import test.mypac.CPU;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 1.MacBook 객체를 생성해서 참조값을 mac1 지역변수에 담기
		 * 단, MacBook 클래스를 절대 수정하지 마세요
		 */
		MacBook mac1=new MacBook(new CPU(),new Memory(),new HardDisk());
		//2. mac1 지역변수에 들어있는 참조값을 이용해서
		//doGame() 메소드를 실행
		mac1.doGame();
	}
}
