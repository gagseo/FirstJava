package inherititance.inheritance.view;

import inherititance.inheritance.model.vo.before.Desktop;
import inherititance.inheritance.model.vo.before.SmartPhone;
import inherititance.inheritance.model.vo.before.Tv;

public class BeforeTest {

	public void beforeTest() {

		// 인스턴스생성
		Desktop d = new Desktop("삼성", "s-01", "울트라", 2000000, "intel", 5000, 8, "window10", true);
		SmartPhone s = new SmartPhone("사과", "a-04", "아이뽄", 1300000, "긱벤치", 1024, 4, "ios", "KT");
		Tv t = new Tv("LG", "l-11", "LG티비", 3500000, 46);

		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());

		// 데스크탑, 스마트폰, 텔레비전 객체를 만들어 관리 할 수 있다.
		// 이 세가지 클래스에는 공통적인 필드와 메서드가 존재
		// 이러한 중복을 부모클래스로 설계하여 중복코드들을 제거할 수 있고
		// 수정과 유지보수를 할 때도 각각 수정할 필요없이 부모클래스만 수정하면
		// 전체적으로 반영이 된다.

		// Desktop, SmartPhone, Tv가 동시에 가지고 있는 필드
		// = 제조사, 상품번호, 상품명, 가격 -> Product
		// Desktop, SmartPhone이 동시에 가지고 있는 필드
		// = cpu, hdd, ram, 운영체제 --> Computer

	}
}
