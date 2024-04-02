package day0329;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;

import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;
import javax.swing.TransferHandler;

public class Ex2_SwingDraw extends JFrame implements MouseListener, MouseMotionListener{
	Color color=Color.green;
	int prey,prex;
	int x;
	int y;


	@Override
	public void mouseDragged(MouseEvent e) {
		prex=x;
		prey=y;
		
		x=e.getX();
		y=e.getY();
		repaint();
	}
	
	

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseCliceked");
	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed");
		x=e.getX();
		y=e.getY();
		int red=(int)(Math.random()*256);
		int green=(int)(Math.random()*256);
		int blue=(int)(Math.random()*256);
		
		color=new Color(red,green,blue);
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	public Ex2_SwingDraw(String title) {
		super(title);
		this.setLocation(100,100);//시작위치
		this.setSize(300,300);//창크기
		this.getContentPane().setBackground(new Color(50,36,68));//배경색변경
		//this.getContentPane().setBackground(Color.cyan);//배경색 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임
		//마우스 이벤트 추가
		this.addMouseMotionListener(this);
		
		this.initDesign();//각종 컨포넌트 생성
		this.setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		//선 색상
		g.setColor(color);
		//선 굵기 지정
		Graphics2D g2=(Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		
		//선 그리기
		//g.drawLine(10,100,400, 100);
		//곡선은 마우스를 드래그시 직전 좌표부터 현재 좌표까지 선을 그리면 곡선이 된다.
		g.drawLine(prex,prey, x, y);
		
	}
	
	public void initDesign() {}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2_SwingDraw a=new Ex2_SwingDraw("기본창");
	}

}
