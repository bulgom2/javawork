package java0109;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] arr = new String[3][3];  // 배열의 크기 지정해주기
		
		for (int i=0; i<arr.length; i++) { // 몇줄이냐
			for (int j=0; j<arr[i].length; j++) {  // 뒤에 몇개가 붙냐
				arr[i][j] = "(" + i + "," + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
				
	}

}
