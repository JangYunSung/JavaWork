//문제
//자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
//주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
//
//
//입력 예
//3
//출력 예
//*****
// ***
//  *
// ***
//*****
package 반복제어문3.형성평가04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
		for (int i = num+2 ; i > 0; i-=2) {
			if(i%2 !=0) {
			for (int k = 0; k < num-i+1; k+=2) {
				System.out.print("!");
			}
			
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
				System.out.println();
			}
			
		}
	
		}
	}
















