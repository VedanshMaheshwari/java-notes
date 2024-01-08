import java.util.Scanner;

public class P_06_ifelse_switch {
    public static void main(String[] args) {
        String option;
        Scanner sc = new Scanner(System.in);
        option = sc.next();
        switch (option){
            case "b" :
                System.out.println("Option is b");
                break;

            case "a":
                System.out.println("Option is a");
                break;
            default:
                System.out.println("Pagal hai kya bey");
        }
    }
}
