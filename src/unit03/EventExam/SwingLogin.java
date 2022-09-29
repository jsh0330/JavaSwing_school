package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class SwingLogin extends JFrame implements ActionListener{
	//이벤트와 관련있는 컴포넌트 선언 
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	JButton btnLogin = new JButton("로그인");
	JButton btnCancle = new JButton("취소");
	JLabel lbResult = new JLabel("결과 출력");
	
	
	SwingLogin() {
		
		setLayout(new BorderLayout());
		
		//북쪽 레이아웃
		ImageIcon img = new ImageIcon("img/robot.PNG");
		JLabel lbLogo = new JLabel(img);
		add(lbLogo, BorderLayout.NORTH);
		
		//중간 레이아웃
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));
		
		JLabel lbId = new JLabel("아이디", JLabel.CENTER);
		JLabel lbPwd = new JLabel("비밀번호", JLabel.CENTER);
		
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		btnLogin.setBackground(Color.YELLOW);
		p.add(btnCancle);
		btnCancle.setBackground(Color.PINK);
		add(p, BorderLayout.CENTER);
		
		//남쪽 레이아웃
		add(lbResult, BorderLayout.SOUTH);
		
		//이벤트 달기
		btnLogin.addActionListener(this);
		btnCancle.addActionListener(this);
		
		//프레임 기본 세팅
				setTitle("라벨과 버튼 예제");
				setSize(300,250);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setLocationRelativeTo(null);
				setVisible(true);
				
	}

	public static void main(String[] args) {
		new SwingLogin();
		//
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLogin) {
			String strid = tfId.getText();
			String strPwd = new String(tfPwd.getPassword());
			
			if (strid.length() == 0) {
				lbResult.setText("아이디를 입력하세요");
			}
			else if (strPwd.length() == 0) {
				lbResult.setText("비밀번호를 입력하세요");
			}
			else {
				lbResult.setText(strid+"님의 비밀번호는 "+strPwd+"입니다.");
			}
		}
		else if (e.getSource() == btnCancle) {
			lbResult.setText("취소하였습니다.");
			tfId.setText("");
			tfPwd.setText("");
		}
		
	}
	
	

}
