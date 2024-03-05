package baekjoon.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 0x01강 시간복잡도와 기초지식 연습문제
// O(n) > for문 중첩 앵간치 해라... 함수 쓸 때 쫌 빠른 거 써라

public class hello {

	public static void main(String[] args) throws IOException {
		//두 정수 입력받아서, A+B 출력해라.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputValue = bf.readLine().split(" ");
		
		int result = 0;
		
		for(String j : inputValue) {
			result += Integer.parseInt(j);
		}
		
		System.out.println(result);
	}

}
