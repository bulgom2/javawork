package java1214.exercise1214;

public class Object4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		int sum = 0;
		
		while (num > 0) {
		
			sum += num%10;	// 12,345를 10으로 나눈 나머지는 5 이기 때문에 5을 반환함
							// sum 에는 5가 남아있음
			num /= 10;		// 이후 12,345를 10으로 나눈 값을 num으로 반환함
							// 다시 위로 올라가서 1,234를 10으로 나눈 나머지 4을 반환
		}					// 반복
		
		System.out.println("sum = " + sum);
		
	}

}
