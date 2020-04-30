package 배열1.자가진단04;

//문제
//100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다
//0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
//
//입력 예
//3 5 10 55 0
//출력 예
//55 10 5 3
import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] a = new int [100];
	int b= 0;
	int i , j = 0 ;
	for (i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
		b++;
		if(a[i]== 0) {
			break;
		} 
	}
		for (j = b-1; j > 0; j--) {
		System.out.println(a[j-1]);
		}
				
	}
}

