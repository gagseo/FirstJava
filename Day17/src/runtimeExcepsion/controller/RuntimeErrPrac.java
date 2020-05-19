package runtimeExcepsion.controller;

import java.util.Scanner;

public class RuntimeErrPrac {

	Scanner sc = new Scanner(System.in);

	public void classNArray() {

		try {
			// ClassCastException
			Object obj = new int[10];
			// String str = (String) obj;

			// ArrayIndexOutOfBoundsException
			int[] arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;
			// arr[2] = 3;

			// NullPointerException
			// String str2 = null;
			// int length = str2.length();

			// } catch (ClassCastException cc) {
			// System.out.println("ClassCastException");
			// } catch (ArrayIndexOutOfBoundsException ae) {
			// System.out.println("ArrayIndexOutOfBoundsException");
			// } catch (NullPointerException ne) {
			// System.out.println("NullPointerException");

		} catch (Exception cc) { // 모든 예외상황 처리

			cc.printStackTrace();

		} finally {
			System.out.println("실행이 잘 될까?");
		}

		System.out.println("여기도 실행이 잘될까?");
	}

	// 1~100사이의 난수를 하나 발생시키세요.
	// 사용자로 부터 하나의 수를 입력 받으세요.
	// 발생시킨 난수를 사용자로부터 입력받은 수로 나누세요.
	// 사용자가 입력한 수가 0일 경우 "0이 아닌 값을 입력하시오" 경고차을 출력하세요.
	// try-catch-finally 문을 사용하세요.
	// 반드시 프로그램이 종료됩니다. 라는 안내문을 작성해주세요
	// (finally 키워드 사용)
	public void artitEx() {

		int uNum = (int) (Math.random() * 100) + 1;
		System.out.println("하나의 수를 입력하세요.");
		int num = sc.nextInt();
		int nNum = uNum / num;

		try {
			System.out.println("발생한 난수는 : " + uNum);
			System.out.println("나눈 값은 : " + nNum);

		} catch (ArithmeticException ae) {

			System.out.println("0이 아닌 값을 입력하시오.");
			System.out.println(ae);

		} finally {
			System.out.println("반드시 프로그램이 종료됩니다.");

		}

	}
}
