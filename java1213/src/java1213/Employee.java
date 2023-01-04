package java1213;

public class Employee {

	public String name;
	public int number;
	public int age;
	
	public String toString() { 
		String str = "이름: " + name + "\n번호: " + number + "\n나이: " + age + "\n=====================";

//		String str = "";
//		str += "이름: " + name + "\n";
//		str += "번호: " + number + "\n";
//		str += "나이: " + age + "\n";
//		str += "===================================";

		return str;
	}

}
