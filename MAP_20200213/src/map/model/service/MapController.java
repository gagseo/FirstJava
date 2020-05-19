package map.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import map.model.vo.Student;

public class MapController {

	// map : Ű�� ������ �����Ǿ� �ִ�.
	// Ű�� set�� ����ϰ� �ߺ� ������ ������� �ʴ´�.
	// ���� �ߺ������� ����Ѵ�.

	public void mapEx() {

		Map<String, Student> map = new HashMap<>();

		// 1. map�� ������ �߰�
		// put(Object key, Object value);
		// Ű���� ��ġ�� �����Ͱ� ����� �ȴ�.
		System.out.println("=============1.map.put()======================");
		map.put("std01", new Student("�����", 100));
		map.put("std02", new Student("����", 100));
		map.put("std02", new Student("�տ���", 90));

		System.out.println(map);

		// 2. �ش� Ű�� ���� Map�� �����Ǿ� �ִ��� �˻�
		// containsKey(key) : Ű�� �����Ǿ� �ִ��� �˻�
		// contains Value(��) : ���� �����Ǿ� �ִ��� �˻�
		System.out.println("=============2.map.containsKey()======================");
		System.out.println(map.containsKey("std01"));
		System.out.println(map.containsKey("std100"));

		System.out.println("=============2.map.contains Value()======================");
		System.out.println(map.containsValue(new Student("�����", 100)));
		System.out.println(map.containsValue(new Student("�����", 0)));
		System.out.println(map.containsValue(new Student("����", 100)));
		System.out.println(map.containsValue(new Student("�տ���", 90)));

		// 3. Ű ���� �̾Ƴ�����
		// keySet()

		System.out.println("=============3.keySet()======================");
		Set<String> set = map.keySet();
		for (String s : set) {
			System.out.println(map.get(s));
		}
		// 4. ���� �̾Ƴ���
		// values() : Map�� ����� ��ü���� CollectionŸ������ ��ȯ���ش�.
		System.out.println("=============4.values()======================");
		List<Student> valueList = new ArrayList<>(map.values());

		Set<Student> valueSet = new HashSet<>(map.values());

		for (Student s1 : valueList) {
			System.out.println(s1);
		}

		for (Student s2 : valueSet) {
			System.out.println(s2);
		}

		// 5. ���� Ű�� �Բ� �̾Ƴ���
		// entrySet() : Ű�� ���� set���� ��ȯ���ش�.
		// entry : Map�������̽� ���ο� ������ִ� �������̽�.

		Set<Map.Entry<String, Student>> entry = map.entrySet();
		System.out.println("=============5.entrySet()======================");
		for (Map.Entry me : entry) {
			System.out.println(me);
			System.out.println("entry.getKey : " + me.getKey());
			System.out.println("entry.getValue : " + me.getValue());
		}

		// 6. ����
		// remove("Ű��")
		System.out.println("=============6.remove(\"Ű��\")======================");
		System.out.println(map.remove("std02"));
		System.out.println(map);
		
		
	}

}
