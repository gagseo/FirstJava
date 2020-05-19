package com.kh.object.encapsulation;

public class KookBabDreeper {

	// 추상화
	// 프로그램에서 필요한 공톡적인 기능 및 속성들을 추출하고
	// 불필요한 것들을 제거하는 과정
	// 구현하고자 하는 프로그램이 어떤 프로그램이고, 어떤 목적을 가지고 만드는지
	// 잘 생각해야한다.
	// 기능이 먼저 있고, 속성이 있다.

	// 캡슐화
	// 클래스 내부의 멤버변수(필드)에 클래스 밖에서 접근하지 못하게 하는 것.
	// 멤버변수에 private을 선언하는 것이 원칙이다.
	// 멤버변수의 값이 우리가 정한 의미를 벗어나는 것을 getter / setter 메서드로 제어한다.

	private String foodName;
	private int foodPrice;
	public final static int kookBabPrice = 5000;

	public KookBabDreeper() {
		// kookBabPrice = 2000; < final 선언하면 에러남

		System.out.println(Integer.MAX_VALUE);
	}

	// 생성자도 오버로딩이 가능하다.
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
		System.out.println("뭐?" + foodName + "?" + foodName + "??" + "\n  그 돈주고 " + foodName + " 먹을 바에야 뜨끈한 국밥 "
				+ kookBabCnt + " 그릇, 든든히 먹고말지"); // \n 줄변경
	}
}
