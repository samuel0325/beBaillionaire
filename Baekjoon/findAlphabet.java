package Baekjoon;

import java.util.Scanner;

public class findAlphabet {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] alphabet = new int[26];
		for(int i=0;i<26;i++){
			alphabet[i] = -1;
		}
		String abc = kb.nextLine();
		for(int i=0; i<abc.length(); i++){
			int kuku = (abc.charAt(i)-'0')-49;
			if(alphabet[kuku]==-1){
				alphabet[kuku] = i;
			}
		}
		for(int i=0; i<26;i++){
			System.out.print(alphabet[i]);
			System.out.print(" ");
		}
		
		kb.close();
	}//2020-02-17 14:08 start
}//2020-02-17 14:27 done
