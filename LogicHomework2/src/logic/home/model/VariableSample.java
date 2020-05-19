package logic.home.model;

import java.util.Scanner;

public class VariableSample {

	Scanner sc = new Scanner(System.in);

	boolean b1;
	byte bNum;
	short sNum;
	int iNum;
	long lNum;
	float fNum;
	double dNum;
	char c;
	String s;

	public void myProfile() {

		String myName = "서호영";
		int myAge = 35;

		System.out.println("저의 이름은 " + myName + "이며 나이는 " + myAge + " 입니다.1");

	}

	public void emplnformation() {

		System.out.println("사원의 정보를입력하세요");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 : (M/F)");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("주소 : ");
		String address = sc.nextLine();

		System.out
				.println("사원의 이름은 " + name + " 이며 " + "나이는 " + age + " 이며 " + gender + " 이며 " + address + " 에 거주 중이다.");

	}

	public void defaultValue() {

		System.out.println("boolean의 초기값은 ? " + b1);
		System.out.println("byte의 초기값은 ? " + bNum);
		System.out.println("short의 초기값은 ? " + sNum);
		System.out.println("int의 초기값은 ? " + iNum);
		System.out.println("long의 초기값은 ? " +lNum);
		System.out.println("float의 초기값은 ? " + fNum);
		System.out.println("double의 초기값은 ? " + dNum);
		System.out.println("char의 초기값은 ? " + c);
		System.out.println("String의 초기값은 ? " + s);
	}

}
