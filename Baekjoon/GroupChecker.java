package Baekjoon;

import java.util.Scanner;

public class GroupChecker {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int howmany = kb.nextInt();
		int count = howmany;
		for (int i = 0; i < howmany; i++) {
			String group = kb.next();
			boolean[] alphabet = new boolean[26];
			for (int j = 1; j < group.length(); j++) {
				if (group.charAt(j - 1) != group.charAt(j)) {
					if (alphabet[group.charAt(j) - 97] == true) {
						count--;
						break;
					}
					alphabet[group.charAt(j - 1) - 97] = true;
				}
			}
		}
		System.out.println(count);
		kb.close();
	}

	static int groupCheck(String word) {
		String check = word;
		if (check.charAt(0) != check.charAt(1)) {
		}
		return 0;
	}// 2020-02-24 19:02 start
}// 2020-02-24 20:15 done #1316
