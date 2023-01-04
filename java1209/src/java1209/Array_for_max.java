package java1209;

public class Array_for_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = {1, 5, 3, 8, 2};
		
		// 변수 min과 max를 배열의 첫번째로 지정
		int min = array[0];
		int max = array[0];
		
		// for 문을 통해 min이 배열 내 숫자들과 비교하면서 min보다 작은 지점을 찾게 되면 min값으로 변환됨
		// 마찬가지로 max가 배열 내 숫자들과 비교하여 max보다 큰 지점을 찾으면 max값으로 변환
		for (int i=0; i<array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			
			if (max < array[i]) {
				max = array[i];
			}
		}

		System.out.println(max);
	}

}
