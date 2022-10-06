package unit03.EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{
	
	JLabel lb = new JLabel("사과 100원, 배 500원, 체리 2000원");
	JCheckBox fruit1 = new JCheckBox("사과");
	JCheckBox fruit2 = new JCheckBox("배");
	JCheckBox fruit3 = new JCheckBox("체리");
	JLabel lb_result = new JLabel("현재 0원입니다.");
	
	int sum = 0;
	
	CheckBoxItemEventEx() {
		
		JPanel p = new JPanel();
		add(p);
		p.add(lb);
		p.add(fruit1);
		p.add(fruit2);
		p.add(fruit3);
		p.add(lb_result);
		
		fruit1.addItemListener(this);
		fruit2.addItemListener(this);
		fruit3.addItemListener(this);
		
		setTitle("체크박스이벤트예제");
		setSize(250,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getItem() == fruit1) {
				sum+=100;
			}
			else if (e.getItem() == fruit2) {
				sum+=500;
			}
			else if (e.getItem() == fruit3) {
				sum+=2000;
			}
		}
		
		else if (e.getStateChange() == ItemEvent.DESELECTED) {
			if (e.getItem() == fruit1) {
				sum-=100;
			}
			else if (e.getItem() == fruit2) {
				sum-=500;
			}
			else if (e.getItem() == fruit3) {
				sum-=2000;
			}
		}
		
		lb_result.setText("현재 "+sum+"원입니다.");
	}
	
	

}
