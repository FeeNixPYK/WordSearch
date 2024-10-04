package project_1;

import java.util.Scanner;
import java.util.Random;

public class Wordsearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random prob = new Random();
		
		System.out.println("Enter number of rows, number of columns and minimum word length: ");
		
		int row = input.nextInt();
		int col = input.nextInt();
		int wlength = input.nextInt();
		
		char[] vowels = {'A','E','I','O','U'};
		char[] consonants = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		
		for(int i=0; i<row;i++) {
			for (int j=0; j<col; j++) {
				double chance = prob.nextDouble();
			}
		}
	}

}
