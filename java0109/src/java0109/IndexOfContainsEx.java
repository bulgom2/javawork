package java0109;

public class IndexOfContainsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");  // 인덱스 값 찾기
		System.out.println(location);
		String substring = subject.substring(location); // 해당하는 인덱스의 문자열 잘라내기
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if (location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이네요.");
		}
		
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이네요.");
		}
		
	}

}
