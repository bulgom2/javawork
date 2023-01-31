package stream2;

import java.util.ArrayList;
import java.util.List;

import ch17_7.Student;

public class SortingEx {

	public static void main(String[] args) {
		// List 컬렉션 사용
		List<Student> studentList = new ArrayList<>();
			studentList.add(new Student("홍길동", 30));
			studentList.add(new Student("신용권", 10));
			studentList.add(new Student("유미선", 20));
			
			// 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
			studentList.stream()
				// 람다식을 이용해 main에서 compare 만들어주는 법
				.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
			System.out.println();
			
			// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
			studentList.stream()
				// Comparator 없이 람다식으로 compare하면 내림차순은 순서만 바꿔서 써주면 됨
				.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))	// 내림차순
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
			System.out.println();
	}
}
