package com.kh.object.objectarr;

import com.kh.object.encapsulation.KookBabDreeper;

public class Objectarr {

	public void objectArr() {

		// ����帮�� '�迭' �����
		KookBabDreeper kbd1 = new KookBabDreeper("ġŲ", 15000);
		KookBabDreeper kbd2 = new KookBabDreeper("����", 20000);
		KookBabDreeper kbd3 = new KookBabDreeper("���ȸ", 50000);
		KookBabDreeper[] kbd = new KookBabDreeper[] { kbd1, kbd2, kbd3 };

		// �� 4�ٰ� �Ʒ��� ������ ����
		// KookBabDreeper[] kbd = new KookBabDreeper[] {KookBabDreeper("ġŲ", 15000), new
		// KookBabDreeper("����", 20000),KookBabDreeper("���ȸ", 50000) };

		// kbd[0] = new KookBabDreeper("ġŲ", 15000);
		// kbd[1] = new KookBabDreeper("����", 20000);
		// kbd[2] = new KookBabDreeper("���ȸ", 50000);

		for (int i = 0; i < kbd.length; i++) {
			kbd[i].dreep();
		}

	}

}
