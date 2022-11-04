package test.main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz2 extends JFrame implements ActionListener{
	JTextArea box;
	JTextField input;
	
	
	public Quiz2(String title){
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//흐르듯이 배치하는 레이아웃
		setLayout(new BorderLayout(2,2));
		
		
		
		
		input=new JTextField(10);
		JButton btn1=new JButton("추가");
		btn1.setActionCommand("add");
		JButton btn2=new JButton("불러오기");
		btn2.setActionCommand("call");
		box=new JTextArea(20, 10);
		//패널을 만드는 객체를 생성
		JPanel panel=new JPanel();
		
		//add(input);
		//add(btn2);
		//add(btn1);
		add(box, BorderLayout.CENTER);
		//패널에 UI를 추가
		panel.add(input);
		panel.add(btn1);
		panel.add(btn2);
		//패널을 프레임 상단에 배치
		add(panel, BorderLayout.NORTH);
		//TextArea에 스크롤 패널을 배치
		JScrollPane sc=new JScrollPane(box);
		add(sc, BorderLayout.CENTER);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public static void main(String[] args) {
		Quiz2 quizmain=new Quiz2("Quiz");
		quizmain.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		String msg=input.getText();
		File memo=new File("C:/acorn202210/myFolder/memo.txt");
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		if(command.equals("add")) {
		//쓰기 작업
			System.out.println("add 잘 작동중");
			try{fw = new FileWriter(memo, true);
			fw.write(msg+"\r\n");
			fw.flush();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}else if(command.equals("call")) {
		//읽기 작업
			System.out.println("call 잘 작동중");
			String dd=null;
			box.setText("");
			try {
				fr= new FileReader(memo);
			while (true) {
				int output = fr.read();
				if (output==-1) {
					break;
				}
				dd+= (char)output;
			}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			box.append(dd+"\r\n");
		}
	}
	//따로 분리된 문자열 추가 메소드
	public void writetoText() {
		
	}
	
	//따로 분리된 문자열 읽기 메소드
	public void readfromText() {
		
	}
}
