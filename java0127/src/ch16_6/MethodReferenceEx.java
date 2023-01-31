package ch16_6;

public class MethodReferenceEx {
	public static void main(String[] args) {
		Person person = new Person();	// (a, b) -> a.compareToIgnoreCase(b)
		person.ordering(String :: compareToIgnoreCase);
	}
}
