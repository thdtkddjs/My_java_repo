package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//1byte 처리 스트림
		OutputStream os=ps;
		//2byte 처리 스트림으로 업그레이드
		OutputStreamWriter osw=new OutputStreamWriter(os);
		//조금 더 기능이 개선된 BufferedWriter객체 사용
		BufferedWriter bw= new BufferedWriter(osw);
		try {
			bw.write("셋");
			bw.write("하나");
			bw.newLine();//개행기호 출력메소드
			bw.write("아니야");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
