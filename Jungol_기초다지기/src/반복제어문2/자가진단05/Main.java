package 반복제어문2.자가진단05;

import java.util.Scanner;

//문제
//10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
//
//
//입력 예
//10 15 36 99 100 19 46 88 87 13
//출력 예
//Multiples of 3 : 4
//Multiples of 5 : 3
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] a = new int[10];
		 int b = 0;
		 int c = 0;
		 int d = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			d = a[i];
			
			if(d % 3 ==0 && d % 5 ==0) {
				b++; c++;
			}else if(d % 3 == 0) {
				b++;
			}else if (d % 5 == 0) {
				c++;
			}
		}
		System.out.println("Multiples of 3 :" + b);
		System.out.println("Multiples of 5 :" + c);
		
		

	}

}
