package java1207;

import java.util.Scanner;

public class If_if14_weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int height;
		String gender;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요. [남/여]");
		gender = scan.nextLine();
		System.out.println("키를 입력하세요.");
		height = scan.nextInt();
		
		double male = (40 + 0.89 * (height - 150));
		double female = (37.8 + 0.75 * (height - 150));
		
		if (gender.equals("남")) {
			if (height > 150) {
				System.out.println("남성의 이상적인 체중은 " + male + "kg 입니다.");
			} else {
				System.out.println("남성의 이상적인 체중은 40kg 입니다.");
			}
		} else {
			if (height > 150) {
				System.out.println("여성의 이상적인 체중은 " + female + "kg 입니다.");
			} else {
				System.out.println("여성의 이상적인 체중은 37.8kg 입니다.");
			}
		}
		scan.close();
	}

}
