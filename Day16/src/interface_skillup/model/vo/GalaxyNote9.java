package interface_skillup.model.vo;

public class GalaxyNote9 extends SmartPhone {

	public GalaxyNote9() {

	}

	@Override
	public void charge() {
		System.out.println("��� ����, ��� ���� ����");

	}

	@Override
	public void makeaCall() {
		System.out.println("��ȣ�� ������ ��ȭ��ư�� ����");

	}

	@Override
	public void takeaCall() {
		System.out.println("���� ��ư�� ����");

	}

	@Override
	public void picture() {
		System.out.println("1200�� ��� ī�޶�");

	}

	@Override
	public void touch() {
		System.out.println("������, ������ ����");

	}

	@Override
	public void printMaker() {
		System.out.println("�Ｚ");

	}

	@Override
	public String toString() {
		return "GalaxyNote9 []";
	}

}
