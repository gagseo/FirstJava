package set.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import set.model.vo.Student;

public class SetController {

	// Set의 특징
	// 저장되는 값의 순서를 유지하지 않고, 주복을 허용하지 않는다.
	// null도 하나만 들어갈 수 있디.
	// 순서가 없음으로 List와 다르게 index로 접근이 불가능하고 get() 메서드도 없다.
	// 구현 클래스 : HashSet, LinkedHashSet, TreeSet

	public void hashSetEx() {

		// hashSet
		// Set인터페이스를 구현한 대표적인 컬렉션
		// Hashing을 이용해서 구현되었기 때문에 빠른 접근 속도를 가짐
		// 기본 생성자로 만들 경우 기본 용량이 16
		// 지정한 용량의 75%가 찰 때마다(load factor:0.75)
		// 전체 용량을 두배 증가시킨다.

		Set<Student> set = new HashSet<Student>();
		set.add(new Student("김태희", 99));
		set.add(new Student("이나영", 85));
		set.add(new Student("한가인", 70));
		set.add(new Student("김태희", 99)); // 중복이 안된다. 새로 인스턴스를 만들었기 때문에(주소값이 다르다), 순서 유지 안됨

		// Student클래스에 hashCode, equals를 오버라이딩 하면 결과값이 달라지는걸 확인 할 수있다.

		System.out.println(set);
		// [Student [이름 = 이나영, 점수 = 85], Student [이름 = 한가인, 점수 = 70], Student [이름 = 김태희,
		// 점수 = 99]]

		System.out.println("===========Iterator===========");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("===========foreach===========");
		for (Student s : set) {
			System.out.println(s);
		}

		System.out.println("===========ArrayList===========");
		List setList = new ArrayList(set);
		for (int i = 0; i < setList.size(); i++) {
			System.out.println(setList.get(i));
		}

		System.out.println("===========HashSet===========");
		setList.add(new Student("김태희", 99));
		set = new HashSet(setList);
		for (Student s : set) {
			System.out.println(s);
		}
	}
}
