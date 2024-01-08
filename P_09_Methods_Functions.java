public class P_09_Methods_Functions {

    static void calc(int a, int b){
        int c = a + b;
        System.out.print(c);
    }

    static int sum(int ...arr){
        int result = 0;
        for(int i = 0; i< arr.length;i++){
            result += arr[i];
        }
        return result;
    }

    static void change(int [] arr){
        arr[0] = 98;
    }
    public static void main(String[] args){
//        P_09_Methods_Functions obj = new P_09_Methods_Functions();
//        obj.calc(3,2);

//        int [] array = {1,2,3,4,5};
//        change(array);
//        System.out.print(array[0]);

        // VAR ARGS:

        int a = sum(5,5,5,5,5);
        System.out.println(a);


    }
}
