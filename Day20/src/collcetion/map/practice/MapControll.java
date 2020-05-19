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
	// Ű(key)�� ��(value)�� �����Ǿ� ������, Ű�� ���� ��� ��ü�̴�.
	// Ű�� �ߺ��� ������� �ʰ� (setó��!) ���� �ߺ������� �����ϴ�(list ó��)
	// Ű�� �ߺ� �Ǵ� ��쿡, ������ Ű�� �ش��ϴ� ���� �����!!!
	// ���� Ŭ������ HashMap, LikedHashMap, Properties ���

	public void mapEx() {

		Map<String, Object> map = new HashMap<String, Object>();

		// 1. �ʿ� ������ �߰�
		map.put("std01", new Student("������", 80));
		map.put("std02", new Student("�տ���", 70));
		map.put("std03", new Student("���¿�", 90));
		map.put("std04", new Student("���¿�", 90));

		System.out.println("put �� :" + map);
		// 2.Ű�� �ߺ��� value ���
		map.put("std04", new Student("������", 100));
		System.out.println("put �� :" + map);

		System.out.println("=========================================");
		// 3. Map�� ����� ������ ���� Ȯ��
		System.out.println("����� ������ �� : " + map.size());

		System.out.println("=========================================");
		// 4. Map�� ����ִ� �� ������
		System.out.println("key = std04 �� value�� ? " + map.get("std04"));

		System.out.println("===============containsKey=============");
		// 5. �ش� Ű�� Map�� ����Ǿ� �ִ��� Ȯ��
		// containsKey(Object key)
		System.out.println("key == std04 : " + map.containsKey("std04"));

		System.out.println("==============containsValue==============");
		// 6. �ش� ���� Map�� ����Ǿ� �ִ��� Ȯ��
		// containsValue(Object value)
		System.out.println("value == ������, 100 :" + map.containsValue(new Student("������", 100)));

		System.out.println("===============map.keyset()================");
		// 7. map���� ���� �ϰ������� ������
		// map.keyset() Ű�� ������ ����
		Set set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(map.get(key));
		}

		System.out.println("================values()===============");
		// 7-2 : values()
		// map.values() ������ CollectionŸ������ ��ȯ
		List sl = new ArrayList(map.values());
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		System.out.println("================map.entrySet()===============");
		// 8. map.entrySet()
		// Map�� ���� �������̽��� Entry ���
		// Entry : Ű�� ���� �� ������ ���� �� Ű=�� ����
		Set entrySet = map.entrySet();
		Iterator it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Object> entry = (Entry<String, Object>) it2.next();
			System.out.println(entry);
		}

	}
}
