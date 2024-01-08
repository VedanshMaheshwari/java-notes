import java.util.Scanner;

public class P_10_Recursion {

    static int factorial(int a){
        if(a == 0 || a == 1){
            return 1;
        }
        else {
            return(a * factorial(a-1));
        }
    }

    static int fibo(int a){
        if(a == 0){
            return 0;
        } else if (a==1) {
            return 1;
        }else {
            return(a + fibo(a-1));
        }
    }

    public static void main(String[] args){
        int a = factorial(4);
        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        System.out.println(fibo(b));

    }
}
