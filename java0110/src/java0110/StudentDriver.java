package java0110;

public class StudentDriver {
	
  public static void main(String[] args) {
    //첫 번째 학생을 나타내는 객체를 만든다.
    Student stud1 = new Student();
    stud1.name = "선남";
    stud1.assigmentsScore = 91;
    stud1.examScore = 84;
    System.out.println(stud1.toString());

	  //두번째 학생을 나타내는 객체를 만든다.
      Student stud2 = new Student();
    stud2.name = "선녀";
    stud2.assigmentsScore = 86;
    stud2.examScore = 95;
    System.out.println(stud1.toString());
    
  }
}