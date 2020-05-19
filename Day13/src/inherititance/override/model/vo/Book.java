package inherititance.override.model.vo;

//�������̵�
//�ڽ� Ŭ������ ��ӹ��� �θ� Ŭ������ �޼ҵ带 ������ �ϴ� ��.

//�������̵� ���� ����
//�޼ҵ�� ����
//�Ű����� ����, Ÿ�� ����
//��ȯ�� ����
//�� ���������ڴ�, �θ𺸴� ���ų� ���� ������ ������ �� ����. (���� �����δ� �ȵȴ�.)

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

	@Override // ���콺 ��Ŭ�� > source > Generate toString Ŭ��
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	// @Override // ���콺 ��Ŭ�� > source > Generate hashCode() Ŭ��
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + ((author == null) ? 0 : author.hashCode());
	// result = prime * result + price;
	// result = prime * result + ((title == null) ? 0 : title.hashCode());
	// return result;
	// }

	@Override // ���콺 ��Ŭ�� > source > Generate equals() Ŭ��
	public boolean equals(Object obj) {

		// 1. ��ü�� �ּҰ� ������ ������ ������ �ʰ� true
		if (this == obj)
			return true;
		// 2. ���޹��� ��ü�� null�� ��� ���� �ʿ䰡 ���� ������ false
		if (obj == null)
			return false;
		// 3. ���޹��� ��ü�� ���� ��ü�� ���� Ŭ�������� Ȯ�� ��
		// Ŭ������ �ٸ��� ���� �ʿ䰡 ���� ������ false
		if (getClass() != obj.getClass())
			return false;

		// ���� �ʵ� �� ��
		Book other = (Book) obj;

		// �� �ν��Ͻ��� �۰��� null�ε�
		// �Ű������� �Ѿ�� �ν��Ͻ��� �۰��� null�� �ƴϸ� false
		if (author == null) {
			if (other.author != null)
				return false;
			// �Ѵ� ���� ������ ������ �񱳸� �Ѵ�����
			// �ٸ� ��쿡 false ��ȯ
		} else if (!author.equals(other.author))
			return false;
		// price�� ��� �⺻��������Ÿ���̱� ������ �ٷ� ��
		if (price != other.price)
			return false;
		// �� �ν��Ͻ��� ������ null�ε�
		// �Ű������� �Ѿ�� ������ null�� �ƴ϶�� false
		if (title == null) {
			if (other.title != null)
				return false;
			// �Ѵ� ���� �ִٸ� ���� ������
			// ���� �ٸ� ��쿡 false ��ȯ
		} else if (!title.equals(other.title))
			return false;

		return true;
	}

}
