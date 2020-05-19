package poly;

public class Person {

	public int age = 10;

	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}

	public void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
}

// 객체지향의 흐름은
// 1.유연성확보 -> 추상화를 통해서
// 2.현실의 객체 -> 캡슐화(타입) -> 상속(타입을 공유)
// 2-1 다형성(추상화) 설계방법을 -> 디자인패턴을 만들어 놈