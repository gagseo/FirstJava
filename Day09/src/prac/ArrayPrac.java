package prac;

import java.util.Arrays;

import com.kh.array.ArrayUtill;

// **중요**

public class ArrayPrac {

	// java.lang.Math 클래스의 random() 메서드를 사용해 보세요.
	// java api 사용하기
	public void lottoNumbers() {
		double f = 0;
		for (int i = 0; i < 6; i++) {

			// 여기에서 사용해서
			// Math의 random() 메서드의 결과값을 10번 출력해주세요.

			f = Math.random();
			System.out.println(f);
		}
	}

	// java.lang.Math 클래스의 random() 메서드를 사용해 보세요.
	// 1~45 사이의 수 중에서 랜덤으로 숫자 6개를 선택해주는
	// 로또 프로그램을 만들어보자.
	public int[] lottoNumbers1() {
		int[] nums = new int[6];

		for (int i = 0; i < 6; i++) {
			int d = (int) (Math.random() * 45) + 1;
			nums[i] = d;
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		ArrayUtill arrayUtill = new ArrayUtill();
		arrayUtill.sort(nums);
		// 정렬코드

		return nums;
	}

	/*
	 * [문제2] - 구현내용 : 1. 크기가 10인 int[] 선언, 할당함 2. 1~100사이의 임의의 정수를 발생시켜, 배열공간에 기록함
	 * 배열[인덱스] = (int)(Math.random() * 100) + 1; 3. 기록된 10개의 값중 가장 큰 값과 자가장 작은 값을
	 * 알아내어 4.출력확인
	 */

	public void pracTest() {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {

			int d = (int) (Math.random() * 100) + 1;

			nums[i] = d;
		}
		System.out.println(Arrays.toString(nums));
		ArrayUtill au = new ArrayUtill();
		au.sort(nums); // 정렬하는 기능 가져다 씀
		System.out.println("가장 작은 값 : " + nums[0]);
		System.out.println("가장 큰 값 : " + nums[9]);

	}

	public void test2() {

		String data = "abcdefgh";
		// 문자열 data에서 cde를 추철해 출력해주세요.
		// java.lang.String 클래스의 subString 메서드를 활용하시면 됩니다.

		System.out.println(data.substring(2, 5));

		// String number = "123456"
		// number를 int형으로 변환해주세요.
		// java.lang.Integer 클래스의 parseInt 메서드
		// parse : 데이터를 다른형태로 바꾸는 작업

		String number = "123456";
		System.out.println("문자열 number는 : " + Integer.parseInt(number));
		System.out.println("문자열 number는 : " + Integer.parseInt(number) / 2);

	}

	// 크기가 10인 int[]을 3개 생성하세요.
	// 각 int[]을 1~95 사이의 난수로 초기화 하세요.
	// 3개의 int[]에 들어가 있는 숫자들 중에서 7번째 8번째 9번째로 작은 수를 출력하세요.

	public void test3() {

		// 1. int[]배열을 선언하여 초기화
		int[] num1 = new int[10];
		int[] num2 = new int[10];
		int[] num3 = new int[10];
		// 2. int[] 배열을 초기화 하여 돌려주기
		for (int i = 0; i < num1.length; i++) {
			// 2-1. 난수로 초기화
			// (int)(Math.random(num1)*95)+1;
			num1[i] = (int) (Math.random() * 95) + 1;
			num2[i] = (int) (Math.random() * 95) + 1;
			num3[i] = (int) (Math.random() * 95) + 1;
		}
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));
		ArrayUtill au = new ArrayUtill();
		int[] num4 = au.addAll(num1, num2);
		System.out.println(Arrays.toString(num4));
		int[] num5 = au.addAll(num3, num4);
		System.out.println(Arrays.toString(num5));

		// 4. 정렬 후
		au.sort(num5);
		// 4-1.3개의 int[] 중 7번째 8번째 9번째 작은수를 찾아서
		int[] res = au.subArr(num5, 6, 9);
		System.out.println(Arrays.toString(num5));
		// 5. 출력
		System.out.println(Arrays.toString(res));
	}

}
