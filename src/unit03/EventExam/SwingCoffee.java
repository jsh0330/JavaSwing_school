package unit03.EventExam;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener{
	
	JRadioButton ame = new JRadioButton("아메리카노");
	JRadioButton latte = new JRadioButton("라떼");
	JRadioButton capu = new JRadioButton("카푸치노");
	ButtonGroup bg = new ButtonGroup();
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	
	SwingCoffee() {
		
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		
		bg.add(ame);
		bg.add(latte);
		bg.add(capu);
		
		p1.add(ame);
		p1.add(latte);
		p1.add(capu);
		add(p1, BorderLayout.NORTH);
		
		add(sp,BorderLayout.CENTER);
		
		ame.addItemListener(this);
		latte.addItemListener(this);
		capu.addItemListener(this);
		
		//프레임 기본 세팅
		setTitle("커피주문");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingCoffee();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getItem() == ame) {
				ta.append("아메리카노가 선택되었습니다."+"\n");
			}
			
			else if (e.getItem() == latte) {
				ta.append("라떼가 선택되었습니다."+"\n");
			}
			
			else if (e.getItem() == capu) {
				ta.append("카푸치노가 선택되었습니다."+"\n");
			}
		}
		//
		else if (e.getStateChange() == ItemEvent.DESELECTED) {
			if (e.getItem() == ame) {
				ta.append("아메리카노가 해제되었습니다."+"\n");
			}
			
			else if (e.getItem() == latte) {
				ta.append("라떼가 해제되었습니다."+"\n");
			}
			
			else if (e.getItem() == capu) {
				ta.append("카푸치노가 해제되었습니다."+"\n");
			}
		}
		
	}
	
	

}
