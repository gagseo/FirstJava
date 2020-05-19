package com.kh.object.encapsulation;

public class KookBabDreeper {

	// �߻�ȭ
	// ���α׷����� �ʿ��� �������� ��� �� �Ӽ����� �����ϰ�
	// ���ʿ��� �͵��� �����ϴ� ����
	// �����ϰ��� �ϴ� ���α׷��� � ���α׷��̰�, � ������ ������ �������
	// �� �����ؾ��Ѵ�.
	// ����� ���� �ְ�, �Ӽ��� �ִ�.

	// ĸ��ȭ
	// Ŭ���� ������ �������(�ʵ�)�� Ŭ���� �ۿ��� �������� ���ϰ� �ϴ� ��.
	// ��������� private�� �����ϴ� ���� ��Ģ�̴�.
	// ��������� ���� �츮�� ���� �ǹ̸� ����� ���� getter / setter �޼���� �����Ѵ�.

	private String foodName;
	private int foodPrice;
	public final static int kookBabPrice = 5000;

	public KookBabDreeper() {
		// kookBabPrice = 2000; < final �����ϸ� ������

		System.out.println(Integer.MAX_VALUE);
	}

	// �����ڵ� �����ε��� �����ϴ�.
	public KookBabDreeper(String foodName, int foodPrice) {
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		// KookBabDreeper.kookBabPrice = kookBabPrice;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	// public void setKookBabPrice(int kookBabPrice) {
	// KookBabDreeper.kookBabPrice = kookBabPrice;
	// }

	// public int getKookBabPrice() {
	// return kookBabPrice;
	// }

	public void dreep() {
		int kookBabCnt = foodPrice / kookBabPrice;
		if (kookBabCnt == 0) {
			kookBabCnt = 1;
		}
		System.out.println("��?" + foodName + "?" + foodName + "??" + "\n  �� ���ְ� " + foodName + " ���� �ٿ��� �߲��� ���� "
				+ kookBabCnt + " �׸�, ����� �԰���"); // \n �ٺ���
	}
}
