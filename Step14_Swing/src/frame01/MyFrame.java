package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		//프레임의 초기 설정 작업하기
		this.setBounds(100, 100, 500, 500);
		//이 프레임의 X버튼을 눌렀을때 프로세스를 종료시킴
		//없을 경우 X를 눌러서 끄더라도 프로세스가 살아있게됨
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저를 사용하지 않겠다.
		this.setLayout(null);
		
		//버튼을 만들어서
		JButton btn1=new JButton("버튼1");
		//위치 설정하고
		btn1.setLocation(10,10);
		//크기 설정하고		
		btn1.setSize(100,30);
		//프레임에 추가
		this.add(btn1);
		//프레임을 화면에서 보이도록 설정
		this.setVisible(true);
	}
	//run 했을 때 실행의 흐름이 시작되는 특별한 메소드
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}
