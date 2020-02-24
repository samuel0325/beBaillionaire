package Baekjoon;

import java.util.Scanner;

public class Sangsu {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String numbers = kb.nextLine();
		String[] number = numbers.split(" ");
		for(int i = 0; i<number.length; i++){
			int a = Integer.parseInt(number[i])/100;
			int b = (Integer.parseInt(number[i])-a*100)/10;
			int c = Integer.parseInt(number[i])%10;
			number[i] = Integer.toString(c*100+b*10+a);
		}
		if(Integer.parseInt(number[0])>Integer.parseInt(number[1])){
			System.out.println(number[0]);
		}else{
			System.out.println(number[1]);
		}
		kb.close();
	}//2020-02-21 12:00 start
}//2020-02-21 14:47 done #2908
