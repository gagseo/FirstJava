package com.kh.scan;

import java.util.Scanner;

public class MyScanner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("int를 입력해주세요 : ");
		int iNum = scanner.nextInt();
		
		
		System.out.println("float를 입력해주세요 : ");
		float fNum = scanner.nextFloat();
		
		
		System.out.println("double을 입력해주세요 : ");
		double dNum = scanner.nextDouble();
		
		
		System.out.println("char를 입력해주세요 : ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();
//		맨마지막에 nextLine을 쓰면 이전에도 nextLine을 써줘야 한다.
		
		System.out.println("String을 입력해주세요 : ");
		String str = scanner.nextLine();
//		nextLine() 사용시 앞전 내용을 출력못한다.
		
		
		System.out.println("입력한 값은 : " + iNum);
		System.out.println("입력한 float은 : " + fNum);
		System.out.println("입력한 double은 : " + dNum);
		System.out.println("입력한 char는 : " + ch);
		System.out.println("입력한 String은 : " + str);

		
	}
}
