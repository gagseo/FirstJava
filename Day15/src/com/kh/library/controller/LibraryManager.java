package com.kh.library.controller;

import com.kh.library.model.vo.AniBook;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.CookBook;
import com.kh.library.model.vo.Member;

public class LibraryManager {

	private Member mem = null;
	private Book[] bList = new Book[5];

	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}

	public LibraryManager() {

	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	// ȸ�� ���۷��� �ּҰ� ����
	public Member myPage() {

		return mem;
	}

	// ��������Ʈ �ּҰ� ����
	public Book[] selectAll() {

		return bList; // bList�� ����ִ� �ּҰ��� ��ȯ���ش�
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

	// ����
	public int rentBook(int index) {
		int result = 0;

		// �����ڵ�
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

		// ���ڵ�
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
