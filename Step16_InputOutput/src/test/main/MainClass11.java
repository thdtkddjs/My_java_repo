package test.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

public class MainClass11 {
	public static void main(String[] args) {
		//문자열을 저장할 파일을 만들기 위한 File 객체
		File memoFile=new File("C:/acorn202210/myFolder/memo.txt");
		try {
		//만일 파일이 존재하지 않으면
			if(!memoFile.exists()) {
				memoFile.createNewFile();
			}
			FileWriter pw=new FileWriter(memoFile, true);
			pw.write("김구라");
			pw.write("\t");
			pw.write("해골");
			pw.write("\r\n");
			pw.write("원숭이");
			pw.flush();
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
