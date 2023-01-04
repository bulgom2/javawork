package java1214.exercise1214;

public class Object4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while (tmp!=0) {
			result = result * 10 + tmp % 10;//12321
			// 1 = 0 * 10 + 1
			// 12  = 1 * 10 + 2
			tmp /= 10;	//0
			// 1232
		}
		
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}

}
