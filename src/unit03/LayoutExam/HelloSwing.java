package unit03.LayoutExam;

import javax.swing.*;

//2. JFrame ��ӹޱ�
public class HelloSwing extends JFrame {
	
	//�����ڿ��� ȭ�� �����
	HelloSwing(){
		
		//�ʱ⼼�� ���ֱ�
		setTitle("�ȳ� ����!");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		//1.new ������()�� ������ ���α׷� �����Ű��
		new HelloSwing();

	}

}
