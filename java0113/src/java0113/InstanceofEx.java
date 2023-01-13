package java0113;

public class InstanceofEx {
	
	// 정적 메소드 생성: 바로 호출해서 사용하기 위해
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		// person이 참조하는 객체가 Student 타입인지 확인
		 if (person instanceof Student) {	// 사용자가 생성한 객체가 Student 타입인지 확인
		 Student student = (Student) person;
		 System.out.println("studentNo: " + student.studentNo);
		 student.study();
		 }
		
		 /* java 12 이후에 아래 방식 사용 가능
		if (person instanceof Student student) {
			System.out.println("StudentNo: " + student.studentNo);
			student.study();
		}
		 */
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
		
	}

}
