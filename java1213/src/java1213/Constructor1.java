package java1213;

class Cellphone {
	String model = "Galaxy 22";
	String color;
	int capacity;
	
	Cellphone() {
		this.color = "Silver";
		this.capacity = 32;
	}
	
//	Cellphone(String color, int capacity) {
//		this.color = color; 	// 상위의 클래스 내  color 변수를 지칭하게 하는 this
//		this.capacity = capacity;
//	}

}


public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cellphone myphone = Cellphone();	// 에러 발생: 매개변수를 이용한 생성자를 생성할 때 기본 생성자 무시됨
		Cellphone myphone = new Cellphone();	// 생성자 매개변수가 동일 생성자 호출
		
		
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}
	
}
