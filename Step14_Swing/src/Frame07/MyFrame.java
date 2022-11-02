package Frame07;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	public MyFrame(String title) {
		super(title);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		add(sendBtn);
		//버튼에 Action Command를 지정
		sendBtn.setActionCommand("send");
		
		JButton deleteBtn=new JButton("삭제");
		add(deleteBtn);
		deleteBtn.setActionCommand("delete");
		
		sendBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
	}
	public static void main(String[] args) {
		JFrame a1=new MyFrame("나의 프레임7");
		a1.setVisible(true);
	}
	
	/*
	 * 전송, 삭제 버튼을 누르면 호출되는 메소드
	 * 다만 메소드 안에서 어떤 버튼을 눌렀는지 분기해야 한다.
	 * 
	 * 메소드에 선언된 매개변수 ActionEvent e에
	 * 눌러진 버튼에 대한 정보가 담겨져 있다.
	 * 해당 객체를 활용해서 분기를 하면 된다.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		
		if(command.equals("send")) {
			JOptionPane.showMessageDialog(this, "전송합니다");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "삭제합니다");
		}
	}
}
