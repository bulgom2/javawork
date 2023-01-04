package java1205;

public class Var1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 128 64 32 16  8 4 2 1
		int var1 = 0b1011;	// 2진수 -> 11
		int var2 = 0206;	// 8진수 ->  010 000 110 -> 128+0+6=134 
		int var3 = 365;		// 10진수 
		int var4 = 0xB3;	// 16진수 -> 1011 0011 -> 128+32+16+2+1=179  

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);

	}

}
