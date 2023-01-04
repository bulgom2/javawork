package java1208;

import java.util.Arrays;

public class Array_copy1 extends Taxi_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// System.arraycopy(복사할 배열, 복사 시작 인덱스, 덮어쓸 배열, 덮어쓰기 시작 인덱스, 복사 길이)
		
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = {0, 0, 0, 0, 0, 0, 0};
	
		System.out.print(Arrays.toString(a));
		System.out.print(Arrays.toString(b));
		
		// a 배열의 4, 5 값을 복사해서 b의 두번째에 붙여넣기
		System.arraycopy(a, 3, b, 1, 2);
		System.arraycopy(a, 0, b, 3, 3);
		System.out.print(Arrays.toString(b));
		
		
	}

}
