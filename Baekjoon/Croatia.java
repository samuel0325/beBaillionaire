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
					} else { // c �ڿ� �հ� �� ���� ��
						count++;
					}
				} else { // ������ �����϶�
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
							} else {//dz������ ������
								count++;
							}
						} else {//dz���� �°� �������϶�
							count++;
						}
					} else { //������ ���ڰ� �ƴ� ��
						count++;
					}
				} else {// ������ ������ ��
					count++;
				}
			} else if (croatia.charAt(i) == 'l') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == 'j') {
						count++;
						i = i + 1;
					} else {// ������ ���ڰ� �ƴҶ�
						count++;
					}
				} else { // ������ �����϶�
					count++;
				}
			} else if (croatia.charAt(i) == 'n') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == 'j') {
						count++;
						i = i + 1;
					} else {// ������ ���ڰ� �ƴ� ��
						count++;
					}
				} else {// ������ ������ ��
					count++;
				}
			} else if (croatia.charAt(i) == 's') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == '=') {
						count++;
						i = i + 1;
					} else { // ������ ���ڰ� �ƴ� ��
						count++;
					}
				} else {// ������ ������ ��
					count++;
				}
			} else if (croatia.charAt(i) == 'z') {
				if ((i + 1) < croatia.length()) {
					if (croatia.charAt(i + 1) == '=') {
						count++;
						i = i + 1;
					} else {// ������ ���ڰ� �ƴҶ�
						count++;
					}
				} else {// ������ �����϶�
					count++;
				}
			} else {// �ٸ� �����϶�
				count++;
			}
		}
		System.out.println(count);
		kb.close();
	}// 2020-02-23 20:58 start
}// 2020-02-24 11:50 done #2941