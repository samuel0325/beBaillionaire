package Baekjoon;

import java.util.Scanner;

public class CacaoDoll {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int howmany = kb.nextInt();
		int k = kb.nextInt();
		double[] dolls = new double[howmany];
		for(int i=0; i<howmany; i++){
			dolls[i] = kb.nextDouble();
		}
		double variance =Double.MAX_VALUE;
		int start = k;
		while(start<=howmany){
			for(int i=0; i<=howmany-start; i++){
				double m = 0;
				for(int j = i; j<i+start; j++){
					m += dolls[j];
				}
				m = m/start;
				double v = 0;
				for(int j=i;j<i+start;j++){
					v+=(dolls[j]-m)*(dolls[j]-m);
				}
				v = v/start;
				variance = Math.min(variance, v);
			}
			start++;
		}
		double deviation = Math.sqrt(variance);
		System.out.println(deviation); //표준편차
		kb.close();
	}
} //2020-03-10 15:01 done
