package Baekjoon;

import java.util.Scanner;

public class Mcdonald {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] burger = new int[3];
		for (int i = 0; i < 3; i++) {
			burger[i] = kb.nextInt();
		}
		int[] softDrink = new int[2];
		for (int i = 0; i < 2; i++) {
			softDrink[i] = kb.nextInt();
		}
		int set = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			int cost = 0;
			cost += burger[i];
			cost += Math.min(softDrink[0], softDrink[1]);
			set = Math.min(cost, set);
		}
		System.out.println(set-50);
		kb.close();

	}

}// 2020-03-10 15:19 done
