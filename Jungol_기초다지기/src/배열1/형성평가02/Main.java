//문제
//5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
//
//
//입력 예
//15 20 33 10 9
//출력 예
//57
package 배열1.형성평가02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int [] a = new int [5];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if(i%2==0) {
				sum += a[i]; 
			}
		}
		System.out.println(sum);
		
		
		
		
		
	}

}
