package logic.home.model;

import java.util.Scanner;

public class IfSample {

	Scanner sc = new Scanner(System.in);

	public void maxNumber() {

		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

	}

	public void minNumber() {

		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		if (num1 < num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

	}

	public void threeMaxMin() {

		System.out.println("첫번째 정수 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("두번째 정수 : ");
		int b = sc.nextInt();
		System.out.println("세번째 정수 : ");
		int c = sc.nextInt();
		sc.nextLine();

		if (a < b && b < c) {

			System.out.println("결과:" + a + " " + c);

		} else if (a < c && c < b) {

			System.out.println("결과:" + a + " " + b);

		} else if (b < a && a < c) {

			System.out.println("결과:" + b + " " + c);

		} else if (b < c && c < a) {

			System.out.println("결과:" + b + " " + a);

		} else if (c < a && a < b) {

			System.out.println("결과:" + c + " " + b);

		} else if (c < b && b < a) {

			System.out.println("결과:" + c + " " + a);

		} else

			System.out.println("세 숫자 중 2개이상이 같음");

	}

	public void checkEven() {

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	public void isPassFail() {

		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int mat = sc.nextInt();
		sc.nextLine();

		double avg = (kor + eng + mat) / 3.0;
		String res = "";

		if (avg >= 60) {
			if (kor < 40 || eng < 40 || mat < 40) {
				if (kor < 40) {
					res = "국어";
				}
				if (eng < 40) {
					res = "영어";
				}
				if (mat < 40) {
					res = "수학";
				}
				System.out.println(res + " 과락으로 불합격입니다.");
			} else {
				System.out.println("평균이상으로 합격입니다.");
			}
		} else {
			System.out.println("평균이하로 불합격입니다.");
		}

	}

	public void scoreGrade() {

		System.out.println("점수를 입력 : ");
		int score = sc.nextInt();
		sc.nextLine();
		String grade = "";

		if (score > 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}

		} else if (score > 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}

		} else if (score > 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score > 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}
		System.out.println("당신의 점수는 " + score + "점 이고 " + grade + "학점 입니다.");
	}

	public void checkPlusMinusZero() {

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("입력하신 값은 0 입니다.");
		}

	}

	public void whatCaracter() {

		System.out.println("문자 하나를 입력 : ");
		char c = sc.next().charAt(0);

		if (c >= 65 && c < 90) {
			System.out.println("알파벳 대문자입니다.");
		} else if (c >= 97 && c <= 122) {
			System.out.println("알파벳 소문자입니다.");
		} else if (c >= 48 && c <= 57) {
			System.out.println("숫자 입니다.");
		} else {
			System.out.println("기타 문자입니다.");
		}

	}

}
