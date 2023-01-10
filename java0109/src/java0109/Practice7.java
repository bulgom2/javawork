package java0109;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[4][4];
		int i = 0;
		int j = 0;
		int num = arr[i].length * arr.length;

		for (i=arr.length-1; i>=0; i--) {
			for(j=arr[i].length-1; j>=0; j--) {
				arr[i][j] = num;	// 좌표에 숫자를 넣어줌
				num--;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
