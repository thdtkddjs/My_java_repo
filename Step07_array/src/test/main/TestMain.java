package test.main;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int point=1000;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("수행중...");
			
			if(point==0) {
				System.out.println("파산했습니다!");
				break;
			}
			System.out.println("Enter를 치세요");
			scan.nextLine();
			point -= 10;
		}
	}
}
