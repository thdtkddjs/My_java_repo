package test.main;

import java.io.File;

public class MainClass07 {
	public static void main(String[] args) {
		//c:/을 Access할 수 있는 파일 객체 생성
		File f=new File("C:/");
		String[] names=f.list();
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			System.out.println("--------------");
		}
		for(String tmp:names) {
			System.out.println(tmp);
			System.out.println("-------------");
		}
	}
}
