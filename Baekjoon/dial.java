package Baekjoon;

import java.util.Scanner;

public class dial {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String word = kb.nextLine();
		int sum=0;
		int[] letter = new int[26];
		for(int i=0;i<26; i++){
			letter[i] = 0;
		}
		for(int i=0; i<word.length(); i++){
			letter[((int)(word.charAt(i)))-65]++;
		}
		for(int i=0;i<26; i++){
			if(i<3){
			sum += letter[i]*(2);
			}else if(i>2&&i<6){
				sum += letter[i]*(3);
			}else if(i>5&&i<9){
				sum += letter[i]*(4);
			}else if(i>8&&i<12){
				sum += letter[i]*(5);
			}else if(i>11&&i<15){
				sum += letter[i]*(6);
			}else if(i>14&&i<18){
				sum += letter[i]*(7);
			}else if(i>17&&i<21){
				sum += letter[i]*(8);
			}else if(i>20&&i<24){
				sum += letter[i]*(9);
			}else if(i>23&&i<27){
				sum += letter[i]*(10);
			}
		}
		System.out.println(sum);
		
		
		kb.close();
	}//2020-02-21 15:05 start
}//2020-02-21 15:36 done #5622
