package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class SwingLogin extends JFrame implements ActionListener{
	//�̺�Ʈ�� �����ִ� ������Ʈ ���� 
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	JButton btnLogin = new JButton("�α���");
	JButton btnCancle = new JButton("���");
	JLabel lbResult = new JLabel("��� ���");
	
	
	SwingLogin() {
		
		setLayout(new BorderLayout());
		
		//���� ���̾ƿ�
		ImageIcon img = new ImageIcon("img/robot.PNG");
		JLabel lbLogo = new JLabel(img);
		add(lbLogo, BorderLayout.NORTH);
		
		//�߰� ���̾ƿ�
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));
		
		JLabel lbId = new JLabel("���̵�", JLabel.CENTER);
		JLabel lbPwd = new JLabel("��й�ȣ", JLabel.CENTER);
		
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		btnLogin.setBackground(Color.YELLOW);
		p.add(btnCancle);
		btnCancle.setBackground(Color.PINK);
		add(p, BorderLayout.CENTER);
		
		//���� ���̾ƿ�
		add(lbResult, BorderLayout.SOUTH);
		
		//�̺�Ʈ �ޱ�
		btnLogin.addActionListener(this);
		btnCancle.addActionListener(this);
		
		//������ �⺻ ����
				setTitle("�󺧰� ��ư ����");
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
				lbResult.setText("���̵� �Է��ϼ���");
			}
			else if (strPwd.length() == 0) {
				lbResult.setText("��й�ȣ�� �Է��ϼ���");
			}
			else {
				lbResult.setText(strid+"���� ��й�ȣ�� "+strPwd+"�Դϴ�.");
			}
		}
		else if (e.getSource() == btnCancle) {
			lbResult.setText("����Ͽ����ϴ�.");
			tfId.setText("");
			tfPwd.setText("");
		}
		
	}
	
	

}
