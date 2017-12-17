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
	private TextField text1 = new TextField("", 10);//10•¶š•ª
	private TextField text2 = new TextField("", 10);//10•¶š•ª
	private TextField text3 = new TextField("", 10);//10•¶š•ª
	private Button button1 = new Button("‘«‚µZ");
	private Button button2 = new Button("ˆø‚«Z");
	private Button button3 = new Button("‚©‚¯Z");
	private Button button4 = new Button("‚í‚èZ");


	public Frame_view() {//ƒRƒ“ƒXƒgƒ‰ƒNƒ^
	addWindowListener(this);
	setTitle("FrameTest");
	setLayout(new FlowLayout(FlowLayout.CENTER));
	add(text1);
	add(text2);
	add(button1);
	add(button2);
	add(button3);
	add(button4);
	add(new Label("="));//=‚ğ‰æ–Ê‚É’Ç‰Á
	add(text3);
	button1.addActionListener(this);//botton1‚ğ‰Ÿ‚·‚ÆActionListener‚ª‹N“®
	button2.addActionListener(this);//botton2‚ğ‰Ÿ‚·‚ÆActionListener‚ª‹N“®
	button3.addActionListener(this);//botton3‚ğ‰Ÿ‚·‚ÆActionListener‚ª‹N“®
	button4.addActionListener(this);//botton4‚ğ‰Ÿ‚·‚ÆActionListener‚ª‹N“®


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
		int val1 = Integer.parseInt(text1.getText());//text1‚©‚ç“ü—Í‚µ‚½•¶š—ñ‚ğ‚à‚Á‚Ä‚«‚ÄintŒ^‚É•ÏŠ·
		int val2 = Integer.parseInt(text2.getText());//text2‚©‚ç“ü—Í‚µ‚½•¶š—ñ‚ğ‚à‚Á‚Ä‚«‚ÄintŒ^‚É•ÏŠ·
		Calculation_lib clib = new Calculation_lib(val1, val2);//val1‚Æval2‚ğCalculation_lib‚É“n‚µ‚Ä
		
		if(e.getSource() == button1){
			
			text3.setText(String.valueOf(clib.getPlus()));//getPlus()‚ÅŒvZ‚µ‚Ä‚à‚ç‚Á‚½‚à‚Ì‚ğ•Ô‚µtext3‚Ì‹ó—“‚ÉŒvZŒ‹‰Ê‚ğ“ü‚ê‚é

			//ˆ—
		}else if(e.getSource() == button2){
			text3.setText(String.valueOf(clib.getMinus()));//getMinus()‚ÅŒvZ‚µ‚Ä‚à‚ç‚Á‚½‚à‚Ì‚ğ•Ô‚µtext3‚Ì‹ó—“‚ÉŒvZŒ‹‰Ê‚ğ“ü‚ê‚é
			
			//ˆ—
		}
		else if(e.getSource() == button3){
			text3.setText(String.valueOf(clib.getTime()));//getTime()‚ÅŒvZ‚µ‚Ä‚à‚ç‚Á‚½‚à‚Ì‚ğ•Ô‚µtext3‚Ì‹ó—“‚ÉŒvZŒ‹‰Ê‚ğ“ü‚ê‚é
			
			//ˆ—
		}
		else if(e.getSource() == button4){
			text3.setText(String.valueOf(clib.getDivide()));//getPlus()‚ÅŒvZ‚µ‚Ä‚à‚ç‚Á‚½‚à‚Ì‚ğ•Ô‚µtext3‚Ì‹ó—“‚ÉŒvZŒ‹‰Ê‚ğ“ü‚ê‚é
			
			//ˆ—
		}
	}

}
