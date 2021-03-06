package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {

	public final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];

	{

		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmil.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {

		return memberCount;

	}

	public Member[] getMem() {

		return mem;
	}

	public Member checkId(String userId) {

		Member m = null;
		// 아이디로 검색된 결과를 담을 변수 초기화
		// mem 에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		return m;
		// m 리턴

	}

	public void insertMember(Member m) {

		// 매개변수로 전달받은 회원정보를 mem 객체에 추가
		mem[memberCount++] = m;
		// memberCount 1증가
	}

	public Member searchMember(int menu, String search) {

		Member searchMember = null;

		// 매개변수로 전달받은 search 문자열을 menu 번호에 따라
		switch (menu) {
		// 1 인 경우 아이디로 검색 후 결과를 searchMember에 대입하고
		case 1:
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				}
			}
			break;
		// 2 인 경우 이름으로 검색 후 결과를 searchMember에 대입하고
		case 2:
			for (int i = 0; i < memberCount; i++) {

				if (mem[i].getName().equals(search)) {
					searchMember = mem[i];
				}

			}
			break;
		// 3 인 경우 이메일로 검색 후 결과를 searchMember에 대입하고
		case 3:
			for (int i = 0; i < memberCount; i++) {

				if (mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
				}
			}
			break;
		}

		return searchMember;

	}

	public void updateMember(Member m, int menu, String update) {

		// 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라
		switch (menu) {

		case 1:// 1 인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
			m.setUserPwd(update);
			break;
		case 2:// 2 인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경
			m.setName(update);
			break;
		case 3:// 3 인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경
			m.setEmail(update);
			break;

		}

	}

	public void deleteMember(String userId) {

		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				for (int j = i; j < memberCount; j++) {
					mem[j] = mem[j + 1]; // +1 을 해주는게 중요
				}
				// memberCount 1 감소
				memberCount--;
			}
		}
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜그런지 생각해보고 해결하시오

	}

	public Member[] sortIdAsc() {

		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(),System.arraycopy() 둘 중 하나 사용해서 복사) Member copy[];

		Member copy[] = mem.clone();

		for (int i = 0; i < memberCount; i++) {
			// copy 배열을 아이디 별 오름차순 정렬 진행 --> HINT : compareTo() 메소드 활용
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[j].getUserId().compareTo(copy[i].getUserId()) < 0) {
					mem[i] = copy[i];
					copy[i] = copy[j];
					copy[j] = mem[i];
				}
			}
		}

		// copy 주소 값 리턴
		return copy;
	}

	public Member[] sortIdDesc() {

		Member[] copy = mem.clone();
		Member[] a = new Member[memberCount];

		for (int i = 0; i < memberCount; i++) {
			// copy 배열을 아이디 별 내림차순 정렬 진행 --> HINT : compareTo() 메소드 활용
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[j].getUserId().compareTo(copy[i].getUserId()) > 0) {

					a[i] = copy[i];
					copy[i] = copy[j];
					copy[j] = a[i];

				}
			}
		}

		// copy 주소 값 리턴
		return copy;

	}

	public Member[] sortAgeAsc() {

		Member[] copy = mem.clone();
		Member[] a = new Member[memberCount];

		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[j].getAge() - (copy[i].getAge()) < 0) {

					a[i] = copy[i];
					copy[i] = copy[j];
					copy[j] = a[i];
				}
			}
		}

		return copy;
	}

	public Member[] sortAgeDesc() {

		Member[] copy = mem.clone();
		Member[] a = new Member[memberCount];

		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[j].getAge() - (copy[i].getAge()) > 0) {

					a[i] = copy[i];
					copy[i] = copy[j];
					copy[j] = a[i];
				}
			}
		}

		return copy;
	}

	public Member[] sortGenderDesc() {

		Member[] copy = mem.clone();
		Member[] a = new Member[memberCount];

		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[j].getGender() - (copy[i].getGender()) > 0) {
					a[i] = copy[i];
					copy[i] = copy[j];
					copy[j] = a[i];
				}
			}
		}

		// copy 주소 값 리턴
		return copy;
	}
}
