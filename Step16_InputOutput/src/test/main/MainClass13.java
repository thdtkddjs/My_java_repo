package test.main;
/*
 * 11에서 만든 txt파일을 읽어보자
 * 
 * - hint
 * FileReader 객체를 잘 활용해보시오
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.CharBuffer;

public class MainClass13 {
	public static void main(String[] args) {
		File memo=new File("C:/acorn202210/myFolder/memo.txt");

		try {
			FileReader f1=new FileReader(memo);
			BufferedReader br=new BufferedReader(f1);
			while(true) {
				//개행기호를 기준으로 한 줄을 판별하므로
				//개행기호는 읽어오지 않는다.
				String a = br.readLine();
				if(a==null) {
					break;
				}
				System.out.println(a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
