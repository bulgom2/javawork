package java1208;

import java.util.Scanner;

public class vowel_count_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan = new Scanner(System.in);
		
		int len;
		int countV = 0;
		int countC = 0;
		int i;
		
		System.out.println("한 줄의 문장을 입력하세요: ");
		String inputStr = scan.nextLine();
		scan.close();		// 스캔 끝나는 지점에서 닫기
		
		len = inputStr.length();
		
		for (i=0;i<len;i++) {
			if (inputStr.charAt(i) == 'a' || inputStr.charAt(i) == 'e' || 
				inputStr.charAt(i) == 'i' || inputStr.charAt(i) == 'o' ||
				inputStr.charAt(i) == 'u' || inputStr.charAt(i) == 'A' ||
				inputStr.charAt(i) == 'E' || inputStr.charAt(i) == 'I' ||
				inputStr.charAt(i) == 'O' || inputStr.charAt(i) == 'U') {
				countV++;
			} else if (inputStr.charAt(i) != ' ' && inputStr.charAt(i) != '.' &&
					inputStr.charAt(i) != '\t' && inputStr.charAt(i) != '\n') {
				countC++;
			}
		}
		System.out.println("모음은 총 " + countV + "개 입니다.");
		System.out.println("자음은 총 " + countC + "개 입니다.");
		

	}

}
