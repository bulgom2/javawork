package java1212;

public class Method1 {

	public static void dutch(int totalPay, int count) {
		int dutchPay = totalPay / count;
		
		System.out.println("1인당 부담 금액: " + dutchPay + "원");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static 메소드가 아닌 경우				// 인스턴스 생성 필요
		// Method1 method1 = new Method1(); // 클래스명 변수이름 = new 클래스명();
		// method1.dutch(30000,3);			 // 변수이름.메소드이름(입력값1, 입력값2);
		
		// static 메소드인 경우				// 인스턴스 생성하지 않아도 됨
		Method1.dutch(92000, 5);		// 클래스명.메소드명(값1, 값2);
		
	}
}
