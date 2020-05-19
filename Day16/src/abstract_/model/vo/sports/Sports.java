package abstract_.model.vo.sports;

//추상클래스
//abstract메서드가 0개이상 존재하는 클래스
//abstract메서드가 하나라도 있다면 반드시 추상클래스여야 한다.
//추상클래슬르 상속받는 클래스는 반드시 abstract메서드를 오버라이딩 해야한다.
//객체 생성은 할 수 없지만, 참조형 타입으로는 사용이 사능하다.
public abstract class Sports {

	private int people;

	public Sports() {
	}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

	// 스포츠마다 규칙은 있지만 내용은 다름
	// 추상메서드로 생성

	public abstract void rule(); //추상메서드라 바디부분이 없다.
}
