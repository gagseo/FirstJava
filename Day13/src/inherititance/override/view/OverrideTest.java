package inherititance.override.view;

import inherititance.override.model.vo.Book;

public class OverrideTest {

	public void overrideTest() {

		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다.", "고래", 300);

		// toString 메서드
		System.out.println(bk1.toString());
		System.out.println(bk2);

		// equals 메서드
		System.out.println(bk1.equals(bk2));

		// hashCode 메서드
		System.out.println(bk1.hashCode());

	}
}
