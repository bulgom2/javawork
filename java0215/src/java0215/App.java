package java0215;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App extends Frame {
   public App() {
	  // 제목 설정
      setTitle("AWT App");
      // 창 크기
      setSize(300, 100);
      // 버튼 추가
      add(new Button("Ok"), BorderLayout.SOUTH);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
   }

   public static void main(String[] args) {
      App app = new App();
      app.setVisible(true);
   }

}