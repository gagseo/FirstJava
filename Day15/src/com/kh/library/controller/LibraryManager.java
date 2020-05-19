package com.kh.library.controller;

import com.kh.library.model.vo.AniBook;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.CookBook;
import com.kh.library.model.vo.Member;

public class LibraryManager {

	private Member mem = null;
	private Book[] bList = new Book[5];

	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public LibraryManager() {

	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	// 회원 레퍼런스 주소값 리턴
	public Member myPage() {

		return mem;
	}

	// 도서리스트 주소값 리턴
	public Book[] selectAll() {

		return bList; // bList에 담겨있는 주소값을 반환해준다
	}

	public Book[] searchBook(String keyword) {
		Book[] searchList = new Book[bList.length];
		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				searchList[count] = new Book(bList[i].getTitle(), bList[i].getAuthor(), bList[i].getPublisher());
				count++;
			}
		}
		return searchList;

	}

	// 복습
	public int rentBook(int index) {
		int result = 0;

		// 강사코드
		if (bList[index] instanceof AniBook) {
			if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook) bList[index]).isCoupon()) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}

		// 내코드
		// if (((Book) bList[index]) instanceof CookBook) {
		// if (((CookBook) bList[index]).isCoupon()) {
		// result = 2;
		// mem.setCouponCount(mem.getCouponCount() + 1);
		//
		// } else {
		// result = 0;
		//
		// }
		// }
		// if (((Book) bList[index]) instanceof AniBook) {
		// if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
		// result = 1;
		// } else {
		// result = 0;
		//
		// }
		// }
		return result;
	}

}
