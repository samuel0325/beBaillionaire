package Baekjoon;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int howmany = kb.nextInt();
		kb.nextLine();
		String numbers = kb.nextLine();
		int findout = 0;
		for(int i =0; i<howmany; i++){
			findout += numbers.charAt(i)-'0';
		}
		System.out.println(findout);
		kb.close();
	}//2020-02-17 13:34 start
}//2020-02-17 14:00 done
