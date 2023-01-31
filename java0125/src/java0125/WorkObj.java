package java0125;

public class WorkObj {
	// 동기화 메소드
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		// 다른 스레드를 실행 대기 상태로 만듦
		notify();
		try {
			// 자신의 스레드는 일시 정지 상태로 만듦
			wait();
		} catch (InterruptedException e) {			
		}
	}
	// 동기화 메소드
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		// 다른 스레드를 실행 대기 상태로 만듦
		notify();
		try {
			// 자신의 스레드는 일시 정지 상태로 만듦
			wait();
		} catch (InterruptedException e) {			
		}
	}	
}
