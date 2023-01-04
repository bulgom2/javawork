package java1214.exercise1214;

public class Object4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "12345";
		int sum = 0;
		
		for (int i=0; i < str.length(); i++) {
//			sum += Integer.parseInt(Character.toString(str.charAt(i)));
			// 문자들을 아스키코드로 변환한 값으로 연산하게 됨
			// 그 후 0에 대응하는 값으로 빼주어 문자 1을 숫자 1로 바꿔줌
			sum += str.charAt(i) -'0';	
		}
		System.out.println(sum);
	}

}


// charAt()은 문자열의 자리값에 맞는 문자를 char 타입으로 보게 됨
// Character.toString(); << 캐릭터를 스트링으로 바꿔주는 함수
