package java1214.exercise1214;

public class Object4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int sum = 0;
		
		
		while (sum < 100) {
			i++;
			if (i % 2 == 0) 
				sum-=i;
			else
				sum+=i;
			System.out.println("i: "+i);
			System.out.println("sum: "+sum);
		}
		System.out.println(i);
		System.out.println(sum);
		
		
////		int s = 1;
//		
////		for (i=1; true; i++, s=-s) {
////			if (i % 2 == 0) {
//					sum += i*s;
////			} else {
//					sum += i;
////		
////		
////		System.out.println(sum);
		
		
		
	}

}
