import java.util.Locale;
import java.util.Scanner;

public class P_05_Strings {
    public static void main(String[] args) {
//        String name = "Vedansh";
//        System.out.println(name);
//
//        String name1 = new String("Vedansh");
//        System.out.println(name1);

        //String is a class but can be used as data types
        //Strings are immutable and cannot be changed.

        int a = 10;
//        System.out.printf("%d\n",a);
//        System.out.format("%d\n",a);
//
//        Scanner sc = new Scanner(System.in);
//        String b= sc.nextLine();
//        System.out.println(b);


//        String Methods:

        String name = new String("Vedensh");
        float len = name.length();
        System.out.println(len);

        String newName= name.toLowerCase();
        System.out.println(newName);

        String nTrimmedString = "   vedansh   ";
        String b = nTrimmedString.trim();
        System.out.println(nTrimmedString);
        System.out.println(b);

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,7));

        System.out.println(name.replace('e','a'));
        System.out.println(name.replace("ansh","ant"));

        System.out.println(name.startsWith("V"));

        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("e"));
        System.out.println(name.indexOf("e",3));
        System.out.println(name.lastIndexOf("e"));

        System.out.println(name.equals("Vedensh"));
        System.out.println("\'"+name.equalsIgnoreCase("VedEnSh"));
    }
}
