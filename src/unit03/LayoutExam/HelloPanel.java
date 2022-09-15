package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.*;

public class HelloPanel extends JFrame {
	
	HelloPanel(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.ORANGE);
		add(p);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBackground(Color.YELLOW);
		p.add(btn1);
		
		JButton btn2 = new JButton("버튼2 ");
		btn2.setBackground(Color.PINK);
		p.add(btn2);
		
		
		setTitle("안녕 패널");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new HelloPanel();

	}

}
