package poly.electronic.controller;

import poly.electronic.model.vo.Desktop;
import poly.electronic.model.vo.Electronic;
import poly.electronic.model.vo.NoteBook;
import poly.electronic.model.vo.Tablet;

public class YoogSan {

	// private Desktop desk = null;
	// private NoteBook note = null;
	// private Tablet tab = null;

	private Electronic[] elec = new Electronic[100];
	private int count = 0;
	// public void insert(Desktop d) {
	// System.out.println("����Ʈž �־����ϴ�.");
	// this.desk = d;
	// }
	//
	// public void insert(NoteBook n) {
	// System.out.println("��Ʈ�� �־����ϴ�.");
	// this.note = n;
	// }
	//
	// public void insert(Tablet t) {
	// System.out.println("�׺� �־����ϴ�.");
	// this.tab = t;
	// }
	//
	// public Desktop selectDesk() {
	// return this.desk;
	// }
	//
	// public NoteBook selectNoteBook() {
	// return this.note;
	// }
	//
	// public Tablet selectTablet() {
	// return this.tab;
	// }

	public void insert(Electronic anything) {

		System.out.println("���ڱ�� �ֽ��ϴ�.");
		elec[count] = anything;
		count++;
	}

	public Electronic[] select() {
		return elec;
	}
}
