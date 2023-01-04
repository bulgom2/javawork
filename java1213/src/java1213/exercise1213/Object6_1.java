package java1213.exercise1213;

class SutdaCard {
	
	int num;
	boolean isKwang;
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	SutdaCard() {
		this(1, true);
	}

	String info() {
		return num + (isKwang ? "K":"");
	}
}

public class Object6_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}

}
