package com.kh.print;

import java.util.Scanner;

public class TestPrint1 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("����� �̸��� : ");
	String name = sc.nextLine();
	
	System.out.println("����� ���̴� : ");
	int age = sc.nextInt();
	sc.nextLine();
	
	System.out.println("����� Ű�� : ");
	double tall = sc.nextDouble();
	
	System.out.println("����� �����Դ� : ");
	double weight = sc.nextDouble();
	
	
	System.out.println("����� �̸��� : " + name);
	System.out.println("����� ���̴�" + age);
	System.out.println("����� Ű�� " + (int)tall);
	System.out.printf("����� �����Դ� : %.1f\n", weight);
	
			
}
}
