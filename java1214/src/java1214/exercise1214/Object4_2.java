package java1214.exercise1214;

public class Object4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int sum = 0;
	
		for (i=1; i<=20 ; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;		
			} 
			sum += i;
		} System.out.println("합: " + sum);
	
	}

}


/*	// 왜 안 됨?
for (i=1; i<=20 ; i++) {
	if (i % 2 != 0 || i % 3 != 0) {
		sum += i;
	} else {
		continue;
	}
}
*/
