package day0328;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex6_SwingCavnasRadio extends JFrame {
	
	final static String PHOTO1="C:\\naver0314\\workall\\image\\연예인사진\\soojee.jpg";
	final static String PHOTO2="C:\\naver0314\\workall\\image\\연예인사진\\hanyesel.jpg";
	final static String PHOTO3="C:\\naver0314\\workall\\image\\연예인사진\\youahin.jpg";
	final static String PHOTO4="C:\\naver0314\\workall\\image\\연예인사진\\shinminah.jpg";
	
	
	
	Color boxColor=new Color(67,196,207);
	JRadioButton rbBox1,rbBox2,rbBox3,rbBox4;
	JRadioButton rbPhoto1,rbPhoto2,rbPhoto3,rbPhoto4;
	int photoIndex=1;
	MyDraw draw=new MyDraw();
	
	
	public Ex6_SwingCavnasRadio(String title) {
		super(title);
		this.setLocation(100,100);//시작위치
		this.setSize(300,300);//창크기
		//this.getContentPane().setBackground(new Color(50,36,68));//배경색변경
		//this.getContentPane().setBackground(Color.cyan);//배경색 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임
		this.initDesign();//각종 컨포넌트 생성
		this.setVisible(true);
	}
	
	class MyDraw extends Canvas{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			//채워진 박스 그리기
			g.setColor(boxColor);
			g.fillRect(40, 70, 320, 320);
		
			Image image=null;
			
			
			switch(photoIndex) {
			case 1:
				image=new ImageIcon(PHOTO1).getImage();
				break;
				
			case 2:
				image=new ImageIcon(PHOTO2).getImage();
				break;
				
			case 3:
				image=new ImageIcon(PHOTO3).getImage();
				break;
				
			case 4:
				image=new ImageIcon(PHOTO4).getImage();
				break;
			}
			g.drawImage(image, 80, 100, 220, 260, this);
			
			
		}
	}
	
	public void initDesign() {
	    this.add("Center", draw);
	    
	    JPanel pTop = new JPanel();
	    ButtonGroup bg1 = new ButtonGroup();
	    rbBox1 = new JRadioButton("초록색");
	    bg1.add(rbBox1);
	    pTop.add(rbBox1);

	    // new Color(67,196,207)
	    rbBox2 = new JRadioButton("하늘색", true);
	    bg1.add(rbBox2);
	    pTop.add(rbBox2);

	    // new Color(67,196,207)
	    rbBox3 = new JRadioButton("분홍색");
	    bg1.add(rbBox3);
	    pTop.add(rbBox3);
	    // new Color(67,196,207)
	    rbBox4 = new JRadioButton("오렌지색", true);
	    bg1.add(rbBox4);
	    pTop.add(rbBox4);

	    this.add("North", pTop);
	}

	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6_SwingCavnasRadio a=new Ex6_SwingCavnasRadio("캔바스2");
	}

}
