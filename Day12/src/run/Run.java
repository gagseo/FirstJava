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
		 * Figure f = new Figure(); //Figure를 heap영역에 올려줌 Rectangle rec = new
		 * Rectangle(); // Rectangle을 heap영역에 올렸다 // rec엔 Rectangle의 주소가 들어가 있다.
		 * 
		 * rec.setHeight(15); rec.setWidth(20); // 위의 rec는 같은 곳을 바라보고있다. // 매개변수를
		 * 얕은복사하고있다. f.area(rec);
		 * 
		 * Circle c = new Circle(); c.setRadius(10); f.area(c); // 여기서 c는 주소값을 넘겨준것
		 */

		// Constructor cs = new Constructor("서호영", 12345);

		// Init i = new Init();

		// InitTest it = new InitTest();
		// it.method1();

		/*
		 * // SubClass sc = new SubClass(); // <-아래 부모클래스(SuperClassProduct)로도 다룰 수 있다.
		 * SuperClassProduct sc = new SubClass(); // 즉 부모클래스가 자식클래스에게 물려주는것은 타입도 있다.
		 * 
		 * sc.product(); sc.productPrice(); sc.productStock();
		 * System.out.println(sc.superMember);
		 */
		
		

	}

}
