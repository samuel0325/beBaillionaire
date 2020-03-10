package Baekjoon;

import java.util.Scanner;

public class Backpack {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int howmany = kb.nextInt();
		int totalWeight = kb.nextInt();
		stuff[] musthave = new stuff[howmany+1];
		for (int i = 1; i <= howmany; i++) {
			musthave[i]=new stuff(kb.nextInt(),kb.nextInt());
		}
		int[][] dp = new int[howmany+1][totalWeight+1];
		for(int i=1; i<=howmany;i++){
			for(int j=1; j<=totalWeight;j++){
				dp[i][j] = dp[i-1][j];
				if(j-musthave[i].weight>=0){
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-musthave[i].weight]+musthave[i].value);
				}
			}
		}
		System.out.println(dp[howmany][totalWeight]);
		kb.close();
	}
}

class stuff {
	int weight;
	int value;

	stuff(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}//2020-02-24 21:00 start
}//2020-02-26 13:20 done #12865
