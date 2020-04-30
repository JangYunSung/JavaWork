package 반복제어문2.자가진단04;




import java.util.Scanner;
public class Main {
// 100이하의 정수 n 부터 100까지의 합 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt(); 
        int b = 101-a; 
        int[] num = new int [b]; 
        int sum =0;
        for (int i =a ; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);
         
         
     
        }
         
         
        }