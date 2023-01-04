package java1213;


class Area {
	static void manual() {
		System.out.println("현재 사용 가능한 함수 목록");
		System.out.println("triangle: 삼각형 넓이");
		System.out.println("rectangle: 사각형 넓이");
		System.out.println("입니다");
	}
	
	double triangle(int a, int b) {		//삼각형 넓이 구하는 메서드: 인스턴스 메서드 선언
		return (double)a * b / 2;
	}
	
	int rectangle(int a, int b) {		//사각형 넓이 구하는 메서드: 인스턴스 메서드 선언
		return a * b;
	}
}

public class Method1 {

	public static void main(String[] args) {
		Area.manual();	// 클래스 메서드
//		Area.triangle(3, 5);	// 인스턴스 메서드 접근 불가능 <- 인스턴스 생성 전
//		Area.rectangle(3, 4);	// 인스턴스 메서드 접근 불가능 <- 인스턴스 생성 전
		
		Area cal = new Area();	// 인스턴스 cal 생성
		
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
		
		
		
	}

}
