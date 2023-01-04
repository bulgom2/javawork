package java1208;

public class Sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int sum = 0;
		
		System.out.print("값\t합\n");
		for (i=1;i<=5;i++) {
			System.out.println(i + "\t" + (sum += i));
		}
	}
}
