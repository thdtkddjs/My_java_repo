package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		//콘솔창과 연결된 객체의 참조값
		PrintStream ps=System.out;
		//학습을 위해서 PrintStream 객체를 부모type으로 받아보기
		//OutputStream도 1byte 처리 스트림이다.(한글 처리 불가)
		OutputStream os=ps;
		
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(44032);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
