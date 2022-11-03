package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		File f1=new File("C:/acorn202210/myFolder/gura.txt");
		try {
			//파일이 없으면 만들고, 있으면 삭제한다.
			if(!f1.exists()) {
				f1.createNewFile();
				System.out.println("gura.txt가 생성됨");
			}else {
				f1.delete();
				System.out.println("gura.txt가 구라됨");
			}
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
