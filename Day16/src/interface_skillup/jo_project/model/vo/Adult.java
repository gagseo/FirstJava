package interface_skillup.jo_project.model.vo;

public class Adult extends Member {

	public Adult() {
		super();
	}

	public Adult(String name, int age, int myMoney, int buyCount, int mileage, int couponCount, int openChance) {
		super(name, age, myMoney, buyCount, mileage, couponCount, openChance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void basicCoupon() {
		System.out.println("������ 3�� �߱� �Ǿ����ϴ�.");
	}

	@Override
	public void openLuckyBox(int num) {
		int luckyNum = (int)( Math.random() * 5) + 1;
	
		if(luckyNum ==num) {
			System.out.println("�����մϴ� ������ 1�� �߱޵Ǿ����ϴ�.");
			this.setCouponCount(this.getCouponCount() + 1);
		}else {
			System.out.println("�ƽ��׿� ����� ���ڴ� " + luckyNum + "�Դϴ�.");
		}
	}

}
