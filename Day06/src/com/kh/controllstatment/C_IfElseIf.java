package com.kh.controllstatment;

import java.util.Scanner;

public class C_IfElseIf {

	// if else if 는 다중조건을 줄 수 있는 문법이다.
	// [표현식]
	// if(조건식){
	// 실행문1
	// }else if (조건식2){
	// 실행문2
	// }else{
	// 실행문2
	// }

	// 점수를 하나 입력받아서 등급을 나누어 점수와 등급을 출력하시오
	// 등급은, 90점이상은 A등급
	// 90점 미만 80점 이상은 B등급
	// 80점 미만 70점 이상은 C등급
	// 70점 미만 60점 이상은 D등급
	// 60점 미만은 F등급

	Scanner sc = new Scanner(System.in);

	public void testIfElseIf() {

		System.out.println("점수를 입력하세요 : ");
		int point = sc.nextInt();
		String grade = "";

		if (point >= 90) {
			grade = "A";
		} else if (point >= 80) {
			grade = "B";
		} else if (point >= 70) {
			grade = "C";
		} else if (point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("당신의 점수는 " + point + "이고" + "등급은 " + grade + "입니다.");

	}

	public void testIfElseIf2() {
		// 위의 문제에서
		// 각 등급별 점수가 중간점수 이상일때 (ex 95점)
		// 등급에 "+"라는 문자를 추가하여 출력하세요.
		// 예) 95점 이상은 등급이 A+로 출력되게 함.

		System.out.println("점수를 입력하세요 : ");
		int point = sc.nextInt();
		String grade = "";

		if (point >= 90) {
			if (point >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}

		} else if (point >= 80) {
			if (point >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}

		} else if (point >= 70) {
			if (point >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}

		} else if (point >= 60) {
			if (point >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}

		} else {
			grade = "F";
		}
		System.out.println("당신의 점수는 " + point + "이고" + "등급은 " + grade + "입니다.");
	}

	// 실습문제
	// 3. 국어, 영어, 수학 점수를 각각 입력 받고 평균 50점이상,
	// 각 과목 35점 이상일때 "합격입니다."를 출력하고
	// 평균이 50점 미만인 경우"평균 점수 미달로 불합격입니다."를
	// 출력하며, 평균은 50점 이상이지만 과락(35점 미만)인 과목이 있으면
	// "(해당과목)과락으로 불합격입니다."를 출력하세요.

	public void testIfElseIf3() {

		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int mat = sc.nextInt();

		double ave = (kor + eng + mat) / 3.0;

		if (kor >= 35 && eng >= 35 && mat >= 35) {
			System.out.printf("평균이 %.2f 점으로 합격입니다.", ave);
		} else if (kor >= 35 && eng >= 35) {
			System.out.println("수학과목 과락으로 불합격입니다.");
		} else if (kor >= 35 && mat >= 35) {
			System.out.println("영어과목 과락으로 불합격입니다.");
		} else if (eng >= 35 && mat >= 35) {
			System.out.println("국어과목 과락으로 불합격입니다.");
		} else if (kor >= 35) {
			System.out.println("수학,영어과목 과락으로 불합격입니다.");
		} else if (eng >= 35) {
			System.out.println("국어,수학과목 과락으로 불합격입니다.");
		} else if (mat >= 35) {
			System.out.println("국어, 영어과목 과락으로 불합격입니다.");
		} /*
			 * else { System.out.println("두과목 과락으로 불합격입니다."); }
			 */
		else {
			System.out.println("평균점수 미달로 불합격입니다.");
		}
	}

	public void testIfElseIf4() {

		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int mat = sc.nextInt();

		double ave = (kor + eng + mat) / 3.0;
		String res = "";

		if (ave >= 50) {
			if (kor < 35 || eng < 35 || mat < 35) {
				if (kor < 35) {
					res = "국어 ";
				}
				if (eng < 35) {
					res = "영어 ";
				}
				if (mat < 35) {
					res = "수학 ";
				}
				System.out.println(res + "과락으로 불합격입니다.");
			} else {
				System.out.println("평균이상으로 합격입니다.");
			}
		} else {
			System.out.println("평균이하로 불합격입니다.");
		}

	}
}