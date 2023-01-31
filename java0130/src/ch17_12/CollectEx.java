package ch17_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {
	public static void main(String[] args) {
		// 요소 그루핑
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		Map<String, List<Student>> map = totalList.stream()
				.collect(
					Collectors.groupingBy(s -> s.getSex())
				);
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		List<Student> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));

		System.out.println();
		System.out.println();
		System.out.println();


		// 필터링한 요소 수집 //
		List<Student> totalList1 = new ArrayList<>();
		totalList1.add(new Student("홍길동", "남", 92));
		totalList1.add(new Student("김수영", "여", 87));
		totalList1.add(new Student("감자바", "남", 95));
		totalList1.add(new Student("오해영", "여", 93));
		
		/*// 남학생만 묶어 List 생성 (Java 16~) 
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex().equals("남"))
				.toList();
		*/
		List<Student> maleList1 = totalList1.stream()
				.filter(s -> s.getSex().equals("남"))
				.collect(Collectors.toList());
		
		maleList1.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// 학생 이름을 키, Student 객체 값으로 갖는 Map 생성
		Map<String, Integer> map1 = totalList1.stream()
				.collect(
					Collectors.toMap(
						s -> s.getName(),
						s -> s.getScore()
					)
				);
		
		System.out.println(map1);
	}
}
