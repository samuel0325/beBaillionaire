package Baekjoon;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = kb.nextInt();
		System.out.println(Calculate(num));
		int num2 = kb.nextInt();
		System.out.println(recursive(num2));

		
		kb.close();
	}
	static int Calculate(int num){
		int a=1;
		if(num==0){
			return a;
		}else{
			for(int i=1;i<num+1;i++){
				a = a*i;
			}	
			return a;
		}
	}
	static int recursive(int num){
		int a=1;
		if(num==0){
			return 1;
		}else{
			a=num*recursive(num-1);
		}
		return a;
	}		//2020-02-03 21:05 start
}	  //2020-02-03 21:25 done	
