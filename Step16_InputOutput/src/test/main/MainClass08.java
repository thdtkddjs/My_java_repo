package test.main;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File f=new File("c:/");
		//파일 객체 목록(File[])을 얻어내기
		File[] files=f.listFiles();
		
		for(File tmp:files) {
			if(tmp.isDirectory()) {
				System.out.println("[ "+tmp.getName()+" ]");
			} else {
				System.out.println(tmp.getName());
			}
		}
	}
}
