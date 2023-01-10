package java0110;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] arr = {
//			{95, 86},
//			{83, 92, 96},
//			{78, 83, 93, 87, 88}
//		};
//		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
	
		
		
//		int sum = 0;
//		int count = 0;
//		double avg = 0;
//		
//		int[][] arr = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//			};
//		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				sum += arr[i][j];
//				count++;
//			}
//		}
//		avg = (double) sum / count;
//		System.out.println(sum);
//		System.out.println(avg);
	
		
		int[] array = {1, 5, 3, 8, 2};
		int hscore = 0;
		
		for (int i=0; i<array.length; i++) {
			
			if (array[i] > hscore) {
				hscore = array[i];
			}
		}
		System.out.println(hscore);
	}

}
