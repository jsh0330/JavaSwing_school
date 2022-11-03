package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GamblingGame extends JFrame implements KeyListener{
	
	JLabel lb1 = new JLabel("0", JLabel.CENTER);
	JLabel lb2 = new JLabel("0", JLabel.CENTER);
	JLabel lb3 = new JLabel("0", JLabel.CENTER);
	JLabel out = new JLabel("시작합니다.", JLabel.CENTER);
	GamblingGame() {
		
		setLayout(new BorderLayout());
		
		JPanel p = new JPanel();
		add(p, BorderLayout.CENTER);
		
		p.setLayout(null);
		
		lb1.setBounds(30, 50, 60, 30);
		lb1.setOpaque(true);
		lb1.setBackground(Color.pink);
		lb2.setBounds(110, 50, 60, 30);
		lb2.setOpaque(true);
		lb2.setBackground(Color.pink);
		lb3.setBounds(180, 50, 60, 30);
		lb3.setOpaque(true);
		lb3.setBackground(Color.pink);
		
		p.add(lb1);
		p.add(lb2);
		p.add(lb3);
		
		add(out, BorderLayout.SOUTH);
		
		p.addKeyListener(this);
		
		setTitle("겜블링게임");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}

	public static void main(String[] args) {
		new GamblingGame();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int a = (int)(Math.random()*4);
		int b = (int)(Math.random()*4);
		int c = (int)(Math.random()*4);
		if (e.getKeyChar() == '\n') {
			lb1.setText(a+"");
			lb2.setText(b+"");
			lb3.setText(c+"");
			
			if (a==b && b==c) {
				out.setText("축하합니다!");
			}
			else {
				out.setText("아쉽군요!");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
