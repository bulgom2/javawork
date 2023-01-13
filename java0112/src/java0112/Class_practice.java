package java0112;

public class Class_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car11 mycar1 = new Car11();
		Car11 mycar2 = new Car11();
		
		mycar1.color = "red";
		mycar2.color = "black";
		mycar1.speedUp();
		mycar2.wiper();
		
		System.out.println("mycar1의 색: " + mycar1.color);
		System.out.println("mycar2의 색: " + mycar2.color);
		System.out.println();
		System.out.println("mycar1의 속력: " + mycar1.speed);
		System.out.println("mycar2의 속력: " + mycar2.speed);
		System.out.println();
		System.out.println("mycar1의 와이퍼 작동 여부: " + mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동 여부: " + mycar2.wiperOn);
	
		System.out.println(mycar1);
		System.out.println(mycar2);
	}

}
