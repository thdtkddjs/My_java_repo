package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz implements ActionListener{
	static JTextField msg;
	static JTextArea box;
	static FileWriter fw;
	static FileReader fr;
	public static void main(String[] args) {
		File textfile=new File("C:/acorn202210/myFolder/memo.txt");
		try{FileWriter fw=new FileWriter(textfile);
		FileReader fr=new FileReader(textfile);
		
		JFrame a1=new JFrame();
		a1.setBounds(100, 100, 500, 500);
		a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a1.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("추가");
		a1.add(btn1);
		btn1.setActionCommand("add");
		JButton btn2=new JButton("불러오기");
		a1.add(btn2);
		btn2.setActionCommand("callback");
		msg=new JTextField(10);
		a1.add(msg);
		box=new JTextArea(10, 10);
		a1.add(box);
		a1.setVisible(true);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		
		if(command.equals("add")) {
			String a=msg.getText();
			try{fw.write(a);
			fw.flush();
			}catch(Exception e3) {
				e3.printStackTrace();
			}
		}else if(command.equals("callback")) {

			String bb=null;
			while(true) {try {
				int a= fr.read();
				if (a==-1) {
					break;
				}
				bb += (char) a;
			}catch(Exception e4) {
				e4.printStackTrace();
			}
			}
			box.setText(bb);
		}
	}
}