package unit03.LayoutExam;

import javax.swing.*;

public class HelloAbsoluteLayout extends JFrame{
	
	HelloAbsoluteLayout(){
		
		setLayout(null);
		
		JButton btn1 = new JButton("��ư1");
		btn1.setSize(70,40);
		btn1.setLocation(10,30);
		
		JButton btn2 = new JButton("��ư2");
		//btn2.setSize(70,40);
		//btn2.setLocation(10,30);
		btn2.setBounds(150, 30, 90, 20);
		
		add(btn1);
		add(btn2);
		
		setTitle("��ġ�����ڰ� ���� ���밪 ���̾ƿ�");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HelloAbsoluteLayout();

	}

}
