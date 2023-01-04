package java1208;

import java.util.Scanner;

public class letter_count {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int len;
		int count = 0;
		int i;
		
		System.out.println("한 줄의 문장을 입력하세요: ");
		String inputStr = scan.nextLine();
		scan.close();		// 스캔 끝나는 지점에서 닫기
		
		len = inputStr.length();
		
	
		for (i=0;i<len;i++) {
			if (inputStr.charAt(i) != ' ' && inputStr.charAt(i) != '\n' && inputStr.charAt(i) != '\t') {
				count++;
			}
		}
		System.out.print("글자 수: " + count);
		

	}
}
