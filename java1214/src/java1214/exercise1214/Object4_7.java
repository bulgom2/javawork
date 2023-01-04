package java1214.exercise1214;

public class Object4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = (int)((Math.random()*6)+1);
		// 0부터 1을 6까지로 만들어준 후에 0을 1로 더 해 1부터 시작하게 만들어 줌
		// 그 후 정수형 타입을 씌워서 소수점을 버리고 1~6 사이의 정수만 출력하게 만들어 줌

		
		System.out.println("value: " + value);
		
	}

}

//double value = Math.random();
// Math.random() << 0부터 1까지 실수형으로 표현됨