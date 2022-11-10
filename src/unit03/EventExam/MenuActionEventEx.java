package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.*;

public class MenuActionEventEx extends JFrame implements ActionListener{
	
	JMenuBar mb = new JMenuBar();
	JMenu m_Screen = new JMenu("Screen");
	
	JMenuItem [] screenItem = new JMenuItem[4];
	String [] screenNames = {"�ҷ�����", "�����", "�ٽú����ֱ�", "������"};
	
	JLabel imgLabel = new JLabel();
	
	MenuActionEventEx() {
		
		add(imgLabel, BorderLayout.CENTER);
		
		setJMenuBar(mb); //�޴��ٸ� ���̰�
		mb.add(m_Screen); // �޴��� �޴��ٿ� ���̰�
		
		for (int i = 0; i < screenItem.length; i++) {
			screenItem[i] = new JMenuItem(screenNames[i]);
			m_Screen.add(screenItem[i]);
			screenItem[i].addActionListener(this);
		}
		
		setTitle("�޴� ����� ����");
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MenuActionEventEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "�ҷ�����":
			imgLabel.setIcon(new ImageIcon("img/img.jpg"));
			break;
		case "�����":
			imgLabel.setVisible(false);
			break;
		case "�ٽú����ֱ�":
			imgLabel.setVisible(true);
			break;
		case "������":
			System.exit(0);
			break;
		}
		
	}

}
