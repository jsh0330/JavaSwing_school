package unit03.EventExam;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{
	
	JLabel lb = new JLabel("카운터값");
	JTextField tf = new JTextField("0", 5);
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	
	SwingCounter() {
		
		JPanel p = new JPanel();
		add(p);
		p.add(lb);
		p.add(tf);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		
		//기본세팅
		setTitle("간단카운터");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new SwingCounter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnInc) {
			String inttf = tf.getText().trim();
			int cntInc = Integer.parseInt(inttf);
			cntInc += 1;
			tf.setText(cntInc+"");
		}
		
		else if (e.getSource() == btnDec) {
			String inttf = tf.getText().trim();
			int cntDec = Integer.parseInt(inttf);
			cntDec -= 1;
			tf.setText(cntDec+"");
		}
		
		else if (e.getSource() == btnCls) {
			tf.setText("0");
		}
		
	}
	
	

}
