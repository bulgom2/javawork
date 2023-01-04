package java1207;

import java.util.Scanner;

public class If_if12_temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("온도를 입력하세요.");
		temp = scan.nextInt();
		
		System.out.println("온도: " + temp + "도");
		if (temp >= 25) {
			System.out.println("수영을 하기에 적절한 날씨입니다.");
		} else if (temp >= 15) {
			System.out.println("테니스를 하기에 적절한 날씨입니다.");
		} else if (temp >= 5) {
			System.out.println("골프를 하기에 적절한 날씨입니다.");
		} else {
			System.out.println("스키를 하기에 적절한 날씨입니다.");
		}
		scan.close();
	}

}
