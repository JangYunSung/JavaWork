package 반복제어문1.형성평가02;

//문제
//0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
//
//0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
//
//홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
//
//
//입력 예
//9 7 10 5 33 65 0
//출력 예
//odd : 5
//even : 1
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int j = 0;
		while (true) {
			int num = sc.nextInt();
			if (num > 0) {
				if (num % 2 == 0) {
					i++;
				} else {
					j++;
				}
			} else {
				System.out.println("odd : " + j);
				System.out.println("even : " + i);
				break;
			}
		}
	}
}
