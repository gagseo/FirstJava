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
		System.out.println("쿠폰이 3장 발급 되었습니다.");
	}

	@Override
	public void openLuckyBox(int num) {
		int luckyNum = (int)( Math.random() * 5) + 1;
	
		if(luckyNum ==num) {
			System.out.println("축하합니다 쿠폰이 1장 발급되었습니다.");
			this.setCouponCount(this.getCouponCount() + 1);
		}else {
			System.out.println("아쉽네요 행운의 숫자는 " + luckyNum + "입니다.");
		}
	}

}
