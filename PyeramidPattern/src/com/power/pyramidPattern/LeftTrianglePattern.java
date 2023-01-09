package com.power.pyramidPattern;

public class LeftTrianglePattern {
	public static void main(String args[]) {

		int i, j, row = 10;

		for (i = 1; i <= row; i++) {

			for (j = 1; j <= row; j++) {
				if (j <=row-i) { 
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println("");
		}

	}
}