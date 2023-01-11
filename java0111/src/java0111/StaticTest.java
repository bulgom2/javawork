package java0111;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticClass sc1 = new staticClass();
		
		sc1.a = 10;
		sc1.b = 20;
		sc1.c = 30;
		
		System.out.println("sc1.a = " + sc1.a);
		System.out.println("sc1.b = " + sc1.b);
		System.out.println("sc1.c = " + sc1.c);
		
		staticClass sc2 = new staticClass();
		sc2.a = 30;
		sc2.b = 40;
		
		System.out.println("sc2.a = " + sc2.a);
		System.out.println("sc2.b = " + sc2.b);
		System.out.println("sc2.c = " + sc2.c);
		System.out.println("sc1.a = " + sc1.a);
		
		System.out.println("클래스명.a = " + staticClass.a);

	}

}
