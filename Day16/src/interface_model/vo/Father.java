package interface_model.vo;

public class Father extends Family implements Playable, Playable4 {

	private Baby baby = new Baby("홍길동", 1.0, 10, "20200113", 10);

	public Father() {

	}

	public Father(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public void eat() {
		// 아빠는 밥을 먹으면 몸무게 +2
		// 건강도는 + 5
		setWeight(getWeight() + 2);
		setHealth(getHealth() + 5);
	}

	@Override
	public void sleep() {
		// 아빠는 잠을 자면 몸무게 -3
		// 아빠는 잠을 자면 건강도 +10
		setWeight(getWeight() - 3);
		setHealth(getHealth() + 10);

	}

	@Override
	public void play() {
		baby.setHappyPoint(baby.getHappyPoint() + 10);
		setHealth(getHealth() - 5);

		int num = (int) (Math.random() * 4 + 1); // 중요
		if (num < 4) {
			baby.smile(this); // this는
		}
	}

	@Override
	public void play2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play4() {
		// TODO Auto-generated method stub
		
	}

}
