package logic.home.model;

import java.util.Scanner;

public class IfSample {

	Scanner sc = new Scanner(System.in);

	public void maxNumber() {

		System.out.println("ù��° ���� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("�ι�° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

	}

	public void minNumber() {

		System.out.println("ù��° ���� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("�ι�° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		if (num1 < num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

	}

	public void threeMaxMin() {

		System.out.println("ù��° ���� : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("�ι�° ���� : ");
		int b = sc.nextInt();
		System.out.println("����° ���� : ");
		int c = sc.nextInt();
		sc.nextLine();

		if (a < b && b < c) {

			System.out.println("���:" + a + " " + c);

		} else if (a < c && c < b) {

			System.out.println("���:" + a + " " + b);

		} else if (b < a && a < c) {

			System.out.println("���:" + b + " " + c);

		} else if (b < c && c < a) {

			System.out.println("���:" + b + " " + a);

		} else if (c < a && a < b) {

			System.out.println("���:" + c + " " + b);

		} else if (c < b && b < a) {

			System.out.println("���:" + c + " " + a);

		} else

			System.out.println("�� ���� �� 2���̻��� ����");

	}

	public void checkEven() {

		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

	public void isPassFail() {

		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int mat = sc.nextInt();
		sc.nextLine();

		double avg = (kor + eng + mat) / 3.0;
		String res = "";

		if (avg >= 60) {
			if (kor < 40 || eng < 40 || mat < 40) {
				if (kor < 40) {
					res = "����";
				}
				if (eng < 40) {
					res = "����";
				}
				if (mat < 40) {
					res = "����";
				}
				System.out.println(res + " �������� ���հ��Դϴ�.");
			} else {
				System.out.println("����̻����� �հ��Դϴ�.");
			}
		} else {
			System.out.println("������Ϸ� ���հ��Դϴ�.");
		}

	}

	public void scoreGrade() {

		System.out.println("������ �Է� : ");
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
		System.out.println("����� ������ " + score + "�� �̰� " + grade + "���� �Դϴ�.");
	}

	public void checkPlusMinusZero() {

		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num > 0) {
			System.out.println("����Դϴ�.");
		} else if (num < 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���� 0 �Դϴ�.");
		}

	}

	public void whatCaracter() {

		System.out.println("���� �ϳ��� �Է� : ");
		char c = sc.next().charAt(0);

		if (c >= 65 && c < 90) {
			System.out.println("���ĺ� �빮���Դϴ�.");
		} else if (c >= 97 && c <= 122) {
			System.out.println("���ĺ� �ҹ����Դϴ�.");
		} else if (c >= 48 && c <= 57) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("��Ÿ �����Դϴ�.");
		}

	}

}
