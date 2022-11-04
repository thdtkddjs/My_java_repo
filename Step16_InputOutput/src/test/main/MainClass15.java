package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass15 {
	
	public static void main(String[] args) {
		
		//필요한 지역 변수를 미리 만들어 오류를 방지
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//파일에서 byte를 읽어내는 객체
			fis=new FileInputStream("c:/acorn202210/myFolder/bottle.png");	
			//출력할 객체
			fos=new FileOutputStream("c:/acorn202210/myFolder/copied.png");
			while(true) {
				//byte 알갱이 하나씩을 읽어낸다.
				int data=fis.read();
				if(data==-1) {
					break;
				}
				//읽어낸 byte를 출력하기
				System.out.println(data);
				fos.write(data);
			}
			fos.flush();
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			//오류처리와 관계없이 강제종료
			if(fis!=null) fis.close();
			if(fos!=null) fos.close();
			}catch(Exception e) {}
		}
	}
}
