package java1214.exercise1214;

public class Object4_11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + ", " + num2);
		
		for (int i = 0; i < 8; i++) {
			//13. 총 8번을 반복!
			
			//1. 1+1 값을 num3에 받아 2가 됨
			//5. num3은 num1=1, num2=2의 값을 받아 3이 됨
			//9. num3은 num1=2, num2=3의 값을 받아 5가 됨
			num3 = num1 + num2;
			//2. num1은 num2 값인 1을 받음 
			//6. num1은 num2 값인 2를 받음 
			//10. num1은 num2 값인 3을 받음
			num1 = num2;
			//3. num2는 num3의 값 2를 받음
			//7. num2는 num3 값 3을 받음
			//11. num2는 num3 값 5를 받음
			num2 = num3;  
			
			//4. num3은 2가 출력되고 for 문 밖의 1, 1 뒤에 ", 2"가 출력됨
			//8. num3은 3이 출력되고 "1, 1, 2" 뒤에 ", 3"이 붙어서 출력됨
			//12. num3은 5가 출력되고 "1, 1, 2, 3" 뒤에 ", 5"가 출력됨
			System.out.print(", " + num3);
		}
		}
		
		

}
