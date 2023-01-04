package java1209;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] season = { "Spring", "Summer", "Fall", "Winter"};
		
//		season = {"봄", "여름", "가을", "겨울"}; 	// 배열이 만들어지고 난 후에는 수정 불가
		
		//배열의 항목값 읽기
		System.out.println("season[0]: " + season[0]);
		System.out.println("season[1]: " + season[1]);
		System.out.println("season[2]: " + season[2]);
		System.out.println("season[3]: " + season[3]);
		
		// 인덱스 1의 항목 변경
		season[1] = "여름";
		System.out.println("season[1]: " + season[1]);
		System.out.println();

		//배열 변수 선언과 배열 생성
		int[] scores = {83, 90, 87};
		
		// 총합과 평균 구하기
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합: " + sum);
		double avg = (double)sum / 3;
		System.out.println("평균: " + avg);
		
		
		
		
		
		
	}

}
