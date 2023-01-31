package java0116;

public class B_Dog extends B_Animal {

	// 부모의 추상 메서드를 오버라이딩을 통해 자식 클래스에서 구체적으로 구현
	@Override
	public void sound() {
		System.out.println("왈왈!");
	}	
}
