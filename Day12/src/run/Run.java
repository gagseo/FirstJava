package run;

import java.util.Arrays;

import inherit.SubClass;
import inherit.SuperClassProduct;
import init.Constructor;
import init.Init;
import init.InitTest;
import overLoading.Circle;
import overLoading.Figure;
import overLoading.Rectangle;

public class Run {

	public static void main(String[] args) {

		/*
		 * Figure f = new Figure(); //Figure�� heap������ �÷��� Rectangle rec = new
		 * Rectangle(); // Rectangle�� heap������ �÷ȴ� // rec�� Rectangle�� �ּҰ� �� �ִ�.
		 * 
		 * rec.setHeight(15); rec.setWidth(20); // ���� rec�� ���� ���� �ٶ󺸰��ִ�. // �Ű�������
		 * ���������ϰ��ִ�. f.area(rec);
		 * 
		 * Circle c = new Circle(); c.setRadius(10); f.area(c); // ���⼭ c�� �ּҰ��� �Ѱ��ذ�
		 */

		// Constructor cs = new Constructor("��ȣ��", 12345);

		// Init i = new Init();

		// InitTest it = new InitTest();
		// it.method1();

		/*
		 * // SubClass sc = new SubClass(); // <-�Ʒ� �θ�Ŭ����(SuperClassProduct)�ε� �ٷ� �� �ִ�.
		 * SuperClassProduct sc = new SubClass(); // �� �θ�Ŭ������ �ڽ�Ŭ�������� �����ִ°��� Ÿ�Ե� �ִ�.
		 * 
		 * sc.product(); sc.productPrice(); sc.productStock();
		 * System.out.println(sc.superMember);
		 */
		
		

	}

}
