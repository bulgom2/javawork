package java1209;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 시험 점수 평균 구하기
		int[] student = {100, 95, 90, 88, 93};
		int sum = 0;
		
		for(int i=0; i<student.length; i++) {
			sum += student[i];	// 총점 누적
		}
		System.out.println("시험 점수의 평균: " + sum/(float)student.length);
	}

}
	// 배열은 같은 타입의 값만 관리
	// 배열의 길이는 늘이거나 줄일 수 없음

	// 배열 선언시 초기값 //
	// byte[] 		0
	// char[]		'\u0000'
	// short[]		0
	// int[]			0
	// long[]		0L
	
	// float[]		0.0F		// 뒤에 f 생략시 에러
	// double[]		0.0		// 뒤에 d 붙이거나 생략 가능
	// float는 소수점 7자리, double은 소수점 16자리 표현

	// boolean[]		false

	// 클래스[]		null
	// 인터페이스[]	null