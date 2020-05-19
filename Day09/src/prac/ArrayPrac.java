package prac;

import java.util.Arrays;

import com.kh.array.ArrayUtill;

// **�߿�**

public class ArrayPrac {

	// java.lang.Math Ŭ������ random() �޼��带 ����� ������.
	// java api ����ϱ�
	public void lottoNumbers() {
		double f = 0;
		for (int i = 0; i < 6; i++) {

			// ���⿡�� ����ؼ�
			// Math�� random() �޼����� ������� 10�� ������ּ���.

			f = Math.random();
			System.out.println(f);
		}
	}

	// java.lang.Math Ŭ������ random() �޼��带 ����� ������.
	// 1~45 ������ �� �߿��� �������� ���� 6���� �������ִ�
	// �ζ� ���α׷��� ������.
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
		// �����ڵ�

		return nums;
	}

	/*
	 * [����2] - �������� : 1. ũ�Ⱑ 10�� int[] ����, �Ҵ��� 2. 1~100������ ������ ������ �߻�����, �迭������ �����
	 * �迭[�ε���] = (int)(Math.random() * 100) + 1; 3. ��ϵ� 10���� ���� ���� ū ���� �ڰ��� ���� ����
	 * �˾Ƴ��� 4.���Ȯ��
	 */

	public void pracTest() {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {

			int d = (int) (Math.random() * 100) + 1;

			nums[i] = d;
		}
		System.out.println(Arrays.toString(nums));
		ArrayUtill au = new ArrayUtill();
		au.sort(nums); // �����ϴ� ��� ������ ��
		System.out.println("���� ���� �� : " + nums[0]);
		System.out.println("���� ū �� : " + nums[9]);

	}

	public void test2() {

		String data = "abcdefgh";
		// ���ڿ� data���� cde�� ��ö�� ������ּ���.
		// java.lang.String Ŭ������ subString �޼��带 Ȱ���Ͻø� �˴ϴ�.

		System.out.println(data.substring(2, 5));

		// String number = "123456"
		// number�� int������ ��ȯ���ּ���.
		// java.lang.Integer Ŭ������ parseInt �޼���
		// parse : �����͸� �ٸ����·� �ٲٴ� �۾�

		String number = "123456";
		System.out.println("���ڿ� number�� : " + Integer.parseInt(number));
		System.out.println("���ڿ� number�� : " + Integer.parseInt(number) / 2);

	}

	// ũ�Ⱑ 10�� int[]�� 3�� �����ϼ���.
	// �� int[]�� 1~95 ������ ������ �ʱ�ȭ �ϼ���.
	// 3���� int[]�� �� �ִ� ���ڵ� �߿��� 7��° 8��° 9��°�� ���� ���� ����ϼ���.

	public void test3() {

		// 1. int[]�迭�� �����Ͽ� �ʱ�ȭ
		int[] num1 = new int[10];
		int[] num2 = new int[10];
		int[] num3 = new int[10];
		// 2. int[] �迭�� �ʱ�ȭ �Ͽ� �����ֱ�
		for (int i = 0; i < num1.length; i++) {
			// 2-1. ������ �ʱ�ȭ
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

		// 4. ���� ��
		au.sort(num5);
		// 4-1.3���� int[] �� 7��° 8��° 9��° �������� ã�Ƽ�
		int[] res = au.subArr(num5, 6, 9);
		System.out.println(Arrays.toString(num5));
		// 5. ���
		System.out.println(Arrays.toString(res));
	}

}
