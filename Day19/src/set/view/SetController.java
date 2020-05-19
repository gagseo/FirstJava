package set.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import set.model.vo.Student;

public class SetController {

	// Set�� Ư¡
	// ����Ǵ� ���� ������ �������� �ʰ�, �ֺ��� ������� �ʴ´�.
	// null�� �ϳ��� �� �� �ֵ�.
	// ������ �������� List�� �ٸ��� index�� ������ �Ұ����ϰ� get() �޼��嵵 ����.
	// ���� Ŭ���� : HashSet, LinkedHashSet, TreeSet

	public void hashSetEx() {

		// hashSet
		// Set�������̽��� ������ ��ǥ���� �÷���
		// Hashing�� �̿��ؼ� �����Ǿ��� ������ ���� ���� �ӵ��� ����
		// �⺻ �����ڷ� ���� ��� �⺻ �뷮�� 16
		// ������ �뷮�� 75%�� �� ������(load factor:0.75)
		// ��ü �뷮�� �ι� ������Ų��.

		Set<Student> set = new HashSet<Student>();
		set.add(new Student("������", 99));
		set.add(new Student("�̳���", 85));
		set.add(new Student("�Ѱ���", 70));
		set.add(new Student("������", 99)); // �ߺ��� �ȵȴ�. ���� �ν��Ͻ��� ������� ������(�ּҰ��� �ٸ���), ���� ���� �ȵ�

		// StudentŬ������ hashCode, equals�� �������̵� �ϸ� ������� �޶����°� Ȯ�� �� ���ִ�.

		System.out.println(set);
		// [Student [�̸� = �̳���, ���� = 85], Student [�̸� = �Ѱ���, ���� = 70], Student [�̸� = ������,
		// ���� = 99]]

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
		setList.add(new Student("������", 99));
		set = new HashSet(setList);
		for (Student s : set) {
			System.out.println(s);
		}
	}
}
