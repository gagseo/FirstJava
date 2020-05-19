package map.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import map.model.vo.Student;

public class MapController {

	// map : 키와 값으로 구성되어 있다.
	// 키는 set과 비슷하게 중복 저장을 허용하지 않는다.
	// 값은 중복저장을 허용한다.

	public void mapEx() {

		Map<String, Student> map = new HashMap<>();

		// 1. map에 데이터 추가
		// put(Object key, Object value);
		// 키값이 겹치면 데이터가 덮어쓰기 된다.
		System.out.println("=============1.map.put()======================");
		map.put("std01", new Student("김고은", 100));
		map.put("std02", new Student("공유", 100));
		map.put("std02", new Student("손예진", 90));

		System.out.println(map);

		// 2. 해당 키와 값이 Map에 저정되어 있는지 검사
		// containsKey(key) : 키가 저정되어 있는지 검사
		// contains Value(값) : 값이 저정되어 있는지 검사
		System.out.println("=============2.map.containsKey()======================");
		System.out.println(map.containsKey("std01"));
		System.out.println(map.containsKey("std100"));

		System.out.println("=============2.map.contains Value()======================");
		System.out.println(map.containsValue(new Student("김고은", 100)));
		System.out.println(map.containsValue(new Student("김고은", 0)));
		System.out.println(map.containsValue(new Student("공유", 100)));
		System.out.println(map.containsValue(new Student("손예진", 90)));

		// 3. 키 값만 뽑아내보기
		// keySet()

		System.out.println("=============3.keySet()======================");
		Set<String> set = map.keySet();
		for (String s : set) {
			System.out.println(map.get(s));
		}
		// 4. 값만 뽑아내기
		// values() : Map에 저장된 객체들을 Collection타입으로 반환해준다.
		System.out.println("=============4.values()======================");
		List<Student> valueList = new ArrayList<>(map.values());

		Set<Student> valueSet = new HashSet<>(map.values());

		for (Student s1 : valueList) {
			System.out.println(s1);
		}

		for (Student s2 : valueSet) {
			System.out.println(s2);
		}

		// 5. 값과 키를 함께 뽑아내기
		// entrySet() : 키와 값을 set으로 반환해준다.
		// entry : Map인터페이스 내부에 선언되있는 인터페이스.

		Set<Map.Entry<String, Student>> entry = map.entrySet();
		System.out.println("=============5.entrySet()======================");
		for (Map.Entry me : entry) {
			System.out.println(me);
			System.out.println("entry.getKey : " + me.getKey());
			System.out.println("entry.getValue : " + me.getValue());
		}

		// 6. 삭제
		// remove("키값")
		System.out.println("=============6.remove(\"키값\")======================");
		System.out.println(map.remove("std02"));
		System.out.println(map);
		
		
	}

}
