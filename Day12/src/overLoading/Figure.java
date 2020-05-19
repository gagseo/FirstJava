package overLoading;

public class Figure {

	public void area(Rectangle r) {
		System.out.println("사각형");
		System.out.println("가로 = " + r.getWidth());
		System.out.println("세로 = " + r.getHeight());
		System.out.println("사각형의 넓이 = " + r.getWidth() * r.getHeight());
	}

	public void area(Circle c) {
		System.out.println("원");
		System.out.println("반지금 = " + c.getRadius());
		System.out.println("원의 넓이 = " + c.getRadius() * c.getRadius() * Math.PI);

		// 메소드이름이 같은 area여도 안에 매개변수가 다르기 때문에 오류가 나지 않고있다.
	}
}
