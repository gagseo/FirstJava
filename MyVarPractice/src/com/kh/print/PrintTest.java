package com.kh.print;

public class PrintTest {
	public static void main(String[] args) {
		System.out.print("안녕하세요");
		System.out.println("자바 수업입니다");
//		ln은 줄바꿈이다.
		System.out.print("print 함수 입니다");
//------------------------------------------------------------------		
//		System.out.printf를 쓸때는 뒤에 ','를 꼭 사용해야한다.
//		그말인즉 형식을 지정해주는 것이다.
		System.out.printf("\n%-5d\n", 1);
//		%d 형식은 정수
//		출력되는 형식에 5를 써주면 오른쪽으로 5칸만큼 뒤에 정렬하고
//		-5라고 쓰면 왼쪽으로 5칸만큼 정렬한다
		
		System.out.printf("%.2f\n", 1.1);
//		%f 형식은 실수
//		첫째자리 까지만 나오게 하려면.1
//		둘째자리 까지 나오게 하려면 .2
//		
		
		System.out.printf("%c\n", 'A');
//		%c 형식은 문자
		
		System.out.printf("%s\n", "Hello Java");
//		%s 형식은 문자열
//		\n은 줄바꿈
		
		System.out.printf("%b", true);
//		%b 형식은 논리형
		
		
	}
}
