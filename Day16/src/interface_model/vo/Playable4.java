package interface_model.vo;

//인터페이스는 공통의 규약이다.
//객체생성은 못하지만 참조형 타입으로는 사용이 가능하다.
//인터페이스는 다중 상속이 가능하다.
public interface Playable4 {

	// public static final 이 자동으로 붙음
	int test = 10;

	// 인터페이스의 모든 메서드는 공개 추상 메서드이다.
	// 모든 인터페이스의 메서드는 묵시적으로 public abstract 이다.
	void play4();
}
