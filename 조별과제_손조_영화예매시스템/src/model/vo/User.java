package model.vo;

public class User {

	private String name;
	private int age;
	private int birth;
	private int couponCount;

	public User() {

	}

	public User(String name, int age, int birth, int couponCount) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.couponCount = couponCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	@Override
	public String toString() {
		return "User [이름 = " + name + ", 나이 = " + age + ", 생년 = " + birth + ", 쿠폰수 = " + couponCount + "]";
	}

}
