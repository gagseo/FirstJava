package com.kh.trianing.controller;

import java.util.Scanner;

import com.kh.trianing.model.vo.Trainee;

public class TrainingManager {

	private Trainee[] trainees;
	private final int CUTLINE = 60;
	Scanner sc = new Scanner(System.in);

	public TrainingManager(int num) {

		// �����κ� (��ü�迭 �ʱ�ȭ)
		this.trainees = new Trainee[num];

	}

	public void insertTrainees() {

		System.out.println("===�Ʒû� ���� �Է�===");

		// �����κ�

		for (int i = 0; i < trainees.length; i++) { // trainees.length <��ü�л���

			System.out.println("�Ʒû� �̸� : ");
			String name = sc.nextLine();

			System.out.println("Ŭ���� �̸� : ");
			char classRoom = sc.nextLine().charAt(0);

			System.out.println("���� : ");
			int score = sc.nextInt();
			sc.nextLine();

			trainees[i] = new Trainee(name, classRoom, score);

		}

	}

	public int sumScore() {
		int sum = 0;
		for (int i = 0; i < trainees.length; i++) {
			sum += trainees[i].getScore(); // <- �̺κ� �ٽ��ѹ� Ȯ�ο��
		}
		return sum;

	}

	public double avgScore() {
		// ����� ��ü�� / �л���
		double avg = 0.0;
		avg = this.sumScore() / trainees.length; // �� �κ� �ٽ� Ȯ��
		return avg;
	}

	public String passFail(int i) {
		String res = "";
		if (trainees[i].getScore() >= CUTLINE) {
			res = "Pass";
		} else {
			res = "Fail";
		}
		return res;
	}

	public void printTrainees() {
		System.out.println("=== �Ʒû� ��ü ���� ���===");

		System.out.println("���� �հ� : " + sumScore());
		System.out.println("���� ��� : " + avgScore());

		// �Ʒ� �ٽ��ѹ� Ȯ��
		for (int i = 0; i < trainees.length; i++) {
			System.out.println(trainees[i].inform());
			System.out.println(passFail(i));
		}
	}

	public void searchTrainee() {
		System.out.println("�˻��� ��� �̸� : ");
		String name = sc.nextLine();

		// �Ʒ� �ٽ��ѹ� Ȯ��
		// �� �κ� ���� x

		for (int i = 0; i < trainees.length; i++) {
			if (name.equals(trainees[i].getName())) {
				System.out.println(trainees[i].inform());
				System.out.println("������� : " + passFail(i));
			}
		}

	}

}
