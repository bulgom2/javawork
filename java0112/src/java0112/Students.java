package java0112;

public class Students {
	
	protected String name;
	protected int number;
	
	public Students() {
		name = "";
		number = 0;
	}
	
	// 이름을 매개변수 값으로 초기화하면서 Student 객체를 생성한다.
	public Students(String Name, int Number) {
		setName(Name);
		setNumber(Number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return ("이름: " + name + ", 학번: " + number);
	}
	
	// 현 객체의 현재 상태가 other 객체와 같은지를 알려준다.
	public boolean equals(Students other) {
		return (this.name.equals(other.name)) && (this.number == other.number);
	}
}


	