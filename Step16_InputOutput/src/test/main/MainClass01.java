package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * 입력, 출력(input, output)
 * 
 * 어떤 대상으로부터 메모리로 읽어들이는 것을 입력이라 한다.
 * 컴퓨터 언어의 관점에서 메모리라는 것은 변수 or 필드 or 객체와 유사하다.
 * 데이터는 2진수로 이루어져 있으나, 1byte(2진수 8개의 묶음)단위로 생각하는 것이 편하다.
 * 1byte를 10진수로 환산하면 0~255 사이의 숫자를 표현할 수 있다.
 * 입력과 출력을 통해서 이동하는 데이터는 byte 하나하나가 이동하는 개념이다.
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//키보드에 연결된 InputStream type의 참조값을
		//kbd라는 지역변수에 담는다.
		//1byte 단위 처리 스트림이며, 
		//영문 대소문자, 숫자, 특수문자만 처리 가능하다.
		//한글은 처리 불가
		
		InputStream kbd=System.in;
		System.out.println("입력: ");
		
		try {
			int code=kbd.read();
			System.out.println("code: "+code);
			//코드에 대응되는 문자 얻어내기
			char ch=(char)code;
			System.out.println(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
