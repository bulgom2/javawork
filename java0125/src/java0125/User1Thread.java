package java0125;

public class User1Thread extends Thread {
	private Calculator calculator;
	
	public User1Thread() {
		// 스레드 이름 변경
		setName("User1Thread");
	}
	
	// 외부에서 공유 객체인 Calculator를 받아 필드에 저장
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		// 동기화 메소드 호출
		calculator.setMemory1(100);
	}
}
