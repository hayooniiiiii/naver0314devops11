package day0329;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1_SwingFileimage extends JFrame {
	static String photo="C:\\naver0314\\workall\\image\\연예인사진\\soojee.jpg";
	JButton btnImageOpen;
	Myphoto myPhoto=new Myphoto();
	
	
	public Ex1_SwingFileimage(String title) {
		super(title);
		this.setLocation(100,100);//시작위치
		this.setSize(300,300);//창크기
		this.getContentPane().setBackground(new Color(93,199,187));//배경색변경
		//this.getContentPane().setBackground(Color.cyan);//배경색 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임
		this.initDesign();//각종 컨포넌트 생성
		this.setVisible(true);
	}
	//캔바스를 상속받는 내부클래스
	class Myphoto extends Canvas{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Image image=new ImageIcon(photo).getImage();
			g.drawImage(image, 0, 0,this.getWidth(), this.getHeight(),this);
		}
	}
	public void initDesign() {
		JPanel p= new JPanel();
		btnImageOpen=new JButton("이미지 불러오기");
		p.add(btnImageOpen);
		this.add("North",p);
		this.add("Center",myPhoto);
		
		btnImageOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog dlg=new FileDialog(Ex1_SwingFileimage.this,"이미지 불러오기",FileDialog.LOAD);
				dlg.setVisible(true);
				if(dlg.getFile()==null)
					return;
				photo=dlg.getDirectory()+dlg.getFile();
				
				myPhoto.repaint();
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_SwingFileimage a=new Ex1_SwingFileimage("사진불러오기");
	}

}
