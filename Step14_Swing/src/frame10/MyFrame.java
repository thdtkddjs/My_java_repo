package frame10;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//흐르듯이 배치하는 레이아웃
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		JTextField inputMsg=new JTextField(10);
		
		//글자를 출력하는 UI
		JLabel label=new JLabel("레이블...");
		
		add(inputMsg);
		add(label);
		
		//키보드 입력을 트리거로 호출되는 메소드를 가지고 있다.
		KeyListener listener=new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
				int code=e.getKeyCode();
				//눌러진 키의 코드값 읽어오기
				System.out.println(code);
				if(code==10) {//code==KeyEvent.VK_ENTER
					String msg=inputMsg.getText();
					label.setText(msg);
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		};
		
		inputMsg.addKeyListener(listener);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임10");
	}
}
