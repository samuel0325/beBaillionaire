package Baekjoon;

import java.util.Scanner;

public class NOno {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		long min = kb.nextLong();
		long max = kb.nextLong();
		int end = ((int) Math.sqrt(max));
		boolean[] check = new boolean[1000001];
		for (int i = 0; i < 1000001; i++) {
			check[i] = false;
		}
		for (long i = 2; i <= end; i++) {
			long square = i * i;
			long start = ((min - 1) / square + 1) * square;
			for (long a = start; a <= max; a += square) {
				System.out.println(a);
				System.out.println(a - min);
				System.out.println((int) (a - min));
				System.out.println("");
				check[(int) (a - min)] = true;
			}
		}
		int count = 0;
		for (int i = 0; i < (max - min + 1); i++) {
			if (check[i] == true) {
				count += 1;
			}
		}
		System.out.print(max - min - count + 1);
		System.out.print((int) (4 - 6));
		kb.close();
	}// 2020-02-17 17:00 start
}// 2020-02-17 21:40 done fucked