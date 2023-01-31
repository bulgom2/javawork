package java0125;

public class JoinEx {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();	// 1~100까지의 합 구하기
		sumThread.start();
		try {
			sumThread.join();					// sumThread가 동작 완료될 때까지 main 일시 정지	
		} catch (InterruptedException e) {}
		System.out.println("1~100까지의 합: " + sumThread.getSum());
	}
}
