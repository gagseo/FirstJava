package com.kh.demensionArray;

import java.util.Scanner;

public class Homework {
	Scanner sc = new Scanner(System.in);

	public void calculator() {
		// 1.정수 두 개와 연산문자 하나를 키보드로 입력받음
		System.out.println("첫번째 정수 : ");
		// 2. 두 정수값은 int 변수에 저장
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("연산 문자 : ");
		// 3. 연산문자는 char 변수에 저장
		char op = sc.next().charAt(0);
		int res = 0;
		// 4.switch문 사용
		switch (op) {
		case '+':
			// :연산 문자가 '+'이면, 두 정수의 합 계산
			res = num1 + num2;
			break;
		case '-':
			// '-'면, 두 정수의 차 계산
			res = num1 - num2;
			break;
		case 'x':
		case 'X':
			res = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				// '/'이면, 두정수의 나누기 몫
				res = num1 / num2;
			} else {
				// 단, 나누는 수(두번쨰 정수)가 0이면
				// "0으로 나눌 수 없습니다."출력되게 하고,
				System.out.println("0으로 나눌 수 없습니다.");
				res = 0;
				// 결과값 0 처리함
			}
			break;
		default:
			System.out.println("정확한 연산자를 입력해주세요.");
		}
		// 을 계산처리 후
		// 5. 결과 출력
		// 예> 10 x 20 = 200
		System.out.println(num1 + " " + op + " " + num2 + " = " + res);

	}

	public void totalCalculator() {
		// 1. 키보드로 두 개의 정수를 입력 받음
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		// 3
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		// 5
		// 2. 두 정수 중 작은 값을 시작값으로,
		// 큰 값을 종료값으로 사용함
		int sum = 0;
		// 3.작은 값에서 큰 값까지 정수의 합계를 구함
		// i = 3 4 5
		if (num2 > num1) {
			for (int i = num1; i < num2 + 1; i++) {
				sum = sum + i;
			}
		} else if (num1 > num2) {
			for (int i = num2; i < num1 + 1; i++) {
				sum = sum + i;
			}
		} else if (num1 == num2) {
			sum = num1;
		}
		System.out.println(sum);
		// for 문 사용

		// 4.합계 출력 처리
	}

	public void profile() {

		// 처리내용 : 신상정보들을 자료형에 맞춰 변수에 기록하고,
		// 변수에 기록된 값을 출력 확인함.
		// 실행내용 : 콘솔창에 본인의 신상정보가 출려되게 함
		// 출력 예)
		// 이름 : 홍길동
		String name = "서호영";
		// 나이 : 26 세
		int age = 35;
		// 성별 : 남자
		String gender = "남자";
		// 성격 : 고집불통
		String e = "성실";

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + e);

	}

	public void sungjuk() {
		// 처리내용 :
		// 변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고 변수값을 화면에 출력 확인함
		// =>변수
		// 학생이름(String)
		System.out.println("이름을 입력하세요. : ");
		String name = sc.nextLine();
		// 학년(int)
		System.out.println("학년을 입력하세요. : ");
		int g = sc.nextInt();
		sc.nextLine();
		// 반(int)
		System.out.println("반을 입력하세요. : ");
		int c = sc.nextInt();
		// 번호(int)
		System.out.println("번호를 입력하세요. : ");
		int n = sc.nextInt();
		// 성별(M/F)(char)//문자열로 입력받은후, 문자 하나 분리해야함
		System.out.println("성별을 입력하세요.(M/F) : ");
		char gender = sc.next().charAt(0);
		// 삼항연산자 이용하여 남학생, 여학생 구분하라
		String genderName = gender == 'm' ? "남학생"
				: gender == 'M' ? "남학생" : gender == 'f' ? "여학생" : gender == 'F' ? "여학생" : "잘못입력하셨습니다";
		// 성적(int)
		System.out.println("성적을 입력하세요. : ");
		int s = sc.nextInt();
		sc.nextLine();

		// 학점(char)
		char h = 'A';

		// 점수가 90이상이면 학점을 A로 처리
		if (s >= 90) {
			h = 'A';
		}
		// 80 이상 90 미만 B
		else if (s >= 80) {
			h = 'B';
		}
		// 70이상 80 미만 C
		else if (s >= 70) {
			h = 'C';
		}
		// 60이상 70미만 D
		else if (s >= 60) {
			h = 'D';
		}
		// 60미만 F
		else {
			h = 'F';
		}
		// 출력 예)
		System.out.println(g + "학년" + c + "반" + n + "번" + genderName + " 점수는" + (double) s + "점 이고," + h + "학점 입니다.");
		// 3학년 2반 25번 남학생 홍길동의 점수는 95.5이고, A 학점 입니다.
		// **남학생/여학생은 성별 변수의 값을 사용해서 삼항연산자로 처리함

	}

	public void printStarNumber() {
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num > 0) {
			// 입력받은 수를 줄로 하는 모양을 만든다.
			for (int i = 1; i < num + 1; i++) {
				for (int j = 1; j < i + 1; j++) {

					if (i == j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println("");

			}

		}

		// ex) 정수 하나 입력 : 5

		// 1
		// *2
		// **3
		// ***4
		// ****5
		// ==========
		else {
			System.out.println("양수가 아닙니다.");
		}
		// 정수 하나 입력 : -5
		// 양수가 아닙니다.
	}

	public void sumRandomNumber() {
		// 1~100 사이의 정수중 임의의 정수를 하나 발생시켜(Math.Random())
		// 1부터 발생된 정수까지의 합계를 구하여 출력함

		int num = (int) (Math.random() * 100 + 1);
		int sum = 0;
		System.out.println(num);
		for (int i = 1; i < num + 1; i++) {
			sum += i;
		}

		System.out.println(sum);

	}

	public void shutNumber() {

		// 구현내용:
		// 1.두개의 주사위가 만들어 낼 수 있는 모든 경우의 수중(random)
		boolean rgx = true;
		int num = 0;
		int a = 0;
		// System.out.println(num);

		do {
			num = (int) (Math.random() * 10 + 2);

			System.out.println("몇일까요? 맞춰보세요 : ");
			a = sc.nextInt();

			if (num == a) {
				System.out.println("맞췄습니다.");
			} else {
				System.out.println("정답은 " + num + "입니다.");
				System.out.println("틀렸습니다.");
				System.out.println("=======================");
			}
			System.out.println("계속 하시겠습니까?(y/n)");
			char g = sc.next().charAt(0);

			if (g == 'y' || g == 'Y') {
				rgx = true;

			} else if (g == 'n' || g == 'N') {
				System.out.println("종료");
				break;
			} else {
				System.out.println("정확하게 입력하세요.");
			}
		} while (rgx);

		// 2.두 주사위 눈의 합이 입력된 수와 같은 경우 "맞췄습니다." 출력
		// 3.입력 값과 다르면 "틀렸습니다." 출력함

		// 4.정담 유무 출력 후 계속하시겠습니까?(y/n) 출력
		// 5."계속하시겠습니까?(y/n):"에서 'n' 또는 'N'입력시 반복 종료 됨
		// 6. do ~ whlie 문으로 반복되게 함
	}

}
