package java1206;

public class CastingEx1 {

	public static void main(String[] args) {
		// 강제 타입 변환: 작은 것에 대한 (type)을 명시하여 형 변환
		
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		double var7 = 3.14;			// 실수 3.14 -> 정수형: 소수점 버려짐
		int var8 = (int) var7;
		System.out.println(var8);
		
		

	}

}
