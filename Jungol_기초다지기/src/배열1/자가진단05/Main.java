//문제
//1반부터 6반까지의 평균점수를 저장한 후 두 반의 반 번호를 입력받아 두 반 평균점수의 합을 출력하는 프로그램을 작성하시오.
//반별 평균점수는 초기값으로 1반부터 차례로 85.6 79.5 83.1 80.0 78.2 75.0으로 초기화하고 
//
//출력은 소수 두 번째 자리에서 반올림하여 소수 첫째자리까지 한다.
//
//
//입력 예
//1 3
//출력 예
//168.7

package 배열1.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] a = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int b = 0;
		int d = 0;
		double f = 0.0;
		double c = 0.0;

		b = sc.nextInt();
		d = sc.nextInt();
		
		if (b == 1) {
			c = a[0];
			switch (d) {
			case 2:
				f = a[1];
				break;
			case 3:
				f = a[2];
				break;
			case 4:
				f = a[3];
				break;
			case 5:
				f = a[4];
				break;
			case 6:
				f = a[5];
				break;
			}
		} else if (b == 2) {
			c = a[1];
			switch (d) {
			case 1:
				f = a[0];
				break;
			case 3:
				f = a[2];
				break;
			case 4:
				f = a[3];
				break;
			case 5:
				f = a[4];
				break;
			case 6:
				f = a[5];
				break;
			}
		} else if (b == 3) {
			c = a[2];
			switch (d) {
			case 1:
				f = a[0];
				break;
			case 2:
				f = a[1];
				break;
			case 4:
				f = a[3];
				break;
			case 5:
				f = a[4];
				break;
			case 6:
				f = a[5];
				break;
			}
		} else if (b == 4) {
			c = a[3];
			switch (d) {
			case 1:
				f = a[0];
				break;
			case 2:
				f = a[1];
				break;
			case 3:
				f = a[2];
				break;
			case 5:
				f = a[4];
				break;
			case 6:
				f = a[5];
				break;
			}

		} else if (b == 5) {
			c = a[4];
			switch (d) {
			case 1:
				f = a[0];
				break;
			case 2:
				f = a[1];
				break;
			case 3:
				f = a[2];
				break;
			case 4:
				f = a[3];
				break;
			case 6:
				f = a[5];
				break;
			}
		} else if (b == 6) {
			c = a[5];
			switch (d) {
			case 1:
				f = a[0];
				break;
			case 2:
				f = a[1];
				break;
			case 3:
				f = a[2];
				break;
			case 4:
				f = a[3];
				break;
			case 5:
				f = a[4];
				break;
			}
		}

		System.out.println(c + f);
	}
}