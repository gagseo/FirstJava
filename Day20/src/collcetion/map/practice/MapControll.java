package collcetion.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import set.model.vo.Student;

public class MapControll {

	// Map
	// 키(key)와 값(value)로 구성되어 있으며, 키와 값은 모두 객체이다.
	// 키는 중복을 허용하지 않고 (set처럼!) 값은 중복저장이 가능하다(list 처럼)
	// 키는 중복 되는 경우에, 기존의 키에 해당하는 값을 덮어쓴다!!!
	// 구현 클래스는 HashMap, LikedHashMap, Properties 등등

	public void mapEx() {

		Map<String, Object> map = new HashMap<String, Object>();

		// 1. 맵에 데이터 추가
		map.put("std01", new Student("강동원", 80));
		map.put("std02", new Student("손예진", 70));
		map.put("std03", new Student("조승우", 90));
		map.put("std04", new Student("조승우", 90));

		System.out.println("put 전 :" + map);
		// 2.키값 중복시 value 덮어씀
		map.put("std04", new Student("김태희", 100));
		System.out.println("put 후 :" + map);

		System.out.println("=========================================");
		// 3. Map에 저장된 데이터 개수 확인
		System.out.println("저장된 데이터 수 : " + map.size());

		System.out.println("=========================================");
		// 4. Map에 들어있는 값 꺼내기
		System.out.println("key = std04 인 value는 ? " + map.get("std04"));

		System.out.println("===============containsKey=============");
		// 5. 해당 키가 Map에 저장되어 있는지 확인
		// containsKey(Object key)
		System.out.println("key == std04 : " + map.containsKey("std04"));

		System.out.println("==============containsValue==============");
		// 6. 해당 값이 Map에 저장되어 있는지 확인
		// containsValue(Object value)
		System.out.println("value == 김태희, 100 :" + map.containsValue(new Student("김태희", 100)));

		System.out.println("===============map.keyset()================");
		// 7. map에서 값을 일괄적으로 꺼내기
		// map.keyset() 키를 셋으로 받음
		Set set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(map.get(key));
		}

		System.out.println("================values()===============");
		// 7-2 : values()
		// map.values() 값들을 Collection타입으로 반환
		List sl = new ArrayList(map.values());
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		System.out.println("================map.entrySet()===============");
		// 8. map.entrySet()
		// Map의 내부 인터페이스인 Entry 사용
		// Entry : 키와 값을 한 쌍으로 묶은 것 키=값 형태
		Set entrySet = map.entrySet();
		Iterator it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Object> entry = (Entry<String, Object>) it2.next();
			System.out.println(entry);
		}

	}
}
