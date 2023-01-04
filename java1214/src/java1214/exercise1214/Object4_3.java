package java1214.exercise1214;

public class Object4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;
		int sum = 0;
		
		for (i=1; i<=10; i++) {
			for (j=1; j<i; j++) {
				sum = sum + j;
			}
		sum = sum + i;
		}
		System.out.println(sum);
	}
}





/*		
		for (i=1; i<=10; i++) {
			
			for (j=1; j<=i; j++) {
				sum = sum + j;
			}
		}
*/	
		


//
//for (i=1; i<=10; i++) {
//	
//	for (j=1; j<i; j++) {
//		sum = sum + j;
//	}
//	sum = sum + i;
//
//}