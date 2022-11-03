package frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;

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
		System.out.println("새로운 스레드를 시작합니다.");
		//스래드 객체를 생성
		Thread t=new AnotherThread();
		/*
		 * start()메소드를 호출하면 새로운 스레드가 시작된다.
		 * 새로운 스레드는 생성한 스레드 객체의 run()을 호출하고 사라진다.
		 * run() 메소드의 리턴 여부와 상관 없이 start()메소드는 바로 리턴된다.
		 * start() 메소드를 호출한 스레드는 main 스레드이기 때문에
		 * main 스레드가 다른 일을 정상적으로 수행 가능하다.
		 */
		
		t.start();
	}
}
