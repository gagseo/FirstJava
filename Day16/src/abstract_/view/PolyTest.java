package abstract_.view;

import abstract_.model.vo.parents.Child1;
import abstract_.model.vo.parents.Child2;
import abstract_.model.vo.parents.Parent;

public class PolyTest {

	public void polyTest() {

		Parent p2 = new Child1();
		// System.out.println(p2.parentInfo());
		// System.out.println(((Child1) p2).firstChildInfo());
		System.out.println();

		Child1 c1 = new Child1();
		Child1 c11 = new Child1(1, 3, 4);
		// System.out.println(c1.firstChildInfo());
		// System.out.println(c11.firstChildInfo());

		Child2 c2 = new Child2();
		Child2 c22 = new Child2(5, 7, 9);
		// System.out.println(c2.secondChildInfo());
		// System.out.println(c22.secondChildInfo());

		int[][] iArr = new int[4][1];
		iArr[0][0] = 1;
		iArr[1][0] = 1;

		Object iArr2 = iArr; // 가능

		Parent[] pArr = new Parent[4];
		pArr[0] = c1;
		pArr[1] = c11;
		pArr[2] = c2;
		pArr[3] = c22;

		for (int i = 0; i < pArr.length; i++) {
			// 오버라이딩을 통해 info를 일괄적으로 가져온다.

			System.out.println(pArr[i].info());
			// 오버라이딩 해주면 조건문이 필요없어진다.
			// if (pArr[i] instanceof Child1) { // instanceof 는 뒤에 메소트에 있는 인스턴스를 확인
			// System.out.println(((Child1) pArr[i]).firstChildInfo());
			// } else {
			// System.out.println(((Child2) pArr[i]).secondChildInfo());
			// }
		}

		// // Parent p0, 부모타입 변수로 부모 클래스 인스턴스화
		// Parent p0 = new Parent(); // 가능
		//
		// // 위의 코드가 가능할 시 p0을 자식 타입으로 다운 캐스팅
		// // Child1 pp = (Child1) p0; // 실행시 에러발생
		//
		// // 다운캐스팅 : 현재 변수의 타입을 후손타입인 타입으로 변경
		// // 다운캐스팅 ex) Child1 p0 = (Child1)p0;
		// // 업캐스팅 ex) Parent ppp = pp; //업캐스팅은 생략가능
		//
		// // Parent c0, 부모타입 변수로 자식 클래스 인스턴스화
		// Parent c0 = new Child1(); // 가능
		//
		// // 위의 코드가 가능할 시 c0을 자식 타입으로 다운캐스팅
		// Child1 cc = (Child1) c0; // 가능
		//
		// // Child p1, 자식타입 변수로 부모클래스 인스턴스화
		// // Child1 c1 = new Parent(); // 불가능
		//
		// // 위의 코드가 가능할 시 p1을 부모타입 변수로 업케스팅
		// // X
		// // 업케스팅 : 현재 변수의 타입을 선조 타입으로 변경
		//
		// // Child c1, 자식타입 변수로 자식클래스 인스턴스화
		// Child1 c2 = new Child1(); // 가능
		//
		// // 위의 코드가 가능할 시 c1을 부모타입 변수로 업케스팅
		// Parent cc2 = c2;
	}

}
