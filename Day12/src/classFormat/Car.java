package classFormat;

//Ŭ����
//[����������][�����] class Ŭ������
//���������� : public, default
//����� : abstract(��ü������ �Ұ����� �߻� Ŭ����, ������ ��ӿ�),
//       final(�ڽ� ������ �Ұ����� Ŭ����, ��ۺҰ��� Ŭ����)
public class Car {

	// ���(�ʵ�) : Ŭ�������� �ż��� �ܺο� �ش��ϴ� ��,
	// ��� ���� : ������� �ʱ�ȭ��� ������ �޼���(�޼��� ��ü�� ����̴�.)
	// ���� : �޼��� ���δ� �����̴�.
	// ���� : ���(�ʵ�)����(Ŭ���� ����, �ν��Ͻ� ����), ��������

	// Ŭ��������
	// �ʵ庯���� static Ű���带 ���̸� Ŭ���������� �ȴ�.
	// �ش� Ŭ������ ���� ��� �ν��Ͻ��� �����ϴ� �����̴�.
	// Ŭ���������� ������ ��� �ش� Ŭ������ ���� ��� �ν��Ͻ��� ������ �ް� �ȴ�.
	private static int maxSpeed;

	// �ν��Ͻ�����
	// nonStatic�� ������ �ν��Ͻ� ������� �Ѵ�.
	// �ν��Ͻ����� ���������� ������ �ִ�.
	private String color;
	private int speed;

	// static �ʱ�ȭ ��
	// Ŭ���� ������ ���� �ʱ�ȭ ���ش�.
	static {
		maxSpeed = 150;
	}

	// �ʱ�ȭ��
	// �ν��Ͻ������� �ʱ�ȭ �Ѵ�.
	// Ŭ������ �ν��Ͻ�ȭ �Ǵ� ������ �ѹ��� ȣ��Ǿ� ������ ���� �ʱ�ȭ ���ش�.
	// �����ں��� ���� ����ȴ�.
	{
		color = "red";
		speed = 0;
	}

	// ������
	// �ܺο��� �����ڸ� ȣ���ϸ� Ŭ������ �ν��Ͻ��� heap�������� �ö󰣴�.
	// �ʵ庯���� ���� �ʱ�ȭ �ϴ� �뵵�� ����Ѵ�.
	// �����ڸ� �ۼ����� ���� ��� jvm�� �ڵ����� ����� �ش�.
	public Car() {
		super();
		this.color = "red";
	}

	// �ŰԺ����� �ִ� ������
	// �����ڵ� �����ε��� �����ϴ�.
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}

	public static int getMaxSpeed() {
		return maxSpeed;
	}

	public static void setMaxSpeed(int maxSpeed) {
		Car.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelPedal() {

		if (getSpeed() > Car.maxSpeed - 10) {
			System.out.println("�ӵ� �ö󰩴ϴ�.");
			setSpeed(getSpeed() + 10);
		} else {
			System.out.println("�̹� �ְ� �ӵ� �Դϴ�.");
		}
	}

	public void breakPedal() {
		// �������� : �޼��� ������ ����� ����
		// ���ǹ��̳� �ݺ��� �ȿ� ����� �͵�(�޼��� ����������) ���������̴�.
		int slow = 10;
		if (getSpeed() - slow > 0) {
			System.out.println("�ӵ��� �پ��ϴ�.");
			setSpeed(getSpeed() - 10);
		} else {
			setSpeed(0);
			System.out.println("������ϴ�.");
		}
	}
}
