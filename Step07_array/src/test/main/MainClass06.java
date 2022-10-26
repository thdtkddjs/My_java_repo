package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		//문자열을 저장하는 방 5개짜리 배열 객체를 생성한다.
		String[] msgs=new String[5];
		
		//키보드로부터 입력받을 수 있는 Scanner 객체를 생성
		Scanner scan=new Scanner(System.in);
		
		//반복문으로 위의 msgs 배열에 scan으로 값을 입력한다.
		for(int i=0;i<msgs.length;i++) {
			System.out.print(i+1+" 번째 msg를 입력 :");
			String str = scan.nextLine();
			msgs[i]=str;
		}	
		//반복문으로 배열에 저장된 값을 순서대로 출력한다.
		for(int i=0;i<msgs.length;i++) {
			System.out.println(i+1+"번째 메시지는 "+msgs[i]);
		}
	}
}
