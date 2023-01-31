package ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 병렬 처리
		// 병렬 스트림 얻기
		Stream<String> parallelStream = list.parallelStream();
		// 람다식: 요소 처리 방법
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}
}
