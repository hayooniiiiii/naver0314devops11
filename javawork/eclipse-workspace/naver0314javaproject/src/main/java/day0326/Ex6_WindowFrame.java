package day0326;
//인터페이스와 클래스 상속 활용방안을 보기위한 예제
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame() {
		super("701화이팅");
		this.setLocation(300,100);
		this.setSize(300,300);
		this.setVisible(true);
		
		//프레임에 이벤트 추가
		this.addWindowListener(new WindowExit());
	}
	class WindowExit implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("윈도우를 종료합니다.");
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
public class Ex6_WindowFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
