package Baekjoon;

import java.util.Scanner;

public class numberofWord {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String words = kb.nextLine().trim();
		String[] word = words.split(" ");
		System.out.println(140*24);
		System.out.println(3360-2800);
		System.out.println(560/12);
		if(words.isEmpty()){
			System.out.println(0);
		}
		else{
		System.out.println(word.length);
		}
		kb.close();
	}//2020-02-20 15:48 start
}//2020-02-20 17:12 done #1152
