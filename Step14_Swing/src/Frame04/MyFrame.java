package Frame04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//경계선을 따라 배치하는 레이아웃	
		setLayout(new BorderLayout());
		
		JButton btn1=new JButton("버튼1");
		add(btn1, "North");
		
		JButton btn2=new JButton("버튼2");
		add(btn2, "East");
		
		JButton btn3=new JButton("버튼3");
		add(btn3, "South");
		
		JButton btn4=new JButton("버튼4");
		add(btn4, "West");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임4");
	}
}
