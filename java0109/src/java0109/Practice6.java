package java0109;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1; 
		int[][] sixteen = new int[4][4];
		for (int i=0; i<sixteen.length; i++) {
			for(int j=0; j<sixteen[i].length; j++) {
				sixteen[i][j] = num;	// 좌표에 숫자를 넣어줌
				num++;
				System.out.print(sixteen[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
