package java1213;

public class Employee2 {

	public class Employee
	{
	    public String name;	// 이름
	    public int num;		// 직원의 번호와 나이
	  	public int age;

	    // -------------------------------------------------------
	    //  새로운 Employee 객체를 생성한다.
	    // -------------------------------------------------------
//		public Employee( )
//		{
//
//		}

		// 접근자 메소드 - 이름을 반환한다
		public String getName(String name)
		{
			return name;
		}

		// 접근자 메소드 - 번호을 반환한다
		public int getNumber(int num)
		{
	  		return num;
		}

		// 접근자 메소드 - 나이를 반환한다
		public int getAge(int age)
		{
	  		return age;
		}

	    //  현 Employee 객체의 정보에 대한 문자열을 반환한다.
	    public String toString ()
	    {
	  		String str = "";
	  		str += "이름: " + name + "\n";
	  		str += "번호: " + num + "\n";
	  		str += "나이: " + age + "\n";
	  		
	  		return str;
	    }

		// 변경자 메소드 - 이름을 주어진 값으로 변경한다
		public void setName(String Name)
		{
			name = Name;
		}

		// 변경자 메소드 - 번호을 주어진 값으로 변경한다
		public void setNumber(int Num)
		{
	  		num = Num;
		}

		// 변경자 메소드 - 나이를 주어진 값으로 변경한다
		public void setAge(int Age)
		{
	  		age = Age;
		}
	}
}
