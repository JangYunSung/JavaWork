//문제
//10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 출력하는 프로그램을 작성하시오.
//
//
//입력 예
//4
//출력 예
//JUNGOL​
//JUNGOL​
//JUNGOL​
//JUNGOL​
package 반복제어문2.형성평가01;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = "JUNGOL​";
		if (a <= 10) {for (int i = 0; i < a; i++)System.out.println(str);}
	}
}



//import java.util.*;
//
//public class Main {
// public static void main(String[] args) {    
//     int num, i;    
//     Scanner sc = new Scanner(System.in);
//     num = sc.nextInt();
//     for(i=0;i<num;i++) System.out.println("JUNGOL");
// }
//}