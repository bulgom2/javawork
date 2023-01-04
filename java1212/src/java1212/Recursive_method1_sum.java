package java1212;

public class Recursive_method1_sum {

//	// for 문으로 만든 식
//	public static int for_sum(int n) {
//		int i;
//		int sum = 0;
//		for (i=1; i<n; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		return sum;
//	
//	} 
	
	public static int findSum(int n) {
		// 합을 저장하는 변수
		int sum;
		
		// n이 1이라면 합은 1
		if (n == 1)
			sum = 1;
		else
			sum = findSum(n-1) + n;
		
		// 합을 리턴함
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for_sum(100);
		
		int num = 100;
		System.out.println("1부터 " + num + "까지의 모든 정수들의 합은 "
				+ findSum(num) + "이다.");
		
	}
}
