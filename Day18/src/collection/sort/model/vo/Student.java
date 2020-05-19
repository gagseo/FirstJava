package collection.sort.model.vo;

public class Student implements Comparable<Student> {

	private String name;
	private int point;

	public Student() {

	}

	public Student(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Student o) {

		// return o.getPoint() - point; // 오름차순
		return point - o.getPoint(); // 내림차순
	}

}
