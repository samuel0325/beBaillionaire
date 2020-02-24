package Baekjoon;

import java.util.Scanner;

public class Croatia {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String croatia = kb.nextLine();
		int count = 0;
		for (int i = 0; i < croatia.length(); i++) {
			if (croatia.charAt(i) == 'c') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == '=') {
						count++;
						i = i + 1;
					} else if (croatia.charAt(i + 1) == '-') {
						count++;
						i = i + 1;
					} else { // c 뒤에 먼가 더 있을 때
						count++;
					}
				} else { // 마지막 글자일때
					count++;
				}
			} else if (croatia.charAt(i) == 'd') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == '-') {
						count++;
						i = i + 1;
					} else if (croatia.charAt(i + 1) == 'z') {
						if ((i + 2) < croatia.length()) {
							if (croatia.charAt(i + 2) == '=') {
								count++;
								i = i + 2;
							} else {//dz까지만 맞을때
								count++;
							}
						} else {//dz까지 맞고 마지막일때
							count++;
						}
					} else { //마지막 글자가 아닐 때
						count++;
					}
				} else {// 마지막 글자일 때
					count++;
				}
			} else if (croatia.charAt(i) == 'l') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == 'j') {
						count++;
						i = i + 1;
					} else {// 마지막 글자가 아닐때
						count++;
					}
				} else { // 마지막 글자일때
					count++;
				}
			} else if (croatia.charAt(i) == 'n') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == 'j') {
						count++;
						i = i + 1;
					} else {// 마지막 글자가 아닐 때
						count++;
					}
				} else {// 마지막 글자일 때
					count++;
				}
			} else if (croatia.charAt(i) == 's') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == '=') {
						count++;
						i = i + 1;
					} else { // 마지막 글자가 아닐 때
						count++;
					}
				} else {// 마지막 글자일 때
					count++;
				}
			} else if (croatia.charAt(i) == 'z') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == '=') {
						count++;
						i = i + 1;
					} else {// 마지막 글자가 아닐때
						count++;
					}
				} else {// 마지막 글자일때
					count++;
				}
			} else {// 다른 글자일때
				count++;
			}
		}
		System.out.println(count);
		kb.close();
	}// 2020-02-23 20:58 start
}// 2020-02-24 11:50 done #2941