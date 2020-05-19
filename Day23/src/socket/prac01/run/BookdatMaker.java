package socket.prac01.run;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import socket.prac01.model.Book;

public class BookdatMaker {

	public static void main(String[] args) {

		Book b = new Book("해리포터", 50000);
		// 이 Book데이터를 저장한 book.dat 파일을
		// 해당 프로젝트 경로 아래에 만들어주세요.
		// 단 스트림은 자동 종료 되게끔 처리해주세요.(try with resource 문 활용)

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("books.dat"));) {

			os.writeObject(b);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
