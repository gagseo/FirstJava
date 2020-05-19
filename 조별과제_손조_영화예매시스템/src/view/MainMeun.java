package view;

import java.util.Scanner;

import controller.MovieManager;
import model.vo.User;

public class MainMeun {

	Scanner sc = new Scanner(System.in);
	MovieManager mm = new MovieManager();
	int reservationIndex = 0;

	public MainMeun() {

		{
			System.out.println("======KH영화관에 오신 것을 환영합니다======");
			System.out.println();
			System.out.println("★영화관의 30% 할인 혜택");
			System.out.println("1. 영화관람일과 사용자의 생일이 같은 경우");
			System.out.println("2. 영화가 11시 이전 시작 영화일 경우");
			System.out.println("3. 할인쿠폰을 보유하고 계신 경우");
			System.out.println("모든 할인은 중복 불가하며 할인에 해당하는 경우 \n 함께 관람하는 모두가 할인된 가격을 적용받습니다.");
			System.out.println("================================");

		}

	}

	public void mainMeun() {

		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("생일(4자리 ex)1114)을 입력하세요 : ");
		int birth = sc.nextInt();
		sc.nextLine();
		System.out.println("가지고 계신 쿠폰의 갯수를 입력해주세요 : ");
		int couponCount = sc.nextInt();
		sc.nextLine();

		mm.insertMember(new User(name, age, birth, couponCount));
		// 회원 이름, 나이, 생일, 할인쿠폰 수를 입력받아 mm의 insertMember() 메소드로 생성된 회원 객체의 주소 값 전달, 무한
		// 반복메뉴 출력하여 각 메뉴
		// 버튼 클릭시 해당하는 메소드 호출(클래스 구조 참고
		System.out.println("입력하신 정보로 회원등록이 완료되었습니다.");

		while (true) {

			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 영화 전체 조회");
			System.out.println("3. 영화 예약하기");
			System.out.println("4. 영화별 잔여좌석 확인하기");
			System.out.println("9. 프로그램 종료하기");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println(mm.myPage());
				break;
			case 2:
				mm.selectAll();
				break;
			case 3:
				mm.selectAll();
				reservation();
				break;
			case 4:
				mm.checkSeat();
				break;
			case 9:
				break;
			}
			if (input == 9) {
				System.out.println("프로그램을 종료합니다.");
			}
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
		}
	}

	public void reservation() {

		System.out.println("예약 할 영화 번호를 선택하세요.");
		reservationIndex = sc.nextInt();
		sc.nextLine();
		int result = mm.reservation(reservationIndex - 1);
		if (result == 0) {
			System.out.println("성공적으로 예약되었습니다.");
		} else if (result == 1) {
			System.out.println("아동과 함께 예약이 불가능합니다.");
		} else if (result == 2) {
			System.out.println("나이제한으로 인해 예약이 불가능합니다.");
		} else if (result == 3) {
			System.out.println("할인된 가격으로 영화가 예매되었습니다.");
		}

		// 예약 할 영화번호를 입력 받아 mm의 reservation() 메소드로 전달, 결과값을 result로 받아 경우에 따라 각각 해당하는
		// 출력문 출력 (클래스 구조 참고)

	}
}
