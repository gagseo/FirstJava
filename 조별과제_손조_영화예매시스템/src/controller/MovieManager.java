package controller;

import java.util.Scanner;

import model.vo.AdultM;
import model.vo.DisCountable;
import model.vo.FamilyM;
import model.vo.Movie;
import model.vo.User;

public class MovieManager {

	Scanner sc = new Scanner(System.in);

	private User user = null;
	private Movie[] mArr = new Movie[4];

	{
		mArr[0] = new AdultM("���˿��� ����", 15000, "����", 50, 19, 19);
		mArr[1] = new FamilyM("�ڹ����� ����ִ�", 10000, "����", 30, 9);
		mArr[2] = new AdultM("������", 15000, "�׼�", 50, 23, 19);
		mArr[3] = new FamilyM("�ܿ�ձ�", 10000, "�ִϸ��̼�", 30, 14);

	}

	public MovieManager() {

	}

	public void insertMember(User user) {
		this.user = user;
	}

	public User myPage() {

		return user;
	}

	public Movie[] selectAll() {

		for (int i = 0; i < mArr.length; i++) {
			System.out.println((i + 1) + "�� ��ȭ : " + mArr[i].toString());
		}
		return mArr;

	}

	public int checkaNum() {

		System.out.println("�����Ͻ� ������ ���ڸ� �Է��ϼ��� : ");
		int aNum = sc.nextInt();
		sc.nextLine();

		return aNum;

	}

	public int checkkNum() {
		System.out.println("�����Ͻ� ����� ���ڸ� �Է��ϼ��� : ");
		int kNum = sc.nextInt();
		sc.nextLine();

		return kNum;

	}

	public int reservation(int index) {

		int result = 0;

		if (mArr[index] instanceof AdultM) {
			if (checkkNum() > 0 && checkaNum() > 0) {
				result = 1; // �Ƶ�����
			} else if (((AdultM) mArr[index]).getAccessAge() > user.getAge()) {
				result = 2; // ��������
			}
		} else {

			if (mArr[index].getmTime() < 12 || user.getBirth() == DisCountable.today || user.getCouponCount() > 0) { // ��������
				result = 3;
				// ���Ÿ� ��û�� ��ȭ�� �ε��� ��ȣ�� ������ �ִ� ��ȭ�� �¼����� ������ ��� ��ŭ ���ش�.
				mArr[index].setmSeat(mArr[index].getmSeat() - (checkaNum() + checkkNum()));
			} else {
				// ���Ÿ� ��û�� ��ȭ�� �ε��� ��ȣ�� ������ �ִ� ��ȭ�� �¼����� ������ ��� ��ŭ ���ش�.
				mArr[index].setmSeat(mArr[index].getmSeat() - (checkaNum() + checkkNum()));
				result = 0;
			}

		}
		// instanceof ��� (��ȭ 4���� ��� ����) //���� ���� mArr�� index ��ü�� FamilyM�� �����ϰ� ������ //�ش�
		// ��ȭ�� getmTime()�� ���� �� ȸ���� �����ο��� ���̸� ���Ͽ� ���̰� ���� ��� //result�� 1�� �ʱ�ȭ -> ������������
		// �뿩 �Ұ�(û�ҳ� ���� ��ȭ��!)

		// ���� ���� �� ���, ȸ���� Couponcount�� ���� ���, ���� ���� //���� ���� ��, ȸ���� ���� Couponcount ���� Ȯ��
		// �� ��ȭ Ƽ�� �� ���� Ȯ�� //�������γ� �������� ���, ��ȭ Ƽ�� �� ���ݿ��� ���� �� ��ȭ Ƽ�� �� ���� Ȯ�� //������ ���� ���
		// ��ȭ Ƽ�� �� ���� Ȯ��

		return result;

	}

	public void checkSeat() {

		for (int i = 0; i < mArr.length; i++) {

			System.out.println((i + 1) + "�� ��ȭ�� ���� �¼���" + mArr[i].getmSeat());

		}

	}
}
