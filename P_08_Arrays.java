import java.util.Scanner;
import java.util.SplittableRandom;

public class P_08_Arrays {
    public static void main(String[] args){
////        TAKING INPUT:
//        Scanner sc = new Scanner(System.in);
//        int [] marks = new int [5];
//
//        for(int i=0;i<5;i++){
//            System.out.printf("Enter your %d number",i+1);
//            marks[i] = sc.nextInt();
//        }
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//
//        System.out.println(marks.length);
//        String [] names = new String[3];
//
//        for(int i=0;i< names.length;i++){
//            System.out.printf("Enter your %d name: ",i+1);
//            names[i] = sc.next();
//        }
//        for(int i= names.length-1;i>=0;i--){
//            System.out.println(names[i]);
//        }
//
//        //FOR-EACH loop (simplily the syntax)
//
//        for(String a: names){
//            System.out.println(a);
//        }

        //MULTI-DIMENTIONAL ARRAY:

        int flats [][];
        flats = new int[2][4];

        for (int i = 0;i<2; i++){
            for (int j = 0; j<3;j++){
                Scanner sc = new Scanner(System.in);
                flats[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<2; i++){
            for (int j = 0; j<3;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
//        System.out.print(flats[0][0]);
//        System.out.print(flats[0][1]);
//        System.out.print(flats[0][2]);
//        System.out.print(flats[1][0]);
//        System.out.print(flats[1][1]);
//        System.out.print(flats[1][2]);


    }
}
