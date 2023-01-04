package java1205;

public class Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	//섭씨에서 화씨
		int cV;
		double fV;
		cV = 27;
		fV = (cV * 1.8) + 32;
		System.out.println("섭씨 온도 = " + cV + "도");
		System.out.println("화씨 온도 = " + fV + "도");
	*/
		
		// 화씨에서 섭씨
		double cV;
		double fV;
		
		fV = 108.6;
		cV = (fV - 32) / 1.8;
		
		System.out.println("화씨 온도 = " + fV + "도");
		System.out.println("섭씨 온도 = " + cV + "도");
		
	}

}
