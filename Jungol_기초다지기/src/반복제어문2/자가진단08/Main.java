package 반복제어문2.자가진단08;

public class Main {
public static void main(String[] args) {
     
     
    for (int dan = 2; dan <=4; dan++) {
        for (int i = 0; i <=5; i++) {
        String str = dan+" * "+ (i+1) +" = "+ dan*(i+1)+"\t";
        System.out.print( i<=4 ? str : "\n" );
        }
    }
}
}