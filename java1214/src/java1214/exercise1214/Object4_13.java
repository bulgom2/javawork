package java1214.exercise1214;

public class Object4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "1234";
		char ch = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사
		for (int i=0; i<value.length();i++) {
			if(value.charAt(i)>='0' && value.charAt(i)<='9') {
				isNumber = true;
			} else {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
		
	}

}
