package java1213.exercise1213;

class PlayingCard {									// 클래스
	int kind;										// 인스턴스 변수
	int num;										// 인스턴스 변수
	
	static int width;								// 클래스 변수
	static int height;								// 클래스 변수
	
	PlayingCard(int k, int n) {						// 생성자 (지역/매개 변수)
		kind = k;									// 인스턴스 변수
		num = n;									// 인스턴스 변수
	}
}

public class Object6_8 {							// 클래스

	public static void main(String[] args) {		// 클래스 메서드 (args: 지역변수)
		PlayingCard card = new PlayingCard(1,1);	// 인스턴스 생성 (card: 지역/참조변수)
	}

}
