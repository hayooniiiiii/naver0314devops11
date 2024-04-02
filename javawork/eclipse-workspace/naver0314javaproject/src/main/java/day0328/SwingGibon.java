package day0328;

import java.awt.Color;

import javax.swing.JFrame;

public class SwingGibon extends JFrame {
	public SwingGibon(String title) {
		super(title);
		this.setLocation(100,100);//시작위치
		this.setSize(300,300);//창크기
		this.getContentPane().setBackground(new Color(50,36,68));//배경색변경
		//this.getContentPane().setBackground(Color.cyan);//배경색 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임
		this.initDesign();//각종 컨포넌트 생성
		this.setVisible(true);
	}
	public void initDesign() {}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingGibon a=new SwingGibon("기본창");
	}

}
