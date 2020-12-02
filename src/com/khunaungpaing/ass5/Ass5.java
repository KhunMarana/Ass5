package com.khunaungpaing.ass5;

public class Ass5 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			int num = 1;
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i*2; k++) {
				System.out.print(num);
				num++;
			}

			System.out.println();
		}
	}
}
