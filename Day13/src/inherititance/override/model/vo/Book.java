package inherititance.override.model.vo;

//오버라이딩
//자식 클래스가 상속받은 부모 클래스의 메소드를 재정의 하는 것.

//오버라이드 성립 조건
//메소드명 통일
//매개변수 개수, 타입 통일
//반환형 통일
//단 접근제한자는, 부모보다 같거나 넓은 범위로 지정할 수 있음. (좁은 곳으로는 안된다.)

public class Book {

	private String title;
	private String author;
	private int price;

	public Book() {

	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override // 마우스 우클릭 > source > Generate toString 클릭
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	// @Override // 마우스 우클릭 > source > Generate hashCode() 클릭
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + ((author == null) ? 0 : author.hashCode());
	// result = prime * result + price;
	// result = prime * result + ((title == null) ? 0 : title.hashCode());
	// return result;
	// }

	@Override // 마우스 우클릭 > source > Generate equals() 클릭
	public boolean equals(Object obj) {

		// 1. 객체의 주소가 같으면 실제값 비교하지 않고 true
		if (this == obj)
			return true;
		// 2. 전달받은 객체가 null인 경우 비교할 필요가 없기 때문에 false
		if (obj == null)
			return false;
		// 3. 전달받은 객체와 현재 객체가 같은 클래스인지 확인 후
		// 클래스가 다르면 비교할 필요가 없기 때문에 false
		if (getClass() != obj.getClass())
			return false;

		// 이제 필드 값 비교
		Book other = (Book) obj;

		// 이 인스턴스의 작가가 null인데
		// 매개변수로 넘어온 인스턴스의 작가가 null이 아니면 false
		if (author == null) {
			if (other.author != null)
				return false;
			// 둘다 값이 있으면 같은지 비교를 한다음에
			// 다른 경우에 false 반환
		} else if (!author.equals(other.author))
			return false;
		// price의 경우 기본형데이터타입이기 때문에 바로 비교
		if (price != other.price)
			return false;
		// 이 인스턴스의 제목이 null인데
		// 매개변수로 넘어온 제목이 null이 아니라면 false
		if (title == null) {
			if (other.title != null)
				return false;
			// 둘다 값이 있다면 비교한 다음에
			// 값이 다른 경우에 false 반환
		} else if (!title.equals(other.title))
			return false;

		return true;
	}

}
