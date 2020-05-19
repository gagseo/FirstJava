package inherititance.inheritance.view;

import inherititance.inheritance.model.vo.before.Desktop;
import inherititance.inheritance.model.vo.before.SmartPhone;
import inherititance.inheritance.model.vo.before.Tv;

public class BeforeTest {

	public void beforeTest() {

		// �ν��Ͻ�����
		Desktop d = new Desktop("�Ｚ", "s-01", "��Ʈ��", 2000000, "intel", 5000, 8, "window10", true);
		SmartPhone s = new SmartPhone("���", "a-04", "���̻�", 1300000, "�㺥ġ", 1024, 4, "ios", "KT");
		Tv t = new Tv("LG", "l-11", "LGƼ��", 3500000, 46);

		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());

		// ����ũž, ����Ʈ��, �ڷ����� ��ü�� ����� ���� �� �� �ִ�.
		// �� ������ Ŭ�������� �������� �ʵ�� �޼��尡 ����
		// �̷��� �ߺ��� �θ�Ŭ������ �����Ͽ� �ߺ��ڵ���� ������ �� �ְ�
		// ������ ���������� �� ���� ���� ������ �ʿ���� �θ�Ŭ������ �����ϸ�
		// ��ü������ �ݿ��� �ȴ�.

		// Desktop, SmartPhone, Tv�� ���ÿ� ������ �ִ� �ʵ�
		// = ������, ��ǰ��ȣ, ��ǰ��, ���� -> Product
		// Desktop, SmartPhone�� ���ÿ� ������ �ִ� �ʵ�
		// = cpu, hdd, ram, �ü�� --> Computer

	}
}
