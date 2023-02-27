package java0215;

import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JFrameEx extends JFrame {

   public JFrameEx() {
      // 윈도우 크기 지정
      this.setSize(600, 500);
      // 제목 표시줄 아이콘, 제목 설정
      this.setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
      this.setTitle("메인창");
      // 종료 버튼 기본 기능
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // 화면 중앙에 띄우기
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      Point centerPoint = ge.getCenterPoint();
      int leftTopX = centerPoint.x - this.getWidth()/2;
      int leftTopY = centerPoint.y - this.getHeight()/2;
      this.setLocation(leftTopX, leftTopY);
      
   }
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
        	 JFrameEx jframe = new JFrameEx();
            jframe.setVisible(true);
         }
      });

   }

}