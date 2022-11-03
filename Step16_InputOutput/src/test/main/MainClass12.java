package test.main;
/*
 * 11에서 만든 txt파일을 읽어보자
 * 
 * - hint
 * FileReader 객체를 잘 활용해보시오
 */


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.CharBuffer;

public class MainClass12 {
	public static void main(String[] args) {
		File memo=new File("C:/acorn202210/myFolder/memo.txt");

		try {
			FileReader f1=new FileReader(memo);
			
			
			
			while (true) {
			int x= f1.read();
			if(x==-1) {
				break;
			}
				System.out.print((char)x);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
