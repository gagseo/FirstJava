package com.kh.operator;

import java.util.Scanner;

public class OperatorPrac {

	Scanner sc = new Scanner(System.in);

	// 실습문제
	// 3. 주민번호를 입력받고 삼항 연산자를 이용하여 미성년자인지 성인인지, 또 남자인지 여자인지 구분하여 출력하세요.
	// (2019년 기준 1999생부터 법적 성년)
	// 주민번호를 입력하세요(-포함) : 950101-2000000
	// 성인여자
	// 주민번호를 입력하세요(-포함) : 100101-1000000
	// 미성년남자
	public void optest01() {

		System.out.println("주민등록 번호를 입력해주세요");
		String info = sc.nextLine();

		// 첫번째 자리
		char first = info.charAt(0); // 성인인지 미성년인지
		char second = info.charAt(7); // 남성인지 여성인지

		String gender = second == '1' || second == '3' ? "남자" : "여자";
		String age = first == '0' || first == '1' ? "미성년자" : "성인";

		System.out.println(age + gender);

	}
	// 실습문제
	// 구현내용: 국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
	// 각 점수를 키보드로 입력받고,
	// 합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
	// 세 과목의 점수와 평균을 가지고 합격 여부 처리함
	// 합격의 조건 : 세 과목의 점수가 각각 40점이상이면서, 평균이 60점 이상이면 합격, 아니면 불합격 처리함

	public void optest02() {
		int kor;
		int eng;
		int mat;
		int total;
		double aver;

		System.out.println("국어 점수를 입력하세요. : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요. : ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요. : ");
		mat = sc.nextInt();

		total = kor + eng + mat;
		aver = total / 3.0;

		String res = (kor >= 40 && eng >= 40 && mat >= 40 && aver >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + res + " 입니다.");
	}

	public void optest03() {
		// 국어(정수), 영어(정수), 수학(정수), 변수를 선언하고 각 점수를 키보드로 입력받은뒤,
		// 합계(국어 + 영어 + 수학)와 평균(합계 / 3.0)을 계산하고,
		// 세 과목의 평균에 따라 성적 등급을 부여해라.
		// 등급 : 평균 90점 이상 : A
		// 평균 80점 이상 : B
		// 평균 70점 이상 : C
		// 평균 60점 이상 : D
		// 평균 60점 미만 : F
		int kor;
		int eng;
		int mat;
		int total;
		double aver;

		System.out.println("국어 점수를 입력하세요. : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요. : ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요. : ");
		mat = sc.nextInt();

		total = kor + eng + mat;
		aver = total / 3.0;

		String res = aver >= 90 ? "A" : aver >= 80 ? "B" : aver >= 70 ? "C" : aver >= 60 ? "D" : "F";
		System.out.printf("평균 %.2f 점이며 " + res + "등급입니다.", aver);
	}
}