class employee{
    int id;
    float salary;
    String name;

    //Class with Methods:
    public void printDetails(){
        System.out.println("My name is "+ name);
        System.out.println("My ID is "+ id);
        System.out.println("My salary is "+ salary);
    }

    public float getSalary(){
        return salary;
    }
}

class square{
    float side;
    public void area (){
        System.out.println("Area is "+ this.side*this.side);
    }
    public void perimeter(){
        System.out.println("Perimeter is " + 4*this.side);
    }
}


public class P_11_OOPS_1 {
    public static void main(String [] args){

//        OOPS, CONCEPTS/ TERMINOLOGIES:
//
//        Class  -> A class is a blueprint for creating objects.
//
//        Object -> A object is an instantiation of a class.
//                  Memory is allocated only after object instantiation.
//
//        Abstraction -> Hiding internal details.(Show only essential info)
//
//        Encapsulation -> The act of putting various components together in a capsule.
//                         Eg: Laptop.
//
//        Inheritance -> The act of deriving new things from existing new things.
//
//        Polymorphism -> One entity but many forms.

//        Objects in OOPS = Attributes + Methods.


        employee vedansh = new employee(); // Instantiating a new employee object.
        employee john = new employee();

        //Setting Attributes:
        vedansh.id = 1;
        vedansh.name = "Vedansh Maheshwari";
        vedansh.salary = 200000f;
        john.id = 2;
        john.name = "John Bhatt";
        john.salary = 100000f;

//      Printing the Details:
//        System.out.println("My name is "+ vedansh.name);
//        System.out.println("My ID is "+ vedansh.id);

        vedansh.printDetails();
        john.printDetails();


        square sq = new square();
        sq.side = 2f;
        sq.area();
        sq.perimeter();

    }
}


