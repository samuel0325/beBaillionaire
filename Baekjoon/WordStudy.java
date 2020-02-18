package Baekjoon;

import java.util.Scanner;

public class WordStudy {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String word = kb.nextLine();
		int[] alphabet = new int[26];
		boolean[] check = new boolean[26];
		for(int i=0; i<26; i++){
			alphabet[i] = 0;
			check[i]=true;
		}
		for(int i=0; i<word.length();i++){
			int j = (int)word.charAt(i);
			if(j>96){
			 alphabet[j-97]++;
			}else{
				alphabet[j-65]++;
			}
		}
		int max=0;
		int maxNumber=-1;
		boolean realCheck = true;
		for(int i=0; i<26; i++){
			if(max<alphabet[i]){
				max = alphabet[i];
				if(maxNumber!=-1){
					check[maxNumber] = true;
				}
				maxNumber = i;
				check[i]=false;
				realCheck = true;
			}else if(max!=0 && max==alphabet[i]){
				realCheck = false;
				maxNumber = i;
				check[i]=false;
			}
		}
		if(realCheck==false){
			System.out.println("?");
		}else{
			System.out.println((char)(maxNumber+65));
		}
		
		kb.close();
	}//2020-02-18 20:00 start
}//2020-02-18 20:38 done #1157
