package Baekjoon;

import java.util.Scanner;

public class sequenceSum {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int howmany = kb.nextInt();
		int[] sequence = new int[howmany + 1];
		int[] sequences = new int[howmany + 1];
		for (int i = 1; i <= howmany; i++) {
			sequence[i] = kb.nextInt();
		}
		int max = sequence[1];
		for (int i = 1; i <= howmany; i++) {
			// if(sequence[i]>sequences[i-1]+sequence[i]){
			// sequences[i] = sequence[i];
			// }else{
			// sequences[i] = sequences[i-1]+sequence[i];
			// }
			sequences[i] = Math.max(sequence[i], sequences[i - 1] + sequence[i]);
			max = Math.max(sequences[i], max);

			max = Math.max(sequences[i], max);
		}
		// for(int i=1; i<=howmany; i++){
		// if(max<sequences[i]){
		// max = sequences[i];
		// }
		// }
		System.out.println(max);
		kb.close();
	}// 2020-03-02 14:00 start
}// 2020-03-02 15:59 done #1912
