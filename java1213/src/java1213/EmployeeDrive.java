package java1213;

public class EmployeeDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emplo1 = new Employee();
		
			emplo1.name = "이도령";
			emplo1.number = 100;
			emplo1.age = 25;
			
			System.out.println(emplo1.toString());

		Employee emplo2 = new Employee();
		
			emplo2.name = "성춘향";
			emplo2.number = 200;
			emplo2.age = 18;
			
			System.out.println(emplo2.toString());
			
			emplo2.number = 300;
			
			System.out.println(emplo2.toString());

	}

}
