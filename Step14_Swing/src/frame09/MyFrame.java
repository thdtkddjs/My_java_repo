package frame09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * JTextField의 메소드를 잘 활용해서
 * 메시지를 입력하고 send 버튼을 누르면
 * 입력한 메시지가 알림창에 출력되도록 프로그래밍
 */

public class MyFrame extends JFrame implements ActionListener{
	
	JTextField inputMsg;
	
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//흐르듯이 배치하는 레이아웃
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		//문자열을 한줄 입력할 수 있는 JTextField
		inputMsg=new JTextField(10);
		JButton sendBtn=new JButton("전송");
		sendBtn.setActionCommand("send");
		
		add(inputMsg);
		add(sendBtn);
		//빼먹으면 안된다!
		sendBtn.addActionListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임9");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=inputMsg.getText();
		JOptionPane.showMessageDialog(MyFrame.this, inputMsg.getText());
	}
}
