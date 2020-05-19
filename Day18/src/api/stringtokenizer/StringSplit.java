package api.stringtokenizer;

import java.util.StringTokenizer;

public class StringSplit {

	public void split() {

		StringTokenizer st = new StringTokenizer("this is a test", "t", true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("---------------------------");

		String test = "boo:and?foo*doo";
		st = new StringTokenizer(test,":?*");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("------------split---------------");
		String[] result = test.split("[:?*]");
		for (int x = 0; x < result.length; x++) {
			System.out.println(result[x]);
		}
			

		System.out.println("---------------------------");

		// String[] result = "this is a test".split("\\s");
		// for (int x = 0; x < result.length; x++)
		// System.out.println(result[x]);

	}

}
