package com.kh.object.objectarr;

import com.kh.object.encapsulation.KookBabDreeper;

public class Objectarr {

	public void objectArr() {

		// 국밥드리퍼 '배열' 만들기
		KookBabDreeper kbd1 = new KookBabDreeper("치킨", 15000);
		KookBabDreeper kbd2 = new KookBabDreeper("피자", 20000);
		KookBabDreeper kbd3 = new KookBabDreeper("방어회", 50000);
		KookBabDreeper[] kbd = new KookBabDreeper[] { kbd1, kbd2, kbd3 };

		// 위 4줄과 아래줄 한줄이 같음
		// KookBabDreeper[] kbd = new KookBabDreeper[] {KookBabDreeper("치킨", 15000), new
		// KookBabDreeper("피자", 20000),KookBabDreeper("방어회", 50000) };

		// kbd[0] = new KookBabDreeper("치킨", 15000);
		// kbd[1] = new KookBabDreeper("피자", 20000);
		// kbd[2] = new KookBabDreeper("방어회", 50000);

		for (int i = 0; i < kbd.length; i++) {
			kbd[i].dreep();
		}

	}

}
