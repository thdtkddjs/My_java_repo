package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 파일이나 폴더를 제어할 수 있는 File객체를 생성해서
		 * 참조값을 f라는 지역변수에 담기
		 */
		File f=new File("c:/acorn202210/myFolder/memo.txt");
		try {
			
			if(f.isFile()) {
				f.delete();
			}
			else {
				f.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
