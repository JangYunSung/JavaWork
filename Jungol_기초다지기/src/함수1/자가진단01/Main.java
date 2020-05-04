//문자열 "~!@#$^&*()_+|" 를 출력하는 함수를 작성하고 정수를 입력받아 입력받은 수만큼 함수를 호출하는 프로그램을 작성하시오.
//
// 
//
//*문자열을 잘 확인하세요.
//
//
//입력 예
//3
//출력 예
//~!@#$^&*()_+|
//~!@#$^&*()_+|
//~!@#$^&*()_+|
package 함수1.자가진단01;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String str = "~!@#$^&*()_+|";
	
	
	int a = sc.nextInt();
	
	
	for (int i = 1; i <= a; i++) {
		System.out.println(str);
	}
	
	
}
}
