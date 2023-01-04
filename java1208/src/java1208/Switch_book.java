package java1208;

public class Switch_book {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int book = 10;
		book = book / 10;
		switch(book) {
			case 0:		// 10권 미만
				System.out.println("조금 더 노력하세요.");
				break;
			case 1:		// 10권 이상 20권 미만
				System.out.println("책 읽는 것을 즐기는 분이시네요.");
				break;
			case 2:		// 20권 이상 30권 미만
				System.out.println("책을 사랑하시네요!");
				break;
			default:	// 30권 이상
				System.out.println("당신은 다독왕입니다!");
		}
		
	}
}
