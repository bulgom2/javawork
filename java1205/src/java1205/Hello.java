package java1205;


public class Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour = 5;
		int minute = 13;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalminute = (hour * 60) + minute;
		System.out.println("총 " + totalminute + "분");
		
		
		int x = 3;
		int y = 5;
		System.out.println("(x:" + x + ", y:" + y + ")");
		
		int temp;  // 자리 변환을 위해 임시 저장 공간 만들기
		temp = x;
		x = y;
		y = temp;
	
		System.out.println("(x:" + x + ", y:" + y + ")");
	
	}
	
}	
/*

	public static int sum(int n, int m) {
		return n + m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;			// int 정수형 i 변수에 20이라는 값을 대입
		int s;				// int 정수형 s 변수를 선언
		char a;				// char 문자형 a 변수를 선언 - char 한글자
		
		s = sum(i, 10);		// s = 30;
		a = '?';			// a = ? 문자를 대입
		System.out.print(a);
		System.out.print("Hello");
		System.out.print(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나의 나이는 " + 20 + "살 입니다.");
		
		System.out.println("3과 4를 결합: " + 3 + 4);
		System.out.println("3과 4를 결합: " + (3 + 4)); // 계산 시 괄호 씌우기
		
		System.out.println("나는 \"물론\"이라고 말했다.");
	}


*/
