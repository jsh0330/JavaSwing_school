package unit03.EventExam;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

public class ClickRandomLocation extends JFrame implements MouseListener{
	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("나잡아봐라");
	
	ClickRandomLocation() {
		
		add(p);
		p.add(lb);
		p.setLayout(null);
		
		lb.setBounds(50, 50, 100, 40);
		
		lb.addMouseListener(this);
		
		setTitle("클릭 연습");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ClickRandomLocation();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int x = (int)(Math.random() * (p.getWidth() - lb.getWidth()));
		int y = (int)(Math.random() * (p.getHeight() - lb.getHeight()));
		
		
		lb.setLocation(x, y);
		setTitle(" ( " + e.getX()+ " , " + e.getY() + " ) ");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
