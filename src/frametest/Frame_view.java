package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class Frame_view extends Frame implements ActionListener,WindowListener{
	private TextField text1 = new TextField("", 10);//10������
	private TextField text2 = new TextField("", 10);//10������
	private TextField text3 = new TextField("", 10);//10������
	private Button button1 = new Button("�����Z");
	private Button button2 = new Button("�����Z");
	private Button button3 = new Button("�����Z");
	private Button button4 = new Button("���Z");


	public Frame_view() {//�R���X�g���N�^
	addWindowListener(this);
	setTitle("FrameTest");
	setLayout(new FlowLayout(FlowLayout.CENTER));
	add(text1);
	add(text2);
	add(button1);
	add(button2);
	add(button3);
	add(button4);
	add(new Label("="));//=����ʂɒǉ�
	add(text3);
	button1.addActionListener(this);//botton1��������ActionListener���N��
	button2.addActionListener(this);//botton2��������ActionListener���N��
	button3.addActionListener(this);//botton3��������ActionListener���N��
	button4.addActionListener(this);//botton4��������ActionListener���N��


	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(text1.getText());//text1������͂���������������Ă���int�^�ɕϊ�
		int val2 = Integer.parseInt(text2.getText());//text2������͂���������������Ă���int�^�ɕϊ�
		Calculation_lib clib = new Calculation_lib(val1, val2);//val1��val2��Calculation_lib�ɓn����
		
		if(e.getSource() == button1){
			
			text3.setText(String.valueOf(clib.getPlus()));//getPlus()�Ōv�Z���Ă���������̂�Ԃ�text3�̋󗓂Ɍv�Z���ʂ�����

			//����
		}else if(e.getSource() == button2){
			text3.setText(String.valueOf(clib.getMinus()));//getMinus()�Ōv�Z���Ă���������̂�Ԃ�text3�̋󗓂Ɍv�Z���ʂ�����
			
			//����
		}
		else if(e.getSource() == button3){
			text3.setText(String.valueOf(clib.getTime()));//getTime()�Ōv�Z���Ă���������̂�Ԃ�text3�̋󗓂Ɍv�Z���ʂ�����
			
			//����
		}
		else if(e.getSource() == button4){
			text3.setText(String.valueOf(clib.getDivide()));//getPlus()�Ōv�Z���Ă���������̂�Ԃ�text3�̋󗓂Ɍv�Z���ʂ�����
			
			//����
		}
	}

}
