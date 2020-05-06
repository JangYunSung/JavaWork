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

		int a = sc.nextInt();
		int j = 0;
		for (int i = a; i > 0; i--) {
			
			for (j = i; j >= 0; j-=2) {
				System.out.print("*");
			
			
			}
			System.out.println();
		}
//
////				if (j % 2 == 1) {
////				}else {
////					System.out.print("*");
////				}

	}

}
