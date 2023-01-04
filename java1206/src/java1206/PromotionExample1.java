package java1206;

public class PromotionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;			// byte 1byte -> int 4byte 
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';		// char 2byte -> int 4byte
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;				// int 4 byte -> long 8byte
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;				// long 8 byte -> float 4byte 실수 변환
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;			// float 4byte -> double 8byte
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		

	}

}
