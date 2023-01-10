package java0110;

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer myCom = new Computer();
		
		// 합산 결과를 리턴받아 result1 변수에 대입
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2: " + result2);
	
		int[] five = {1,2,3,4,5};
		int result3 = myCom.sum(five);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result4: " + result4);
		
	}

}
