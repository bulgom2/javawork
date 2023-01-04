package java1213.exercise1213;

public class Object6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
				
		System.out.print(s.info());

	}

}

class Student2 {
	String name;	// 이름
	int ban;		// 반
	int no;			// 번호
	int kor;		// 국어점수
	int eng;		// 영어점수
	int math;		// 수학점수
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
		
	int getTotal() {
		int total = kor + eng + math;
		return total;
	}
	
	float getAverage() {
		float avg = (float)getTotal() / 3;
		return avg;
	}
	
	String info() {
		String str = "";
		str += this.name + ", ";
		str += this.ban + ", ";
		str += this.no + ", ";
		str += this.kor + ", ";
		str += this.eng + ", ";
		str += this.math + ", ";
		str += getTotal() + ", ";
		str += Math.round(getAverage() * 10) / 10.0;
		return str;
	}
}
	

