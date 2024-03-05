package baekjoon.day2.prac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(bf.readLine()); 

		if(score%4 == 0 && score%100 != 0) {
			System.out.println("1");
		}else if(score%400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}

/*
# sorohen, 2753번 문제
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int result = 0;
        if((year%100!=0 && year%4 ==0) || year%400==0){
            result = 1;
        }
        System.out.println(result);
    }
}
*/
