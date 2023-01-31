package ch17_4;

import java.util.stream.IntStream;

public class StreamEx3 {
	public static int sum;	// 정적 변수: 클래스 변수
	
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
	}
}
