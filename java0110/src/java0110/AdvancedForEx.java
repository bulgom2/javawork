package java0110;

public class AdvancedForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
//		for (int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
		
		for (int score : scores) {
			sum += score;
		}
		double avg = (double) sum / scores.length;
		System.out.println("점수 총합 = " + sum);
		System.out.println("점수 평균 = " + avg);
	}

}
