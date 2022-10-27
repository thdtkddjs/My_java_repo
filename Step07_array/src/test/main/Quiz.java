package test.main;

import java.util.Random;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Quiz {
	public static void main(String[] args) {
		String casino[] = {"cherry", "apple", "banana", "melon", "7"};
		
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
		else {
			System.out.println("Next time...");
		}
	}
}
