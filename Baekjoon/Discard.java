package Baekjoon;

import java.util.Scanner;

public class Discard {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int start = kb.nextInt();
		if(start==1){
			System.out.print(start);
		}else if(start==2){
			System.out.print(start);
		}else{
			int letmesee = start;
			int count=0;
			int gogo=1;
			while(letmesee != 0){
				letmesee = letmesee/2;
				count++;
			}
			for(int i=0; i<count-1;i++){
				gogo *=2;
			}
			if(start==gogo){
				System.out.println(start);
			}else{
			int answer = (start -gogo)*2;
			System.out.println(answer);
			}
		}
		kb.close();
	}//2020-02-17 15:11 start
}//2020-02-17 16:01 done
