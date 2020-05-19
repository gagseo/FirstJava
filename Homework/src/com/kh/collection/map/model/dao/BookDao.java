package com.kh.collection.map.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.map.model.vo.Book;

public class BookDao {

	private HashMap<String, Book> bookMap;
	ArrayList<Book> list = new ArrayList<Book>();

	public BookDao() {
		bookMap = new HashMap<String, Book>();
	}

	public BookDao(HashMap<String, Book> map) {
		bookMap = map;
	}

	public int getLastBookNo() {

		// ����Ʈ ������ ������ȣ ����
		// Iterator, keyset()����
		// ù ���� ��� 0���� �޾ƿ��Բ� BookDao�� getLastBookNo() ���� ���� �� ��!

		// ������ȣ ���ڸ��� ���� ����
		int bNo;
		String key = null;
		// Map�� �� �ִ� �͵� �� ������ key ���� �����;� ��
		Set set = bookMap.keySet();
		Iterator it = set.iterator();

		// keySet���� bookMap�� ���� ��ü ������
		while (it.hasNext()) {
			key = String.valueOf(it.next());
		}
		// Iterator�� ���� ���� ���� ������ ���鼭 key���� ������ ����, �װ� valueOf�� String�� ����
		// ��ü ���� �Ϳ��� ������ ��ȣã��
		// �ٵ� ù���� ���, getbNo�� 0

		if (key == null) {
			bNo = 0;
			// key ������ ���� ������ null�� �����̹Ƿ� 0
		} else {
			// bookMap �� key�� �ش��ϴ� Ű������ ������ȣ�� ������ �ͼ�
			// int������ ��ȯ
			bNo = Integer.parseInt(bookMap.get(key).getbNo());
			// �ϳ��� �ø�
			bNo++;

		}

		return bNo;

	}

	public void addBook(Book book) {
		bookMap.put(book.getbNo(), book);
	}

	public Book deleteBook(String key) {

		// keyset()���� ���޹��� ������ȣ�� ��ġ�ϴ� ��������
		// ���� �� ��ü ����

		Book deleteBook = null;
		String cKey = "";

		// keySet���� bookMap�� key �̱�
		// set���� iterator ������ �Ű������� ���� key�� �´� �� ã��
		Set set = bookMap.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {

			cKey = String.valueOf(it.next());

			// ������ �ִٸ� ����
			if (bookMap.get(key).getbNo().equals(bookMap.get(cKey).getbNo())) {

				bookMap.remove(cKey);
			}
		}

		deleteBook = bookMap.get(cKey);

		return deleteBook;

	}

	public String searchBook(String title) {

		// entryset() �̿��ؼ� ���޹��� ���� �����ϴ�
		// bookmap �� key �� ����

		String select = "";

		Set entrySet = bookMap.entrySet();
		Iterator itEntry = entrySet.iterator();

		while (itEntry.hasNext()) {
			Map.Entry<String, Book> entry = (Entry<String, Book>) itEntry.next();
			if (entry.getKey().contains(title)) {
				select = entry.getKey();
			}
		}

		return select;

	}

	public Book selectBook(String key) {

		return bookMap.get(key);

	}

	public HashMap<String, Book> selectAll() {

		return (HashMap<String, Book>) bookMap;

	}

	public ArrayList<Book> sortedBookList() {

		ArrayList<Book> bList = new ArrayList<Book>();

		Set Set = bookMap.entrySet();
		Iterator it = Set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, Object> entry = (Entry<String, Object>) it.next();

			bList.add((Book) entry.getValue());
		}
		Collections.sort(bList);
		for (int i = 0; i < bList.size(); i++) {
			bList.get(i);
		}

		return bList;

	}
}
