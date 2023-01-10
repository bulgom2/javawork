package java0109;

class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if (strVar1 == strVar2) {  // == 번지값을 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if (strVar1.contentEquals(strVar2)) {  // equals 데이터 값을 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");  // 객체로 생성, 새로운 주소값과 데이터가 따로 저장
		String strVar4 = new String("홍길동");  // 객체로 생성, 새로운 주소값과 데이터가 따로 저장
		
		if (strVar3 == strVar4) {  // == 번지값을 비교
			System.out.println("strVar3과 strVar4는 참조가 같음");	
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if (strVar3.equals(strVar4)) {  // equals 데이터 값을 비교
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
