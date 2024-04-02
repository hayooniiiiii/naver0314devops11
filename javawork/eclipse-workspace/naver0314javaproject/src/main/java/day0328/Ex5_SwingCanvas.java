package day0328;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ex5_SwingCanvas extends JFrame {
	//캔버스 변수 선언
	MyDraw draw=new MyDraw();
	String foodImage="C:\\naver0314\\workall\\image\\음식사진\\11.jpg";
	String foodImage2="\\C:\\naver0314\\workall\\image\\음식사진\\1.jpg";
	public Ex5_SwingCanvas(String title) {
		super(title);
		this.setLocation(100,100);//시작위치
		this.setSize(500,500);//창크기
		//this.getContentPane().setBackground(new Color(50,36,68));//배경색변경
		//this.getContentPane().setBackground(Color.cyan);//배경색 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임종료
		this.initDesign();//각종 컨포넌트 생성
		this.setVisible(true);
	}
	//캔버스를 상속받는 내부클래스
	class MyDraw extends Canvas{
		
		//처음 시작시, 그리고 프레임 크기 변경시에는 자동 호출
		//그 이외에는 강제호출(repaint)
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			g.setColor(Color.magenta);
			g.drawOval(30, 30, 100, 100);
			//채워진 타원
			g.fillOval(150, 30, 100, 100);
			g.setColor(Color.orange);
			g.fillOval(150,30,100,100);
			
			g.setColor(new Color(8,207,7));
			g.drawRect(30, 150,100,100);
			
			g.setColor(new Color(239,136,190));
			g.fillRect(150, 150, 100, 100);
			
			g.setFont(new Font("Comic sans Ms",Font.BOLD,30));
			g.drawString("Good Day!", 50,350);
			g.setFont(new Font("궁서체",Font.BOLD,30));
			g.drawString("뇽안하세요", 250, 350);
			//음식 이미지 그리기
			Image image1=new ImageIcon(foodImage).getImage();
			g.drawImage(image1,300, 10, 130, 130, this);
			
			Image image2=Toolkit.getDefaultToolkit().getImage(foodImage2);
			g.drawImage(image2,300,150,130,130,this);
			
			
			
			
		}
		
	}
	
	public void initDesign() {
		
		this.add("Center",draw);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5_SwingCanvas a=new Ex5_SwingCanvas("캔바스");
	}

}
