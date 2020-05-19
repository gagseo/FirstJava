package com.kh.array;

import java.util.Arrays;

public class ArrayUtill {

	// *중요*

	public int[] sort(int[] iArr) {
		// public void arrayUtill(){}
		//

		// 앞의 인덱스가 뒤의 인덱스보다 클 경우 자리 교환
		// 아닐경우 그대로있음

		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr.length - i - 1; j++) {

				if (iArr[j] > iArr[j + 1]) {
					int temp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = temp;
				}
			}
		}
		 return iArr;
	}

	// 첫번째 매개변수로 넘겨받은 int배열에,
	// 두번째 매개변수로 넘겨받은 숫자를 추가하는 메서드를 작성하시오.

	public int[] add(int[] iArr, int data) {

		int[] res = new int[iArr.length + 1];

		for (int i = 0; i < iArr.length; i++) {
			res[i] = iArr[i];
		}

		res[res.length - 1] = data;

		return res;

	}

	// addAll
	// 첫번째 매개변수로 넘겨받은 int배열의 뒤에
	// 두번째 매개변수로 넘겨받은 int배열을 합쳐서 반환하는 메서드를 작성하시오.

	public int[] addAll(int[] iArr, int[] secondArr) {

		int[] res = new int[iArr.length + secondArr.length];

		for (int i = 0; i < iArr.length; i++) {
			res[i] = iArr[i];
		}

		for (int j = iArr.length; j < res.length; j++) {
			res[j] = secondArr[j - iArr.length];
		}
		return res;

	}

	// 2.set
	// 첫번째 매개변수로 넘겨받은 배열의
	// (두번째 매개변수로 넘겨받은)인덱스에
	// (세번째 매개변수로 넘겨받은)값을 덮어쓰는 코드를 작성하세요.
	public void set(int[] iArr, int idx, int data) {

		// 1. 입력받은 iArr배열을 res값으로 복사한다

		// 1-1. iArr의 길이는 res의 길이와 같다

		// 2. res배열의 입력받은 i번째 인덱스의 값을 입력받은 data로 재초기화한다.
		iArr[idx] = data;
		// void로 받아서 위에 반환형이 없다.
	}

	// 3.subArr
	// 첫번째 매개변수로 넘겨받은 배열을
	// (두번째 매개변수로 넘겨받은)인덱스 부터 <=
	// (세번째 매개변수로 넘겨받은)인덱스 전 까지 잘라낸 배열로 반환하는 메서드를
	// 작성하세요.
	// int[] data = new int[]{1,2,3,4,5}
	// subArr(data,0,2) -> [1,2]
	// subArr(data,1,3) -> [2,3]
	public int[] subArr(int[] iArr, int fromIdx, int toIdx) {

		int[] res = new int[toIdx - fromIdx];
		int j = 0;
		for (int i = fromIdx; i < toIdx; i++) {
			res[j] = iArr[i];
			j++;
			System.out.println(iArr[i]);
		}

		return res;
	}

	// 4.remove
	// 첫번째 매개변수로 넘겨받은 배열의
	// (두번째 매개변수로 넘겨받은)인덱스에 해당하는 값을 삭제하고
	// 배열의 크기를 다시 조정해 반환하는 메서드를 작성하시오.
	// int[] data = new int[]{1,2,3,4,5}
	// remove(data,2) ->[1,2,4,5]

	public int[] remove(int[] iArr, int idx) {

		int[] res = new int[iArr.length - 1];

		for (int i = 0; i < res.length; i++) {

			if (i < idx) {
				res[i] = iArr[i];
			} else {
				res[i] = iArr[i + 1];
			}
		}
		return res;
	}
}
