package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {

	public final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];

	{

		mem[0] = new Member("user01", "pass01", "������", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "�̼���", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "������", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "�����ҹ�", 57, 'M', "yeon@gmil.com");
		mem[4] = new Member("user05", "pass05", "�Ż��Ӵ�", 45, 'F', "shin@naver.com");
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
		// ���̵�� �˻��� ����� ���� ���� �ʱ�ȭ
		// mem ���� �Ű������� ���޹��� userId�� ������ ���̵� ������ �ִ� ȸ���� m�� ����
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		return m;
		// m ����

	}

	public void insertMember(Member m) {

		// �Ű������� ���޹��� ȸ�������� mem ��ü�� �߰�
		mem[memberCount++] = m;
		// memberCount 1����
	}

	public Member searchMember(int menu, String search) {

		Member searchMember = null;

		// �Ű������� ���޹��� search ���ڿ��� menu ��ȣ�� ����
		switch (menu) {
		// 1 �� ��� ���̵�� �˻� �� ����� searchMember�� �����ϰ�
		case 1:
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				}
			}
			break;
		// 2 �� ��� �̸����� �˻� �� ����� searchMember�� �����ϰ�
		case 2:
			for (int i = 0; i < memberCount; i++) {

				if (mem[i].getName().equals(search)) {
					searchMember = mem[i];
				}

			}
			break;
		// 3 �� ��� �̸��Ϸ� �˻� �� ����� searchMember�� �����ϰ�
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

		// �Ű������� ���޹��� m ȸ���� ���� ������ update ���ڿ��� menu�� ����
		switch (menu) {

		case 1:// 1 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� ��й�ȣ�� update ���ڿ��� ����
			m.setUserPwd(update);
			break;
		case 2:// 2 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� �̸��� update ���ڿ��� ����
			m.setName(update);
			break;
		case 3:// 3 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� �̸����� update ���ڿ��� ����
			m.setEmail(update);
			break;

		}

	}

	public void deleteMember(String userId) {

		// �Ű������� ���޹��� userId�� mem�� �����ϴ� ��� �ش� ȸ�� ���� ��
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				for (int j = i; j < memberCount; j++) {
					mem[j] = mem[j + 1]; // +1 �� ���ִ°� �߿�
				}
				// memberCount 1 ����
				memberCount--;
			}
		}
		// ���� �ε��� ��ü���� ������ �� ĭ�� ������ �̵� ��Ŵ
		// ���� �� NullPointerException �߻��� �� ���� -> �ֱ׷��� �����غ��� �ذ��Ͻÿ�

	}

	public Member[] sortIdAsc() {

		// ������ ȸ�� ��ü �迭(mem)�� �������� �ʰ� ���� ���ĵ� ������� �����ֱ� ����
		// ������ �迭 �����ؼ� ��� (clone(),System.arraycopy() �� �� �ϳ� ����ؼ� ����) Member copy[];

		Member copy[] = mem.clone();

		for (int i = 0; i < memberCount; i++) {
			// copy �迭�� ���̵� �� �������� ���� ���� --> HINT : compareTo() �޼ҵ� Ȱ��
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[j].getUserId().compareTo(copy[i].getUserId()) < 0) {
					mem[i] = copy[i];
					copy[i] = copy[j];
					copy[j] = mem[i];
				}
			}
		}

		// copy �ּ� �� ����
		return copy;
	}

	public Member[] sortIdDesc() {

		Member[] copy = mem.clone();
		Member[] a = new Member[memberCount];

		for (int i = 0; i < memberCount; i++) {
			// copy �迭�� ���̵� �� �������� ���� ���� --> HINT : compareTo() �޼ҵ� Ȱ��
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[j].getUserId().compareTo(copy[i].getUserId()) > 0) {

					a[i] = copy[i];
					copy[i] = copy[j];
					copy[j] = a[i];

				}
			}
		}

		// copy �ּ� �� ����
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

		// copy �ּ� �� ����
		return copy;
	}
}
