package java1213.exercise1213;

class Student1 {
	String name;	// 이름
	int ban;		// 반
	int no;			// 번호
	int kor;		// 국어점수
	int eng;		// 영어점수
	int math;		// 수학점수
	
	int getTotal() {
		int total = kor + eng + math;
		return total;
	}
	
	float getAverage( ) {
		float avg = (float)getTotal() / 3;
		return avg;
	}
	
//	String info() {
//		String str = "";
//		str += this.name + ", ";
//		str += this.ban + ", ";
//		str += this.no + ", ";
//		str += this.kor + ", ";
//		str += this.eng + ", ";
//		str += this.math + ", ";
//		str += getTotal() + ", ";
//		str += Math.round(getAverage() * 10) / 10.0;
//		return str;
//	}
}

public class Object6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s = new Student1();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + Math.round(s.getAverage() * 10) / 10.0);
		
//		System.out.print(s.info());
		
	}

}
