package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass16 {
	
	public static void main(String[] args) {
		
		//필요한 지역 변수를 미리 만들어 오류를 방지
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//파일에서 byte를 읽어내는 객체
			fis=new FileInputStream("c:/acorn202210/myFolder/bottle.png");	
			//출력할 객체
			fos=new FileOutputStream("c:/acorn202210/myFolder/copied2.png");
			//바이트로 읽어낸 정보를 담아둘 byte[]객체를 생성해둔다.
			byte[] buffer=new byte[1024];
			
			while(true) {
				int readByte=fis.read(buffer);
				if(readByte==-1) {
					break;
				}
				//byte[] 배열에서 0번방부터 읽은 만큼만 출력한다.
				fos.write(buffer, 0, readByte);
				fos.flush();
			}
		
		
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
