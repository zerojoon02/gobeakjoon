package baekjoon.day1.prac3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputValue = bf.readLine().split(" ");
		int[] twoValue = new int[2];
		
		for(int k=0; k < inputValue.length; k++) {
			twoValue[k] = Integer.parseInt(inputValue[k]);
		}
		
		System.out.println(twoValue[0]+twoValue[1]);
		System.out.println(twoValue[0]-twoValue[1]);
		System.out.println(twoValue[0]*twoValue[1]);
		System.out.println(twoValue[0]/twoValue[1]);
		System.out.println(twoValue[0]%twoValue[1]);

	}

}
