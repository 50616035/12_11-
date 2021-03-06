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
	private TextField text1 = new TextField("", 10);//10文字分
	private TextField text2 = new TextField("", 10);//10文字分
	private TextField text3 = new TextField("", 10);//10文字分
	private Button button1 = new Button("足し算");
	private Button button2 = new Button("引き算");
	private Button button3 = new Button("かけ算");
	private Button button4 = new Button("わり算");


	public Frame_view() {//コンストラクタ
	addWindowListener(this);
	setTitle("FrameTest");
	setLayout(new FlowLayout(FlowLayout.CENTER));
	add(text1);
	add(text2);
	add(button1);
	add(button2);
	add(button3);
	add(button4);
	add(new Label("="));//=を画面に追加
	add(text3);
	button1.addActionListener(this);//botton1を押すとActionListenerが起動
	button2.addActionListener(this);//botton2を押すとActionListenerが起動
	button3.addActionListener(this);//botton3を押すとActionListenerが起動
	button4.addActionListener(this);//botton4を押すとActionListenerが起動


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
		int val1 = Integer.parseInt(text1.getText());//text1から入力した文字列をもってきてint型に変換
		int val2 = Integer.parseInt(text2.getText());//text2から入力した文字列をもってきてint型に変換
		Calculation_lib clib = new Calculation_lib(val1, val2);//val1とval2をCalculation_libに渡して
		
		if(e.getSource() == button1){
			
			text3.setText(String.valueOf(clib.getPlus()));//getPlus()で計算してもらったものを返しtext3の空欄に計算結果を入れる

			//処理
		}else if(e.getSource() == button2){
			text3.setText(String.valueOf(clib.getMinus()));//getMinus()で計算してもらったものを返しtext3の空欄に計算結果を入れる
			
			//処理
		}
		else if(e.getSource() == button3){
			text3.setText(String.valueOf(clib.getTime()));//getTime()で計算してもらったものを返しtext3の空欄に計算結果を入れる
			
			//処理
		}
		else if(e.getSource() == button4){
			text3.setText(String.valueOf(clib.getDivide()));//getPlus()で計算してもらったものを返しtext3の空欄に計算結果を入れる
			
			//処理
		}
	}

}
