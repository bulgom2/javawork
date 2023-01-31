package ch17_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingEx {
	public static void main(String[] args) {
		// List 컬렉션 사용
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미선", 20));
		
		// 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted()	// 오름차순
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted(Comparator.reverseOrder())	// 내림차순
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}
}
