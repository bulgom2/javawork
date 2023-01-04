package java1209;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores = {
				{80, 90, 96},
				{76,88}
		};
		
		System.out.println("총 반 수: " + scores.length);
		System.out.println("A반 학생 수: " + scores[0].length);
		System.out.println("B반 학생 수: " + scores[1].length);
		System.out.println("각 반 마지막 학생 점수: " + scores[0][2] + ", " + scores[1][1]);
		
		double sumA = 0;
		for (int i=0; i<scores[0].length; i++) {
			sumA += scores[0][i];
		}
		
		double avgA = sumA / scores[0].length;
		System.out.println("A반 평균 점수: " + avgA);
		
		double sumB = 0;
		for (int j=0; j<scores[1].length; j++) {
			sumB += scores[1][j];
		}
		
		double avgB = sumB /scores[1].length;
		System.out.println("B반 평균 점수: " + avgB);
		
		System.out.println("전체 평균 점수: " + (sumA + sumB) / (scores[0].length + scores[1].length));
		
		
		
		
	}

}
