package frame01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	public MyFrame(String title) {
		super(title);
		//프레임의 초기 설정 작업하기
		this.setBounds(100, 100, 500, 500);
		//이 프레임의 X버튼을 눌렀을때 프로세스를 종료시킴
		//없을 경우 X를 눌러서 끄더라도 프로세스가 살아있게됨
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저를 사용하지 않겠다.
		this.setLayout(new FlowLayout());
		
		//버튼을 만들어서
		JButton startBtn=new JButton("작업 시작");
		
		add(startBtn);
		startBtn.addActionListener(this);
		
		JTextField tf=new JTextField(10);
		add(tf);
		
		//프레임을 화면에서 보이도록 설정
		this.setVisible(true);
	}
	//run 했을 때 실행의 흐름이 시작되는 특별한 메소드
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("작업을 시작합니다.");
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("작업이 끝났습니다");
	}
}
