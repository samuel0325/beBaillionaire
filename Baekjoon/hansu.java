package Baekjoon;

import java.util.Scanner;

public class hansu {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int number = kb.nextInt();
		System.out.println(FindHansu(number));
		kb.close();
	}
	static int FindHansu(int hansu){
		if(hansu<100){
			return hansu;
		}else{
			int count = 0;
			for(int i=100;i<=hansu;i++){
				int a = i/100;
				int b = (i-a*100)/10;
				int c = (i-a*100-b*10);
				if((a-b)==(b-c)){
					count++;
				}
			}
			return 99+count;
		}
	}//2020-02-10 20:22 start
}//2020-02-10 20:44 done

