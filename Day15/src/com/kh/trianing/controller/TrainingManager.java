package com.kh.trianing.controller;

import java.util.Scanner;

import com.kh.trianing.model.vo.Trainee;

public class TrainingManager {

	private Trainee[] trainees;
	private final int CUTLINE = 60;
	Scanner sc = new Scanner(System.in);

	public TrainingManager(int num) {

		// 막힌부분 (객체배열 초기화)
		this.trainees = new Trainee[num];

	}

	public void insertTrainees() {

		System.out.println("===훈련생 정보 입력===");

		// 막힌부분

		for (int i = 0; i < trainees.length; i++) { // trainees.length <전체학생수

			System.out.println("훈련생 이름 : ");
			String name = sc.nextLine();

			System.out.println("클래스 이름 : ");
			char classRoom = sc.nextLine().charAt(0);

			System.out.println("점수 : ");
			int score = sc.nextInt();
			sc.nextLine();

			trainees[i] = new Trainee(name, classRoom, score);

		}

	}

	public int sumScore() {
		int sum = 0;
		for (int i = 0; i < trainees.length; i++) {
			sum += trainees[i].getScore(); // <- 이부분 다시한번 확인요망
		}
		return sum;

	}

	public double avgScore() {
		// 평균은 전체합 / 학생수
		double avg = 0.0;
		avg = this.sumScore() / trainees.length; // 이 부분 다시 확인
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
		System.out.println("=== 훈련생 전체 정보 출력===");

		System.out.println("점수 합계 : " + sumScore());
		System.out.println("점수 평균 : " + avgScore());

		// 아래 다시한번 확인
		for (int i = 0; i < trainees.length; i++) {
			System.out.println(trainees[i].inform());
			System.out.println(passFail(i));
		}
	}

	public void searchTrainee() {
		System.out.println("검색할 사람 이름 : ");
		String name = sc.nextLine();

		// 아래 다시한번 확인
		// 이 부분 이해 x

		for (int i = 0; i < trainees.length; i++) {
			if (name.equals(trainees[i].getName())) {
				System.out.println(trainees[i].inform());
				System.out.println("통과여부 : " + passFail(i));
			}
		}

	}

}
