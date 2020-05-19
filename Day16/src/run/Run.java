package run;

import abstract_.model.vo.sports.BasketBall;
import abstract_.model.vo.sports.FootBall;
import abstract_.model.vo.sports.Sports;
import abstract_.view.PolyTest;
import interface_model.vo.Family;
import interface_model.vo.Father;
import interface_model.vo.Playable;
import interface_skillup.jo_project.veiw.MainMenu;
import interface_skillup.model.vo.GalaxyNote9;
import interface_skillup.model.vo.SmartPhone;
import interface_skillup.model.vo.V40;

public class Run {

	public static void main(String[] args) {

		// //PolyTest class를 run
		// PolyTest pt = new PolyTest();
		// pt.polyTest();

		// Sports class를 다형성을 적용해서 run하라
		// // 강사 코드
		// BasketBall bb = new BasketBall();
		// FootBall fb = new FootBall();
		// Sports[] sArr = new Sports[2];
		// sArr[0] = bb;
		// sArr[1] = fb;
		// for (int i = 0; i < sArr.length; i++) {
		// sArr[i].rule();
		// }
		// // 내 코드
		// Sports[] s = new Sports[2];
		// s[0] = new BasketBall();
		// s[1] = new FootBall();
		// for (int i = 0; i < s.length; i++) {
		// s[i].rule();
		// }

		// // interface 패키지
		// // 가족 타입으로 아버지 클래스 인스턴스화
		// Family father = new Father("홍당무", 70, 15);
		// System.out.println("아버지의 이름 : " + father.getName());
		// // 아버지 건강
		// System.out.println("아버지의 건강 : " + father.getHealth());
		// // 아버지가 식사를 한다.
		// father.eat();
		// // 아버지 건강 출력
		// System.out.println("아버지의 건강 : " + father.getHealth());
		// // 아버지가 잠을 잔다.
		// father.sleep();
		// // 아버지 건강 출력
		// System.out.println("아버지의 건강 : " + father.getHealth());
		// // "아버지가 아기랑 놀아준다" 문구 출력
		// System.out.println("아머지가 아기랑 놀아준다.");
		// // 아버지 play메서드 호출
		// ((Father) father).play(); // Father로 형변환(다운캐스팅)을 해주던지
		// ((Playable) father).play(); // Playable에 인터페이스해서 가져다 사용-
		// // 아버지 건강출력
		// System.out.println("아버지의 건강 : " + father.getHealth());

		// // interface_skillup 패키지
		// GalaxyNote9 gn9 = new GalaxyNote9();
		// V40 v40 = new V40();
		// SmartPhone[] sp = new SmartPhone[2];
		// sp[0] = gn9;
		// sp[1] = v40;
		// for (int i = 0; i < sp.length; i++) {
		// sp[i].printMaker();
		// sp[i].makeaCall();
		// sp[i].takeaCall();
		// sp[i].touch();
		// sp[i].charge();
		// sp[i].picture();
		//
		// System.out.println();
		// }

		// jo_project 패키지
		MainMenu mm = new MainMenu();
		mm.mainMenu();
	}
}
