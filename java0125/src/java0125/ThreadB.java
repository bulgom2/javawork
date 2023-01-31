package java0125;

public class ThreadB extends Thread {
	private WorkObj workObject;
	
	// 공유 작업 객체 생성
	public ThreadB(WorkObj workObject) {
		// 스레드 이름 변경
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			// 동기화 메소드 호출
			workObject.methodB();
		}
	}
}
