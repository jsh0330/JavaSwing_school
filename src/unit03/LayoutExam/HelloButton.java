package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{
	
	HelloButton() {
		
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		add(p);
		
		JButton btn = new JButton("버튼1");
		p.add(btn);
		
		//프레임 기본 세팅
		setTitle("안녕 버튼");
		setSize(300,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new HelloButton();

	}

}
