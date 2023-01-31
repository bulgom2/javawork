package ch13_3;

public class Box<T> {
	// 필드
	private T t;
	
	// Getter 메소드
	public T get() {
		return t;
	}
	
	// Setter 메소드
	public T set(T t) {
		this.t = t; 
	}
}
