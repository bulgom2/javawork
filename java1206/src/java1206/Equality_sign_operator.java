package java1206;

public class Equality_sign_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 3.14;
		double b = 5.14;
		System.out.println(a==b);		// a와 b는 같다 -> 거짓
		System.out.println(a!=b);		// a와 b는 다르다 -> 참
		
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!"));
		// 자바에서 대소문자는 다르게 취급되므로 false 반환
		System.out.print(c1.equals("Hello JAVA!"));

	}

}
