package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {

	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}

	}

	public void insertMember() {

		// 1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리

		// 2. 아이디를 입력 받아 MemberControllerdml checkId() 메소드로 전달 >> 결과 값

		// 2_1. 결과 값이 null이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
		// “동일한 아이디가 존재합니다. 회원등록 실패” 출력
		// 2_2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
		// 나머지 회원 정보 입력 받도록 (비밀번호, 이름, 나이,
		// 성별, 이메일) // 입력 받은 정보를 Member의 매개변수 생성자를 이용하여 객체 생성 후
		// MemberController insertMember() 메소드로 전달
		// “성공적으로 회원 등록이 되었습니다.” 출
		if (mc.getMemberCount() == mc.SIZE) {
			return;
		}

		System.out.println("원하시는 아이디를 입력해주세요 ");
		String userId = sc.nextLine();

		if (mc.checkId(userId) != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			return;
		}

		System.out.println("비밀번호 : ");
		String userPwd = sc.nextLine();
		System.out.println("이름 : ");
		String userName = sc.nextLine();
		System.out.println("나이: ");
		int userAge = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("이메일 : ");
		String userEmail = sc.nextLine();

		mc.insertMember(new Member(userId, userPwd, userName, userAge, gender, userEmail));
		System.out.println("성공적으로 회원 등록이 되었습니다.");
	}

	public void searchMember() {

		while (true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println("검색 내용 : ");
			String search = sc.nextLine();

			// 1. MemberController의 searchMember() 메소드로 menu와 search 문자열 전달 >> 결과 값

			// 1_1. 결과 값이 null인 경우 즉, 검색 결과가 없는 경우 >> “검색된 결과가 없습니다.” 출력
			if (mc.searchMember(menu, search) == null) {
				System.out.println("검색된 결과가 없습니다.");
			}
			// 1_2. 결과 값이 null이 아닌
			// 경우 즉, 검색 결과가 존재하는 경우 >> 회원 정보 출력
			else {
				System.out.println(mc.searchMember(menu, search).toString());
			}

		}

	}

	public void updateMember() {

		while (true) {
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println("검색 내용 : ");
			String search = sc.nextLine();

		}

	}

	public void deleteMember() {

		System.out.println("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();

		// 1. MemberController의 checkId()에 userId 전달 >> 결과 값 (m : Member)
		if (mc.checkId(userId) == null) {
			// 1_1. 결과 값이
			// null인 경우 “삭제할 회원이 존재하지 않습니다.” 출력
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		} else {
			// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력
			System.out.println(mc.checkId(userId).toString());

			// “정말 삭제하시겠습니까? (y/n) : “ >> 키보드로 입력 받기
			System.out.println("정말 삭제하시겠습니까? (y/n) : ");
			char r = sc.next().charAt(0);
			sc.nextLine();
			if (r == 'y' || r == 'Y') {
				// 대소문자 구분 없이 ‘Y’인 경우 MemberController의 deleteMember()에 userId 전달
				mc.deleteMember(userId);
				// “회원의 정보가 삭제되었습니다.” 출력
				System.out.println("회원의 정보가 삭제되었습니다.");
			}

		}

	}

	public void printAllMember() {

		for (int i = 0; i < mc.getMem().length; i++) {
			if (mc.getMem()[i] != null) {
				System.out.println(mc.getMem()[i].toString());
			}

		}

	}

	public void sortMember() {

		Member[] sortMem = null;

		while (true) {

			System.out.println("====== 회원 정보 정렬 ======");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림추산 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9:
				System.out.println("이전 메뉴로");
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}

			// 반복문을 통해 sortMem 객체 배열 출력
			for (int i = 0; i < mc.getMemberCount(); i++) {
				if (sortMem != null) {
					System.out.println(sortMem[i].toString());
				}
			}
		}

	}
}
