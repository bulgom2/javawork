package java1209;

import java.util.Arrays;

public class Array_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] student = {30, 20, 10, 10};
		
		System.out.println("현재 자동으로 초기화된 값: " + student[0]);
		System.out.println("현재 첫번째 요소의 값: " + student[1]);
		
		
		// 길이가 5인 배열 생성, 배열 길이 생략
		int[] a = new int[] {10, 20, 4, 25, 18};
		System.out.println(Arrays.toString(a));
		
		// 길이가 7인 배열 생성, new int[] 생략 가능
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(b));
		
		// for 문으로 배열 초기화
		int[] c = new int[10];
		for (int i = 0; i<c.length; i++) { // for 문 조건에는 세미콜론 하지 않기!!!
			c[i] = i;
		}
		
		// for 문을 이용한 출력
		for (int i = 0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
		// 함수(메서드) 사용한 출력
		System.out.println("");
		System.out.println(Arrays.toString(c));
	}
}
