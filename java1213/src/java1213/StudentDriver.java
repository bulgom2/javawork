package java1213;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		
		String flag = "";
		Student stud1 = new Student();
		Scanner scan = new Scanner(System.in);
		
		do {
			
		System.out.println("이름: ");
		stud1.name = scan.nextLine();
		
		System.out.println("과제 점수: ");
		stud1.assignmentScore = scan.nextInt();
		
		System.out.println("시험 점수: ");
		stud1.examScore = scan.nextInt();
		scan.nextLine();
		
		System.out.println(stud1.toString());
		System.out.println("계속 입력하시겠습니까?" );
		flag = scan.nextLine();
		
		} while (flag.equals("y"));
		scan.close();
	}

}

//// 첫번째 학생 이름 정하기
//stud1.name = "선남";
//// 첫번째 학생 과제 점수 정하기
//stud1.assignmentScore = 91;
//// 첫번째 학생 시험 점수 정하기
//stud1.examScore = 84;
//// 첫번째 학생 이름, 점수들, 학점 출력
//System.out.println(stud1.toString());
//
//// 두번째 학생을 나타내는 객체
//Student stud2 = new Student();
//// 두번째 학생 이름 정하기
//stud2.name = "선녀";
//// 두번째 학생 과제 점수 정하기
//stud2.assignmentScore = 86;
//// 두번째 학생 시험 점수 정하기
//stud2.examScore = 95;
//// 두번째 학생 이름, 점수들, 학점 출력
//System.out.println(stud2.toString());