package java0106;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*100)+1;
		
		System.out.println("점수: " + num);
		
		if (num >= 90) {
			System.out.println("A학점");
		} else if (num >= 80) {
			System.out.println("B학점");
		} else if (num >= 70) {
			System.out.println("C학점");
		} else if (num >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
	}

}
