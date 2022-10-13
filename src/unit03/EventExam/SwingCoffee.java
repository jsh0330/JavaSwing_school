package unit03.EventExam;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener{
	
	JRadioButton ame = new JRadioButton("�Ƹ޸�ī��");
	JRadioButton latte = new JRadioButton("��");
	JRadioButton capu = new JRadioButton("īǪġ��");
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
		
		//������ �⺻ ����
		setTitle("Ŀ���ֹ�");
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
				ta.append("�Ƹ޸�ī�밡 ���õǾ����ϴ�."+"\n");
			}
			
			else if (e.getItem() == latte) {
				ta.append("�󶼰� ���õǾ����ϴ�."+"\n");
			}
			
			else if (e.getItem() == capu) {
				ta.append("īǪġ�밡 ���õǾ����ϴ�."+"\n");
			}
		}
		//
		else if (e.getStateChange() == ItemEvent.DESELECTED) {
			if (e.getItem() == ame) {
				ta.append("�Ƹ޸�ī�밡 �����Ǿ����ϴ�."+"\n");
			}
			
			else if (e.getItem() == latte) {
				ta.append("�󶼰� �����Ǿ����ϴ�."+"\n");
			}
			
			else if (e.getItem() == capu) {
				ta.append("īǪġ�밡 �����Ǿ����ϴ�."+"\n");
			}
		}
		
	}
	
	

}
