package product.run;

import product.model.vo.Product;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product();
		// 이것은 주석입니다. 실행되지 않습니다.
		// 이것은 주석입니다.
		/*
		 * 다중주석 글의 처음과 끝에만 주석표시가 있는 주석입니다. 방법은 ctrl + shift + /
		 */
		// 주석은 코드의 내용을 메모하기도하고
		// 오류가 나는 곳을 찾을때 사용합니다.
		product.printProduct();
	}
}