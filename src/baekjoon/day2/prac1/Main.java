package baekjoon.day2.prac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] score = bf.readLine().split(" ");
		int[] num = new int[3];
		int index = 0;
		
		for(String j : score) {
			num[index] = Integer.parseInt(j);
			index += 1;
		}
		
		Arrays.sort(num);
		
		for(int k=0; k<num.length; k++) {
			System.out.print(num[k] + " ");
		}
		
	}

}
