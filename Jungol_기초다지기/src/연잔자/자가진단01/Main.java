//세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
//
//
//입력 예
//10 25 33
//출력 예
//sum : 68
//avg : 22
package 연잔자.자가진단01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0;
		int avg =0;
		int b = 0;
		for(int i =0; i<3; i++) {
			int a = sc.nextInt();
			b++; 
			sum += a;
			avg = sum /b; 
		}
		 System.out.printf("sum : %d" , sum);
		 System.out.println();
		 System.out.printf("avg : %d" , avg);
		 
		
	}

}
