package java0109;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int[][] arr = new int[4][4];
		for (i=0; i<arr.length; i++) {
			for (j=0; j<arr[i].length; j++) {
				if (i!=arr.length-1 && j!=arr[i].length-1) {
					arr[i][j] = (int)(Math.random()*10)+1;
					arr[i][3] += arr[i][j];
					arr[3][j] += arr[i][j];
					arr[3][3] += arr[i][j];
					
				}
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
			
		
		
		
	}

}
