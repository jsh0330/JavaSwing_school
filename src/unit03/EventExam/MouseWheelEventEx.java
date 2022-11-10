package unit03.EventExam;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;

public class MouseWheelEventEx extends JFrame implements MouseWheelListener{
	
	JLabel lb = new JLabel("Love JAVA");
	int fontSize = 30;
	
	MouseWheelEventEx() {
		
		add(lb);
		lb.setFont(new Font("±¼¸²Ã¼", Font.BOLD, fontSize));
		
		lb.addMouseWheelListener(this);
		
		setTitle("");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseWheelEventEx();

	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		
		if (e.getWheelRotation() < 0) {
			fontSize += 5;
			lb.setFont(new Font("±¼¸²Ã¼", Font.BOLD, fontSize));
		}
		else {
			fontSize -= 5;
			lb.setFont(new Font("±¼¸²Ã¼", Font.BOLD, fontSize));
		}
		
	}

}
