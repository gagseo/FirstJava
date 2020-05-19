package socket.prac01.run;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import socket.prac01.model.Book;

public class BookdatMaker {

	public static void main(String[] args) {

		Book b = new Book("�ظ�����", 50000);
		// �� Book�����͸� ������ book.dat ������
		// �ش� ������Ʈ ��� �Ʒ��� ������ּ���.
		// �� ��Ʈ���� �ڵ� ���� �ǰԲ� ó�����ּ���.(try with resource �� Ȱ��)

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("books.dat"));) {

			os.writeObject(b);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
