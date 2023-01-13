package java0112;

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 10;
		
		Calculator calculator = new Calculator();		// 부모 클래스에서 객체 생성
		System.out.println("원 면적: "+ + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();				// 자식 클래스에서 객체 생성
		System.out.println("원 면적: " + computer.areaCircle(r));
		// 자식 클래스에서 부모 메서드인 areaCircle()이 있지만
		// 자식 클래스에서 areaCircle()에 대한 메서드를 수정했다면
		// 자식 클래스에서 수정한 areaCircle()만 실행이 가능함
	}

}
