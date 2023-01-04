package java1209;

public class Array_for_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int count = 0;
		
		// 개수가 정해지지 않은 배열에 쓰기 위한 중첩 for 문
		for (int i=0; i<array.length; i++) {		// 배열의 총 행 수만큼 반복
			for (int j=0; j<array[i].length; j++) {	// 각 행의 열만큼 반복
				sum += array[i][j];	// 각 행열의 값들을 누적시켜 더하기
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(sum / count);

// 개별 for 문 사용		
//		int sum1 = 0;
//		int sum2 = 0;
//		int sum3 = 0;
//		
//		for (int i=0;i<array[0].length;i++) {
//			sum1 += array[0][i];
//		}
//		for (int j=0;j<array[1].length;j++) {
//			sum2 += array[1][j];
//		}
//		for (int k=0;k<array[2].length;k++) {
//			sum3 += array[2][k];
//		}
//		
//		int total_sum = sum1 + sum2 + sum3;
//		System.out.println("항목 전체 합: " + total_sum);
//		
//		int total_count = (array[0].length) + (array[1].length) + (array[2].length);
//		System.out.println("항목 전체 평균: " + total_sum / total_count);
//		
	}

}
