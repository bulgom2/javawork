package java0111;

public class KoreanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Korean k1 = new Korean("123456-1234657", "바밤바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// final 필드에는 값을 변경할 수 없다.
//		k1.nation = "USA";
//		k1.ssn = "123-123-12134";
		
		// 인스턴스 멤버의 값 변경은 가능하다.
		k1.name = "김자반";
		
	}

}
