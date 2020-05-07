//문제
//1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
//
//2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.​
//
//
//출력 예
// 2.1yd = 192.0cm
//10.5in =  26.7cm
package 입력.자가진단05;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	
	double yd = a * 91.44 ;
	double in = b * 2.54 ;
	
	
	System.out.printf(" 2.1yd = %3.1fcm \n10.5in =  %3.1fcm "  , yd , in);
	
}
}
