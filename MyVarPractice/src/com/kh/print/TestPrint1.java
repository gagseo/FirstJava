package com.kh.print;

import java.util.Scanner;

public class TestPrint1 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("당신의 이름은 : ");
	String name = sc.nextLine();
	
	System.out.println("당신의 나이는 : ");
	int age = sc.nextInt();
	sc.nextLine();
	
	System.out.println("당신의 키는 : ");
	double tall = sc.nextDouble();
	
	System.out.println("당신의 몸무게는 : ");
	double weight = sc.nextDouble();
	
	
	System.out.println("당신의 이름은 : " + name);
	System.out.println("당신의 나이는" + age);
	System.out.println("당신의 키는 " + (int)tall);
	System.out.printf("당신의 몸무게는 : %.1f\n", weight);
	
			
}
}
