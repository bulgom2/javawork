package java1213.exercise1213;

public class Object6_6 {
	// 두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
	static double getDistance (int x, int y, int x1, int y1) {
		double distance;
		distance = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		
		return Math.abs(distance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getDistance(1,1,2,2));
	
	}

}

//Math.sqrt() <- 제곱근
// Math.pow() <- 제곱
// Math.abs() <- 절대값