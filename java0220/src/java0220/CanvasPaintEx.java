package java0220;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CanvasPaintEx extends JFrame {
	//메인 윈도우 설정
	public CanvasPaintEx() {
		setTitle("paint() 메소드는 언제 호출될까요?");
		
		//사용자 정의 Canvas 객체를 중앙에 배치
		getContentPane().add(new MyCanvas(), BorderLayout.CENTER);
		setSize(300, 200);
	}

	//사용자 정의 Canvas 클래스 선언 
	public class MyCanvas extends Canvas {
		public void paint(Graphics g) {
			g.drawString("윈도우 창을 줄이거나 늘려보세요", 50, 80);
			System.out.println("paint() 메소드 실행");
		}
	}

	public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	CanvasPaintEx jFrame = new CanvasPaintEx();
	        	jFrame.setVisible(true);
	        }
	    });
	}
}



