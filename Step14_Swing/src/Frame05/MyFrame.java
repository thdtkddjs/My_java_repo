package Frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		
		MyFrame a=this;
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		add(sendBtn);
		//ActionListener 인터페이스 type의 참조값을 얻어내서
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("전송했습니다!");
				
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다!");
			}
		};
		
		//전송 버튼에 등록하기
		sendBtn.addActionListener(listener);
		JButton deleteBtn=new JButton("삭제");
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("삭제됬습니다!");
				JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다!");
			}
		});
	}
	public static void main(String[] args) {
		JFrame a1=new MyFrame("나의 프레임5");
		a1.setVisible(true);
		
	}
}
