package inherititance.override.view;

import inherititance.override.model.vo.Book;

public class OverrideTest {

	public void overrideTest() {

		Book bk1 = new Book("������ ����", "������", 100);
		Book bk2 = new Book("Ī���� ���� ���߰� �Ѵ�.", "��", 300);

		// toString �޼���
		System.out.println(bk1.toString());
		System.out.println(bk2);

		// equals �޼���
		System.out.println(bk1.equals(bk2));

		// hashCode �޼���
		System.out.println(bk1.hashCode());

	}
}
