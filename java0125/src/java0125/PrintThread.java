package java0125;

public class PrintThread extends Thread {
//	private boolean stop;
//	
//	// 외부에서 stop 필드값을 변경할 수 있도록 Setter 선언
//	public void setStop(boolean stop) {
//		this.stop = stop;
//	}
//	
//	@Override
//	public void run() {
//		// stop 필드값에 따라 반복 여부 결정
//		while(!stop) {
//			System.out.println("실행 중");
//		}
//		// 리소스 정리
//		System.out.println("리소스 정리");
//		System.out.println("실행 종료");
//	}
	
//	public void run() {
//		try {
//			while(true) {
//				System.out.println("실행 중");
//				// 일시 정지를 만듦(InterruptedException이 발생할 수 있도록)
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {
//		}
//		System.out.println("리소스 정리");
//		System.out.println("실행 종료");
//	}
	
	public void run() {
		while(true) {
			System.out.println("실행 중");
			// interrupt() 메소드가 호출되었다면 while 문을 빠져나감
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}

