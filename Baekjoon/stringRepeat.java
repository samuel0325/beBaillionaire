package Baekjoon;

import java.util.Scanner;

public class stringRepeat {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int howmany = kb.nextInt();
		for (int i = 0; i < howmany; i++) {
			int repeat = kb.nextInt();
			String start = kb.next();
			for (int j = 0; j < start.length(); j++) {
				int count = 0;
				while (count != repeat) {
					System.out.print(start.charAt(j));
					count++;
				}
				if (j == start.length() - 1) {
					System.out.println("");
				}
			}
		}
		kb.close();
	}// 2020-02-17 16:02 start
}// 2020-02-17 16:25 done
