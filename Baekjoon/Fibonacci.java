package Baekjoon;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		long[] fiboNum = new long[91];
		for(int i=0; i<91;i++){
			fiboNum[i] = -3;
		}
		fiboNum[0] = 0;
		fiboNum[1] = 1;
		int what = kb.nextInt();
		System.out.println(gofibo(fiboNum, what));
		
		kb.close();
	}
	static long gofibo(long[] aa, int a){
		long num1=0;
		long num2=0;
		if(a==1){
			return 1;
		}else if(a==0){
			return 0;
		}else{
			if(aa[a-1]==-3){
				num1 = gofibo(aa, a-1);
				aa[a-1] = num1;
			}else{
				num1 = aa[a-1];
			}
			if(aa[a-2]==-3){
				num2 = gofibo(aa, a-2);
				aa[a-2] = num2;
			}else{
				num2 = aa[a-2];
			}
		}
		
		
		return (num1+num2);
	}
}//2020-03-10 16:53 done
