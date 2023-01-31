package java0125;

public class ThreadA extends Thread {
	private WorkObj workObject;
	
	// 공유 작업 객체를 받음
	public ThreadA(WorkObj workObject) {
		// 스레드 이름 변경
		setName("ThreadA");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			// 동기화 메소드 호출
			workObject.methodA();
		}
	}
}
