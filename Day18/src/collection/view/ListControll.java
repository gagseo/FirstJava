package collection.view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import collection.model.vo.Music;

public class ListControll {

	public void doList() {

		// ArrayList
		// ũ�� ���� ����, �������� ������ �⺻�� 10
		List list = new LinkedList();

		list.add(new Music("������", "�ٽô� �������"));
		list.add(new Music("���", "������"));
		list.add(new Music("Ʈ���̽�", "TT"));
		list.add("��");

		// System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// add : ����Ʈ�� ���� �� �߰�
		// size : ����Ʈ�� �� �������� ����
		// get(int index): ����Ʈ���� �ش� �ε����� �����ϴ� ��ü ��ȯ

		// add(int index, Object e): �ε��� �����Ͽ� �ش� �ε����� e�� �߰�
		System.out.println("--------add(int index, Object e)--------");
		list.add(1, new Music("�鿹��", "square"));
		System.out.println(list.size());
		System.out.println(list);

		// set(int index, Object e): ������ �ε����� ���� e�� ����
		System.out.println("--------set(int index, Object e)--------");
		list.set(1, new Music("������", "���� ��"));
		System.out.println(list.size());
		System.out.println(list);

		// remove(int index) : ����Ʈ���� �ش� �ε����� ������
		System.out.println("--------remove(int index)--------");
		list.remove(1);
		System.out.println(list.size());
		System.out.println(list);

		// contains(Object o): o�� �����ϰ� �ִ��� true/false�� ��ȯ
		System.out.println("--------contains(Object o)--------");
		System.out.println(list.contains(new Music("������", "�ٽô� �������")));
		// ���ο� �ν��Ͻ��� �ҷ��� �ּҰ��� �޶� false��ȯ
		// ���� MusicŬ������ equal()�� �������̵� �ϸ� true

		// indexOf(Object o): o�� ��ġ�� �ε����� ��ȯ
		System.out.println("--------indexOf(Object o)--------");
		System.out.println(list.indexOf(new Music("������", "�ٽô� �������")));

		// subList(int index1, int index2): index1���� index2 �������� �����͵��� list�� �����Ͽ� ����
		System.out.println("--------subList(int index1, int index2)--------");
		List sub = list.subList(0, 2);
		System.out.println(sub);

		// isEmpty(): ����Ʈ �ȿ� ���� ������ false ������ true
		System.out.println("--------isEmpty()--------");
		System.out.println(list.isEmpty());

		// clear(): ����Ʈ ���� ��� ���� ����
		System.out.println("--------clear()--------");
		list.clear();
		System.out.println(list.isEmpty());
	}

	public void doList2() {

		// ���׸�
		// ���� : 1) ����� �Ѱ��� Ÿ���� ��ü�� �����ϵ��� ���������ν� ����� �ٸ� Ÿ����
		// ����� ���ϵ��� �Ѵ�. �������� ����.

		// 2) �÷��ǿ� ����� ��ü�� ����� ����� �� ��ü�� ������ ���� Ÿ���� Ȯ���ϰ�
		// ����ȯ �ϴ� ������ ���� �� �ִ�.

		List<Music> list = new ArrayList(1);
		list.add(new Music("������", "�ٽô� �������"));
		list.add(new Music("���", "������"));
		list.add(new Music("Ʈ���̽�", "TT"));
		// list.add("��");

		for (Music m : list) {
			System.out.println(m);
		}
	}
}
