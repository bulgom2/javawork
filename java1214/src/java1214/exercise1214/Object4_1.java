package java1214.exercise1214;

public class Object4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4-1-1
		int x = 5;

		if (x > 10 && x < 20) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 10보다 크고, 20보다 작은 수가 아니기 때문에 false
		
		// 4-1-2
		char ch = ' ';
		
		if (ch != ' ' && ch != '\t') {
			System.out.println("true");
		} else {
			System.out.println("false");
		} 
		// 공백이나 탭이 아니면 true, 공백이기 때문에 false
		
		// 4-1-3
		char ch2 = 'X';
		
		if (ch2 == 'X' || ch2 == 'x') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// x 혹은 X가 맞기 때문에 true
		
		// 4-1-4
		char ch3 = 'h';
		
		if (ch3 >= 0 && ch3 <= 9) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 숫자 0~9에 포함되지 않기 때문에 false
		
		// 4-1-5
		char ch4 = 'K';
		
		if (ch4 >= 'A' && ch4 <= 'Z') {
			System.out.println("true");
		} else if(ch4 >= 'a' && ch4 <= 'z') {
			System.out.println("true");
			} else {
				System.out.println("false");
			}
		// 아스키코드로 비교하면 알파벳도 고유번호가 있기 때문에
		// 그대로 알파벳을 넣고 비교해도 조건이 성립함
		// 따라서 범위안에 포함이 되기 때문에 true
		// ch4 값을 알파벳과 아스키코드가 일치하는 숫자를 넣어도 비교가 됨
		
		//4-1-6
		int year = 2416;
		
		if (year % 400 == 0) {
			System.out.println("true");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("true");
			} else {
				System.out.println("false");
		}
		// 400으로 나눈 나머지가 0이 아니지만,
		// 4로 나눴을 때 나머지가 0이고 100으로 나눴을 때 나머지가 0이 아니기 때문에 true

		//4-1-7
		boolean powerOn = false;
		
		if (powerOn == false) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// boolean 타입의 변수에 값을 넣을 땐 = 를 쓰면 되지만
		// 조건문 안에서 비교를 해야하기 때문에 == 를 사용
		// false이면 true 이기 때문에 true
		
		//4-1-8
		String str = "no";
		
		if (str.equals("yes")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// String 타입의 변수 값이 yes와 다르기 때문에 false
		// String 타입에서 비교를 할 때는 == 가 아니라 '변수이름.equals()'를 사용
		
	}

}

// char 타입은 알아서 숫자로 바뀐다!
