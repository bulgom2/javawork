package practice;

class Printer {
	static void println(int x) {
		System.out.println(x);
	}
	static void println(boolean x) {
		System.out.println(x);
	}
	static void println(double x) {
		System.out.println(x);
	}
	static void println(String x) {
		System.out.println(x);
	}
}


public class PrinterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Printer printer = new Printer();
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");

	}

}
