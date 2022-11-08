package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame 
implements ActionListener, PropertyChangeListener{
	//생성자
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;
	public MemberFrame() {
	      setLayout(new BorderLayout());
	      
	      JLabel label1=new JLabel("이름");
	      inputName=new JTextField(10);
	      
	      JLabel label2=new JLabel("주소");
	      inputAddr=new JTextField(10);
	      
	      JButton saveBtn=new JButton("저장");
	      saveBtn.setActionCommand("save");
	      
	      JButton delBtn=new JButton("삭제");
	      delBtn.setActionCommand("del");
	         
	      JPanel panel=new JPanel();
	      panel.add(label1);
	      panel.add(inputName);
	      panel.add(label2);
	      panel.add(inputAddr);
	      panel.add(saveBtn);    
	      panel.add(delBtn);
	      add(panel, BorderLayout.NORTH);
	      
	    //표 형식을 출력해주는 JTable
	      table=new JTable();
	      //칼럼명을 순서대로 준비
	      String[] colNames= {"번호","이름","주소"};
	      //테이블에 연결할 모델객체
	      model=new DefaultTableModel(colNames, 0) {
	    	  @Override
	    	  public boolean isCellEditable(int row, int column) {
	    		  if(column==0) {//0번(num)일때 수정불가
	    			  return false;
	    		  }
	    		  else {//그 외에는 수정 가능
	    			  return true;
	    		  }
	    	  }
	      };
	      //모델을 테이블에 연결한다.
	      table.setModel(model);
	      
	      JScrollPane scroll=new JScrollPane(table);
	      add(scroll, BorderLayout.CENTER);
	      
	      saveBtn.addActionListener(this);
	      delBtn.addActionListener(this);
	      
	      displaymember();
	      table.addPropertyChangeListener(this);
	}
	
	public void displaymember() {
		//Object[] row1= {1, "김구라", "노량진"};
		//Object[] row2= {2, "해골", "행신동"};
		//Object[] row3= {3, "원숭이", "동물원"};
		
		//model.addRow(row1);
		//model.addRow(row2);
		//model.addRow(row3);
		model.setRowCount(0);
		
		List<MemberDto> tmp=new ArrayList<>();
		MemberDao load=new MemberDao();
		
		tmp=load.getList();
		
		for(MemberDto a:tmp) {
			Object[] row= {a.getNum(), a.getName(), a.getAddr()};
			model.addRow(row);
		}
	}
	
	
	//메인 메소드 에서 프레임의 크기 등의 기타 사항 조정
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		MemberDto tmp=new MemberDto();
		MemberDao func=new MemberDao();
		
		if(command.equals("save")) {
			tmp.setName(inputName.getText());
			tmp.setAddr(inputAddr.getText());
			
			boolean k=func.insert(tmp);
			if(k) System.out.println("저장이 성공적입니다.");
			else System.out.println("저장이 실패했습니다.");
		} else if(command.equals("del")) {
			//1.focus가 올라가 있는 row의 num값을 알아온다.
			int a = table.getSelectedRow();
			if(a==-1) {
				JOptionPane.showMessageDialog(this, "삭제할 row가 선택되지 않았습니다.");
				return;
			}
			//2. 해당 row를 DB에서 삭제한다..
			int b = (int)model.getValueAt(a, 0);
			func.delete(b);
			//3. 그 후 테이블을 새로고침한다.
			displaymember();
		}
		
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		String command=evt.getPropertyName();
		MemberDto tmp=new MemberDto();
		MemberDao func=new MemberDao();;
		if (table.isEditing()) {
			int a = table.getSelectedRow();
			tmp.setNum((int)model.getValueAt(a, 0));
			tmp.setName((String)model.getValueAt(a, 1));
			tmp.setAddr((String)model.getValueAt(a, 2));
			func.update(tmp);
			System.out.println("변경이 DB에 반영되었습니다.");
		}
	}
	
	
}
