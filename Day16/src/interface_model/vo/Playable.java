package interface_model.vo;

//�������̽��� ������ �Ծ��̴�.
//��ü������ �������� ������ Ÿ�����δ� ����� �����ϴ�.
//�������̽��� ���� ����� �����ϴ�.
public interface Playable extends Playable2, Playable3 {// ���߻���� �����ϴ�

	// public static final �� �ڵ����� ����
	int test = 10;

	// �������̽��� ��� �޼���� ���� �߻� �޼����̴�.
	// ��� �������̽��� �޼���� ���������� public abstract �̴�.
	void play();
}
