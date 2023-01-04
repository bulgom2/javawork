package java1213.exercise1213;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance (int x1, int y1) {
		double distance;
		distance = Math.sqrt(Math.pow((x1 - this.x), 2) + Math.pow((y1 - this.y), 2));
		
		return Math.abs(distance);
	}
}

public class Object6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));
		
		
	}

}
