package java0220;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ColorFontEx extends JFrame {
	//메인 윈도우 설정
	public ColorFontEx() {
		setTitle("색상과 폰트");
		getContentPane().add(new MyCanvas(), BorderLayout.CENTER);
		setSize(300, 200);
	}

	//Canvas 클래스 선언
	public class MyCanvas extends Canvas {	
		public void paint(Graphics g) {
			//Color 변경
			g.setColor(Color.RED);
			//Font 변경
			g.setFont(new Font("궁서체", Font.BOLD | Font.ITALIC, 30));
			//글자 드로잉
			g.drawString("지금 진지하다.", 20, 100);		
		}
	}
	
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	ColorFontEx jFrame = new ColorFontEx();
	        	jFrame.setVisible(true);
	        }
	    });
	}
}


