package test.main;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Quiz {
	public static void main(String[] args) {
		String casino[] = {"cherry", "apple", "banana", "melon", "7"};
		int point = 1000;
		Scanner scan=new Scanner(System.in);
		while (point>=0) {
			System.out.println("현재 포인트: "+point);
			Random var1=new Random();
			int a = var1.nextInt(5);
			System.out.println(casino[a]);
			
			int b = var1.nextInt(5);
			int c = var1.nextInt(5);
			int d = var1.nextInt(5);
			System.out.print(casino[b]+" | ");
			System.out.print(casino[c]+" | ");
			System.out.println(casino[d]);
			if(b==c && c==d) {
				System.out.println("-----Jacpot!--------");
			}
			else if (b==c || c==d || b==d){
				System.out.println("원금 상환 축하드려요!");
				point -= 50;
			}
			
			else {
				System.out.println("Next time...");
				point -= 100;
			}
			System.out.println("Next Run");
			scan.nextLine();
		}
		System.out.println("파산했습니다!!!!!!");
		
	}
}
