//문제
//자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
//
//
//입력 예
//3
//출력 예
//*****
// ***
//  *
package 반복제어문3.자가진단05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 3;
		int j = 0;
		int b = 0;
		for (int i = a; i > 0; i--) {
			if(b!=0) {
			for (int k = b; k > 0;) {
				System.out.print(" ");
			}
			for (j = i + 2; j > 0; j--) {
				System.out.print("*");	
			}
			System.out.println();
				
			
			b++;
		}
			
		}

	}
}
