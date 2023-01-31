package ch12;

class Obj {
	
	String a; 
	public Obj(String a) {
		this.a = a;
	}
	
	@Override
	public int hashCode() {
		int hashCode = a.hashCode();
		return hashCode;
	}
}

class Obj2 {
	
	String a; 
	public Obj2(String a) {
		this.a = a;
	}
	
	@Override
	public int hashCode() {
		int hashCode = a.hashCode();
		return hashCode;
	}
	
}

public class HashCodeEx {
	
	public static void main(String[] args) {
		
		String b = "ja";
		String c = b + "va";
		
		Obj obj1 = new Obj(c);
		Obj obj2 = new Obj("java");
		Obj2 obj3 = new Obj2("java");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3.hashCode());
		
		System.out.println(obj1.a.contentEquals(obj2.a));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.a.equals(b));
		System.out.println(obj3.a.equals(b));
	
		System.out.println(b);
		System.out.println(c);
		System.out.println(c.equals(b));
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
	}
}
