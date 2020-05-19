package com.kh.collection.list.model.comparator;

import java.util.Comparator;

import com.kh.collection.list.model.vo.Book;

public class AscCategory implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		//ī�װ��� �������� ����
		if(obj1 instanceof Book && obj2 instanceof Book) {
			return ((Book)obj1).getCategory()-((Book)obj2).getCategory();
		}
		return 0;
	}


}
