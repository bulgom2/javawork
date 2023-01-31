package java0125;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
//		// 작업 스레드 생성
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run () {
//				// Toolkit 객체 얻기
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					// 비프음 발생
//					toolkit.beep();
//					try {
//						// 0.5초간 일시정지
//						Thread.sleep(500);
//					} catch(Exception e) {}
//				}
//			}
//		});
		
		// Thread의 익명 자식 객체로 작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run () {
				// Toolkit 객체 얻기
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					// 비프음 발생
					toolkit.beep();
					try {
						// 0.5초간 일시정지
						Thread.sleep(500);
					} catch(Exception e) {}
				}
			}
		};
		
		// 작업 스레드 실행
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}
