package java0118;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try(MyResource res = new MyResource("A")) {
			String data = res.read2();
			// NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
//		MyResource res1 = new MyResource("A");
//		MyResource res2 = new MyResource("B");
		
//		try(res1; res2) // java 9 이상에서 사용 가능
		try (
			MyResource res1 = new MyResource("A");
			MyResource res2 = new MyResource("B");
		){
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}

	}

}
